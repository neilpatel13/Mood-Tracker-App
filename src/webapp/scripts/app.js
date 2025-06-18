document.addEventListener('DOMContentLoaded', function() {
    const moodSlider = document.getElementById('mood-slider');
    const moodValueDisplay = document.getElementById('mood-value');
    const noteInput = document.getElementById('note-input');
    const submitButton = document.getElementById('submit-button');
    const moodEntriesContainer = document.getElementById('mood-entries');

    moodSlider.addEventListener('input', function() {
        moodValueDisplay.textContent = moodSlider.value;
    });

    submitButton.addEventListener('click', function() {
        const moodEntry = {
            moodValue: moodSlider.value,
            note: noteInput.value
        };

        fetch('/api/moods', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(moodEntry)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Mood entry submitted:', data);
            noteInput.value = ''; // Clear the note input
            fetchMoodEntries(); // Refresh the mood entries list
        })
        .catch(error => {
            console.error('Error submitting mood entry:', error);
        });
    });

    function fetchMoodEntries() {
        fetch('/api/moods')
        .then(response => response.json())
        .then(data => {
            moodEntriesContainer.innerHTML = ''; // Clear existing entries
            data.forEach(entry => {
                const entryDiv = document.createElement('div');
                entryDiv.textContent = `Mood: ${entry.moodValue}, Note: ${entry.note}`;
                moodEntriesContainer.appendChild(entryDiv);
            });
        })
        .catch(error => {
            console.error('Error fetching mood entries:', error);
        });
    }

    fetchMoodEntries(); // Initial fetch of mood entries
});
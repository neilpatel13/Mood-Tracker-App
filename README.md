# Mood Tracker App

## Overview
The Mood Tracker App is a simple web application that allows users to track their mood on a daily basis. Users can select their mood using a slider that represents different emotional states through images of faces. Additionally, users have the option to add notes to document their feelings or experiences for the day. All entries are stored in a database, and users can view their recorded moods at any time.

## Features
- Mood selection via a slider
- Optional note-taking feature
- Submission of mood entries to a database
- Viewing of all recorded mood entries

## Technologies Used
- HTML/CSS for the front-end
- Java with Spring Boot for the back-end
- MySQL for the database

## Project Structure
```
MOOD-TRACKER-APP
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── moodtracker
│   │   │           ├── App.java
│   │   │           ├── controller
│   │   │           │   └── MoodController.java
│   │   │           ├── model
│   │   │           │   └── MoodEntry.java
│   │   │           └── dao
│   │   │               └── MoodDao.java
│   │   └── resources
│   │       └── application.properties
│   └── webapp
│       ├── index.html
│       ├── styles
│       │   └── style.css
│       └── scripts
│           └── app.js
├── pom.xml
├── README.md
└── db
    └── schema.sql
```

## Setup Instructions
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Ensure you have Java and Maven installed.
4. Set up a MySQL database and configure the connection details in `src/main/resources/application.properties`.
5. Run the application using Maven:
   ```
   mvn spring-boot:run
   ```
6. Open your web browser and navigate to `http://localhost:8080` to access the Mood Tracker App.

## Usage
- Use the slider to select your mood for the day.
- Optionally, add a note to describe your feelings or experiences.
- Click the submit button to save your mood entry.
- View all recorded entries to track your mood over time.

## License
This project is licensed under the MIT License.
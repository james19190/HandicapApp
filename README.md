# Golf Handicap Calculator

This project is a simple Java program to calculate the Course Handicap and Playing Handicap for golfers based on the course and player data. The program collects input about the golf course and players, computes handicaps, and displays the results.

---

## **Features**

- **Input Course Information:**
  - Course name
  - Slope rating
  - Course rating
  - Par
- **Input Player Information:**
  - Player name
  - GHIN handicap
- **Calculate:**
  - Course Handicap: Based on slope and course rating.
  - Playing Handicap: Adjusted with a multiplier of 0.95.
- **Output:**
  - Displays all players with their respective handicaps.

---

## **How to Run**

1) Clone the repository or download the files.
2) Navigate to the project directory: ```cd demo```
3) Compile the program: ```javac -d bin src/app/App.java src/players/Player.java```
4) Run the program: ```java -cp bin src.app.App```

## **Future Improvements**
- Integrate Database Support: Save and retrieve players and course data.
- Improve Input Validation: Handle invalid inputs gracefully.
- GUI or Web Interface: Make the application user-friendly.
- Advanced Calculations: Add support for additional golf handicap systems.

## **Contributors**
- James Kyoung Ho Kim
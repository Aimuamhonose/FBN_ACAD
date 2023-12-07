# GPA Calculator

This is a Java console application that models a Grade Point Average (GPA) calculator. The program allows users to input course details, including course name, course code, course unit, and course score. It then calculates the score grade, records the information, and displays the result in a tabular form along with the GPA.

## Functional Requirements

- The calculator has a grading system that dynamically grades the score based on the specified criteria.
- The GPA is calculated using the provided formula: GPA = (total quality point) / (total grade unit).
- Grading System:
  - 70-100: A (5 - Excellent)
  - 60-69:  B (4 - Very Good)
  - 50-59:  C (3 - Good)
  - 45-49:  D (2 - Fair)
  - 40-44:  E (1 - Pass)
  - 0-39:   F (0 - Fail)

## How to Run

1. **Install Java Extension Pack:**
   Make sure you have the "Java Extension Pack" installed in Visual Studio Code.

2. **Install Java Development Kit (JDK):**
   Ensure you have the Java Development Kit (JDK) installed on your machine.

3. **Configure JDK in VSCode:**
   Set the Java home path in VSCode by updating the `settings.json` file.

4. **Open Terminal:**
   Open the integrated terminal in VSCode.

5. **Navigate to Project Directory:**
   Use the `cd` command to navigate to the directory where your Java file (`GPACalculator.java`) is located.

   ```bash
   cd path/to/your/project

## Compile and Run

Compile the Java code using the `javac` command and then run it using the `java` command.

```bash
javac GPACalculator.java
java GPACalculator


|----------------------------|-----------------------|------------|---------------------|
| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |
|----------------------------|-----------------------|------------|---------------------|
| MATH 101                   | 5                     | B          | 4                   |
| GS 101                     | 3                     | A          | 5                   |
| .NET 101                   | 5                     | C          | 3                   |
| C# 101                     | 5                     | B          | 4                   |
| HCI 101                    | 3                     | A          | 5                   |
|---------------------------------------------------------------------------------------|
Your GPA is = 4.10 to 2 decimal places.

# Student Grade Calculator

## Overview
The **Student Grade Calculator** is a simple Java program that takes user input for the number of subjects and their corresponding marks. It then calculates the total marks, percentage, and assigns grades based on predefined criteria.

## Features
- Accepts user input for the number of subjects and their marks
- Calculates total marks and percentage
- Assigns grades based on marks
- Uses Java concepts such as:
  - Data types and variables
  - Operators
  - Control flow statements
  - Looping structures

## Technologies Used
- **Language:** Java
- **Package:** `Student_Grade_Calculator`
- **IDE:** Any Java-supported IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

## Code Structure
The main logic is implemented in the `Student` class, which consists of:
- `start()`: Initializes the program and handles user input
- `totalMArks(int[] marksArray)`: Computes the total marks
- `percentage(int total, int numberOfSubject)`: Calculates the percentage
- `grade(int[] arr)`: Assigns letter grades based on marks

## How to Run
```bash
# Clone the repository
git clone https://github.com/yourusername/Student_Grade_Calculator.git

# Navigate to the project directory
cd Student_Grade_Calculator

# Compile the Java file
javac Student.java

# Run the program
java Student
```

## Grading System
```bash
Marks Range  | Grade 
-------------|-------
95 - 100     | A     
80 - 94      | B     
60 - 79      | C     
40 - 59      | D     
Below 40     | F     
```

## Example Output
```bash
Welcome to student mark calculator..

Enter the Number of Subjects: 3
Enter the 1 Subject mark: 85
Enter the 2 Subject mark: 76
Enter the 3 Subject mark: 92

Total Marks: 253
Percentage: 84.3%
Grade of 1 Subject is B
Grade of 2 Subject is C
Grade of 3 Subject is B
```

## Contributing
Feel free to contribute by improving the grading logic, adding more features, or optimizing the code.


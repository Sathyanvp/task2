# Simple Student Management System

This is a basic command-line application built in Java for managing student records. It allows you to add, update, view, and delete student information.

## Features

* **Add Student**: Add new student records with ID, name, and marks.
* **Update Student**: Modify existing student records by specifying an index.
* **View Students**: Display a list of all enrolled students.
* **Delete Student**: Remove a student record by its index.

---

## How to use

Once the application is running, you'll see a menu of operations:

Enter the operation to do

Add 2, Update 3, veiw
Delete
<!-- end list -->


Enter the number corresponding to the operation you want to perform and follow the prompts.

### Example Workflow:

1.  **Add a student:**
    ```
    Enter the operation to do
    1. Add
    2, Update
    3, veiw
    4. Delete
    1
    Enter Student id
    S001
    Enter Student name
    Alice
    Enter Student mark
    85
    succesfully added: Students [id=S001, name=Alice, marks=85]
    ```

2.  **View all students:**
    ```
    Enter the operation to do
    1. Add
    2, Update
    3, veiw
    4. Delete
    3

    Students [id=S001, name=Alice, marks=85]
    ```

3.  **Update a student (e.g., change Alice's marks):**
    *(Note: The current update function uses an index. If you only have one student, the index will be 1.)*
    ```
    Enter the operation to do
    1. Add
    2, Update
    3, veiw
    4. Delete
    2
    size of list: 1
    Enter Student id
    S001
    Enter Student name
    Alice
    Enter Student mark
    90
    Enter index to update
    1
    succesfully updated: Students [id=S001, name=Alice, marks=90] at 0
    ```

4.  **Delete a student:**
    ```
    Enter the operation to do
    1. Add
    2, Update
    3, veiw
    4. Delete
    4
    size of list: 1
    Enter index to delete
    1
    succesfully deleted: Students [id=S001, name=Alice, marks=90]
    ```

---

## Project Structure

* `Runnerclass.java`: Contains the `main` method and handles user interaction and calls to student management functions.
* `Students.java`: Defines the `Students` class, representing a student with properties like ID, name, and marks.

---

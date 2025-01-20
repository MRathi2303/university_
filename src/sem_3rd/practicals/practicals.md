# Programming Tasks

1. **Disarium Number Checker**
    - Write a program in Java to input a number and check whether it is a Disarium Number or not. A Disarium Number is a number where the sum of its digits raised to their respective positions is equal to the original number.

2. **Smith Number Checker**
    - A Smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1). The program should take a number as input from the user, check if the number is a Smith Number, and output whether the number is a Smith Number or not.

3. **Printing a Pattern**
    - Write a program to print the following pattern:
      ```
      1
      1 2 1
      1 2 3 2 1
      1 2 3 4 3 2 1
      ```

4. **Bank ATM Denomination Display**
    - A bank wants to design a program to display the denomination of an input amount, up to 5 digits. The available denominations with the bank are ₹1000, ₹500, ₹100, ₹50, ₹20, ₹10, ₹5, ₹2, and ₹1. The program should accept the amount from the user, display the break-up of the amount in descending order of denominations, and display the total number of notes used.

5. **Sorting Algorithms**
    - Write a program that contains an sem_3rd.array of 10 elements and sorts it using the following techniques:
        1. Bubble Sort
        2. Selection Sort
        3. Insertion Sort

6. **Pendulum Arrangement of Array**
    - Write a program to input a list of integers in an sem_3rd.array and arrange them in a way similar to the to-and-fro movement of a Pendulum. The minimum element out of the list of integers must come in the center position of the sem_3rd.array. The numbers in ascending order next to the minimum go to the left, and the next higher numbers go to the right of the minimum number, continuing in a to-and-fro manner similar to a Pendulum.

7. **Spiral Matrix Filling**
    - Write a program in Java to fill a square matrix of size 'n*n' in a spiral fashion (from the inside) with natural numbers from 1 to n*n, taking 'n' as input.

8. **Distance Calculation**
    - Write a program in Java to input two distances, each having feet and inches components, and calculate their sum. The program should display the final result with appropriate message. The program should have a class `Distance` with data members `f1`, `f2` (integers to store the feet value of 2 distances), `inc1`, `inc2` (integers to store the inch value of 2 distances), a constructor `Distance(int a, int b, int c, int d)` to assign the values to the data members, and member methods `showDistance()` to display both the distances with a suitable message and `sumDistance()` to find the sum of the distances and print it.

9. **Bank Account Management**
    - Design a program to manage bank accounts. The program should have the following features:
        1. The bank maintains two kinds of accounts: Savings Account and Current Account.
        2. Savings Account provides compound interest, deposit, and withdrawal facilities.
        3. Current Account only provides deposit and withdrawal facilities and requires a minimum balance. If the balance falls below this level, a service charge is imposed.
        4. Create a class `Account` that stores customer name, account number, and type of account.
        5. Derive the classes `Curr-acct` and `Sav-acct` from the `Account` class.
        6. Include the necessary methods to perform the following tasks:
            - Accept deposit from a customer and update the balance.
            - Display the balance.
            - Compute interest and add it to the balance.
            - Permit withdrawal and update the balance (check for the minimum balance, impose penalty if necessary).

10. **Student Rank Tracker**
    - A superclass subclass `Record` has been defined to store the names and ranks of 50 students. Define a `Rank` to find the highest rank along with the name. The details of the classes are as follows:
    - Class `Record`:
        - Data members: `name[]` (to store the names of students), `rnk[]` (to store the ranks of students)
        - Member functions: `Record()`: constructor to initialize data members, `void readvalues()`: to store names and ranks, `void display()`: displays the names and the corresponding ranks
    - Class `Rank`:
        - Data member: `index` (integer to store the index of the topmost rank)
        - Member functions: `Rank()`: constructor to invoke the base class constructor and initialize, `void highest()`: finds the index location of the topmost rank and stores it in `index` without sorting the sem_3rd.array, `void display()`: displays the name and ranks along with the name having the topmost rank

11. **Power Calculator with Exception Handling**
    - Implement a calculator to compute the power of a number. Create a class `MyCalculator` with a single method `long power(int, int)`. This method takes two integers, `n` and `p`, as parameters and finds `n^p`. If either `n` or `p` is negative, the method must throw an exception which says "n or p should not be negative". If both `n` and `p` are zero, the method must throw an exception which says "n and p should not be zero".

12. **File Content Copier and Character Counter**
    - Write a program that will:
        1. Copy the content of one file to another file.
        2. Count the number of occurrences of the character '&' in the file given in the command line.

13. **Reverse Word Order in Text**
    - Write a program that will:
        1. Take input text consisting of multiple lines.
        2. Print the words of the input text in reverse order without any punctuation marks other than blanks.
           Note: Individual words (i.e., characters of every word) are not reversed.

14. **Validate Balanced Brackets**
    - Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. An input string is valid if:
        1. Open brackets must be closed by the same type of brackets.
        2. Open brackets must be closed in the correct order.
        3. Every close bracket has a corresponding open bracket of the same type.
    - Constraints:
        - `1 <= s.length <= 104`
        - `s` consists of parentheses only `'()[]{}'`.

15. **Student Record Management Application**
    - Create an application that can perform the following operations on student records:
        1. Store student records
        2. Update student records
        3. Delete student records
        4. View all student records
        5. Search for a specific student record
        6. Display appropriate messages for each operation
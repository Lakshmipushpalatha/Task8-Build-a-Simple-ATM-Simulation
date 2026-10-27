# Task8-Build-a-Simple-ATM-Simulation
java calculation

ATM Simulation System in Java

📌 Project Description

The ATM Simulation System is a console-based Java application that simulates basic ATM operations. It allows users to authenticate using a PIN and perform banking operations such as checking their balance, depositing money, and withdrawing money.

🎯 Objective

- Practice Java programming concepts.
- Understand conditional statements and loops.
- Learn methods and object-oriented programming.
- Handle invalid transactions and incorrect PIN attempts.
- Separate business logic from user interaction.

🛠️ Technologies Used

- Programming Language: Java
- Input: Scanner class
- Concepts: Classes, Objects, Methods, Loops, If-Else, Switch Statements

✨ Features

1. PIN Authentication: Verifies the user's PIN before allowing access.
2. Balance Checking: Displays the current account balance.
3. Deposit Money: Adds money to the account balance.
4. Withdraw Money: Allows withdrawals when sufficient funds are available.
5. Invalid Transaction Handling: Rejects invalid amounts and menu choices.
6. PIN Attempt Limit: Allows a maximum of three incorrect PIN attempts.
7. Exit Option: Allows the user to exit the ATM application.

⚙️ How It Works

1. The application displays a welcome message.
2. The user enters the PIN.
3. If the PIN is correct, the ATM menu is displayed.
4. The user selects an operation.
5. The application processes the selected transaction and displays the result.
6. The menu continues until the user selects the Exit option.
7. If the user enters an incorrect PIN three times, access is denied.

▶️ How to Run

1. Install the Java Development Kit (JDK), or use an online Java compiler.

2. Create a file named "Main.java".

3. Copy the Java program into the file.

4. Compile the program:
   
   javac Main.java

5. Run the program:
   
   java Main

6. Enter the PIN "1234" to access the ATM menu.

💻 Sample Output

Welcome to the ATM!
Enter your 4-digit PIN: 1234
PIN verified successfully!

===== ATM MENU =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 1
Current Balance: Rs. 5000.0

📚 Concepts Learned

- Java classes and objects
- Constructors
- Methods and method calls
- Encapsulation using private variables
- "if-else" conditional statements
- "while" and "do-while" loops
- "switch" statements
- User input using the Scanner class
- Basic validation and error handling

🔐 Security Note

This is an educational simulation. The PIN is hardcoded, and the account balance is stored only while the program is running. A real ATM requires secure authentication, protected account information, and additional security measures.

👩‍💻 Author

Java Programming Intern

🏁 Conclusion

This project helped me understand how Java concepts can be used to develop a simple ATM application with authentication, transaction processing, and validation.

# SplitWISE - Expense Sharing Application

A Java application that helps users to split and manage their shared expenses. Similar to the Splitwise app, it allows users to add expenses and split them among multiple users in different ways.

## Features

- Add users with details (name, email, phone)
- Add expenses with different splitting options:
  - Equal Split
  - Exact Split
  - Percentage Split
- Show balances for:
  - Individual users
  - All users

## Architecture

### Core Components

1. **User Management**

   - [`User`](src/model/User.java) class manages user information
   - Attributes: id, name, email, mobile

2. **Expense Types**

   - [`ExpenseType`](src/model/ExpenseType.java) enum defines three types:
     - EQUAL
     - EXACT
     - PERCENT

3. **Split System**

   - Base abstract [`Split`](src/model/Split/Split.java) class
   - Implementations:
     - [`EqualSplit`](src/model/Split/EqualSplit.java)
     - [`ExactSplit`](src/model/Split/ExactSplit.java)
     - [`PercentSplit`](src/model/Split/PercentSplit.java)

4. **Expense System**
   - Base abstract [`Expense`](src/model/Expense/Expense.java) class
   - Implementations:
     - [`EqualExpense`](src/model/Expense/EqualExpense.java)
     - [`ExactExpense`](src/model/Expense/ExactExpense.java)
     - [`PercentExpense`](src/model/Expense/PercentExpense.java)

### Services

1. [`ExpenseService`](src/services/ExpenseService.java)

   - Creates appropriate expense objects based on type
   - Handles split calculations

2. [`Manager`](src/services/Manager.java)
   - Main service class
   - Manages users and expenses
   - Maintains balance sheet
   - Provides methods to show expenses and balances

## Usage

### Adding Users

```java
Manager expenseManager = new Manager();
expenseManager.addUser(new User("u1", "User1", "user1@email.com", 1234567890));
```

# Format:

```bash
EXPENSE <user-id> <amount> <no-of-users> <users> <split-type> <values>
```

# Equal Split Example

EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL

# Exact Split Example

EXPENSE u1 1000 4 u1 u2 u3 u4 EXACT 250 250 250 250

# Percent Split Example

EXPENSE u1 1000 4 u1 u2 u3 u4 PERCENT 25 25 25 25

# Show all balances

SHOW

# Show balance for specific user

SHOW u1

How to Run
Clone the repository
Open in your favorite Java IDE
Run the Main class
Enter commands in the specified format
Notes
The application maintains a balance sheet for all users
Negative balance means the user owes money
Positive balance means the user is owed money

## Sprint 1 Checklist Answers

- Are you in a Group?
  - No

- If so, who else is in your group?
  - N/A

- What programming language are you selecting? Which version?
  - Java, version 21

- Do you have your GitHub account set up?
  - Yes

- Do you have a public repository for your Project?
  - Yes

- What is the link to your GitHub repository?
  - https://github.com/vozturk5/se350-project

- If you are in a group, does everyone have access to the github repo?
  - N/A

- Do you have a “Hello World” program that compiles and runs?
  - Yes

- Where is the entry point to your project? (src/main/Main.java for example)
  - src/Main.java


## Sprint 2 Project Idea

For this project, I am building a Restaurant Ordering System. The system allows users to view a menu, create orders, add menu items, calculate totals with tax, and process payments. The program generates a receipt-style output that includes grouped items, subtotal, tax, and total.

The project is designed to be scalable and will later include multiple design patterns such as Factory, Decorator, Builder, Observer, and Singleton.
The Strategy design pattern is currently implemented for handling different payment methods.

---
## Sprint 2 Progress

So far, I have implemented the core functionality of the Restaurant Ordering System.

Current features include:
- Creating menu items (e.g., Burger, Fries, Drink)
- Building orders by adding items
- Calculating subtotal, tax, and total
- Printing a receipt-style output
- Grouping duplicate items (e.g., Drink x2, x3)
- Displaying a restaurant menu
- Processing payments using the Strategy pattern (Cash and Card)
- Tracking order status (CREATED → PAID)
- Generating unique order IDs

The system is functional and demonstrates object-oriented design principles, and it is structured to support additional design patterns in future sprints.

## Planned Libraries

For now, the project uses standard Java only.

Possible libraries I may use later:
- Java Swing or JavaFX (for GUI, if I decide to add one)
- JUnit (for testing)

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

---
---

## Sprint 3 Progress

For Sprint 3, I added two custom design patterns to the Restaurant Ordering System: the Factory Method Pattern and the Builder Pattern.

### Design Patterns Implemented in Sprint 3

1. Factory Method Pattern  
   The Factory Method Pattern is used to create menu items through factory classes instead of directly creating them in the main program. This makes the system easier to extend because new menu item types can be added by creating new factory classes.

   Classes related to this pattern:
   - MenuItemFactory
   - BurgerFactory
   - FriesFactory
   - DrinkFactory
   - DessertFactory
   - MenuItem

2. Builder Pattern  
   The Builder Pattern is used to create orders step by step. Instead of manually creating an order and repeatedly calling addItem in the main program, the OrderBuilder allows items and quantities to be added in a cleaner chain of method calls.

   Classes related to this pattern:
   - OrderBuilder
   - Order
   - MenuItem

### Current Program Functionality

The program currently demonstrates:
- Displaying a restaurant menu
- Creating menu items through factory classes
- Building an order using the Builder Pattern
- Adding item quantities such as Drink x2
- Calculating subtotal, tax, and total
- Processing payment using the Strategy Pattern
- Updating order status from CREATED to PAID
- Printing a receipt-style order summary

### Final Submission Plan

For the final submission, I plan to show the Restaurant Ordering System performing a full restaurant order workflow. The demo will show menu item creation, order building, item quantities, receipt generation, payment processing, and order status updates.

By the final submission, I plan to include six total custom design patterns. The current project already includes Strategy, Factory Method, and Builder. Future sprints may add patterns such as Command, State, Singleton, or Observer depending on which ones fit the project best.

### Possible Problems or Risks

One possible challenge is making sure each design pattern is used meaningfully instead of only being added for the requirement. Another possible issue is keeping the project organized as more pattern-related classes are added. I will need to keep the code modular and update the UML diagram as the project grows.
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

---

## Final Project Progress

After Sprint 3, I continued developing the Restaurant Ordering System by adding the remaining design patterns needed for the final project. The project now includes six total custom design patterns and demonstrates a complete restaurant order workflow.

### Additional Design Patterns Implemented

4. State Pattern  
   The State Pattern is used to manage the lifecycle of an order. Instead of only storing an order status as a simple enum, the order now changes behavior based on its current state.

   Classes related to this pattern:
   - OrderState
   - CreatedState
   - PaidState
   - PreparingState
   - ReadyState
   - CompletedState
   - CancelledState
   - Order

   The order can move through states such as CREATED, PAID, PREPARING, READY, COMPLETED, and CANCELLED.

5. Command Pattern  
   The Command Pattern is used to represent restaurant actions as command objects. This separates actions from the main program and makes the workflow easier to extend.

   Classes related to this pattern:
   - OrderCommand
   - AddItemCommand
   - CheckoutCommand
   - PrepareOrderCommand
   - MarkReadyCommand
   - CompleteOrderCommand
   - CancelOrderCommand
   - OrderInvoker

   Commands are used to add items, check out an order, prepare an order, mark it ready, complete it, and cancel it.

6. Singleton Pattern  
   The Singleton Pattern is used in the RestaurantManager class. This ensures that the program uses one shared restaurant manager instance to track completed and cancelled orders.

   Classes related to this pattern:
   - RestaurantManager

### Final Design Patterns Implemented

The final project includes these six custom design patterns:

1. Strategy Pattern - used for payment methods such as cash and card.
2. Factory Method Pattern - used for creating menu items through factory classes.
3. Builder Pattern - used for building orders step by step.
4. State Pattern - used for order lifecycle behavior.
5. Command Pattern - used for restaurant order actions.
6. Singleton Pattern - used for the restaurant manager.

### Final Program Functionality

The final program demonstrates:
- Displaying the restaurant menu
- Creating menu items through Factory Method classes
- Creating orders using the Builder Pattern and Command Pattern
- Adding item quantities such as Drink x2
- Calculating subtotal, tax, and total
- Processing payment through the Strategy Pattern
- Moving an order through CREATED, PAID, PREPARING, READY, and COMPLETED states
- Cancelling an order
- Blocking payment for a cancelled order
- Tracking completed and cancelled orders through the Singleton RestaurantManager
- Printing a final manager summary

### Final Demo Plan

For the final demo video, I plan to show the program running a full restaurant workflow. The demo will show the menu, a completed order, item quantities, receipt generation, payment processing, state changes, a cancelled order, failed payment for the cancelled order, and the final manager summary.

### Bugs / Issues / Notes

The project is console-based and does not include a graphical user interface. The current demo is hardcoded in Main.java instead of using live user input. This was intentional so the design patterns and program behavior can be demonstrated clearly and consistently. The main functionality works, including menu display, order creation, payment, state transitions, cancellation, receipt generation, and manager tracking.
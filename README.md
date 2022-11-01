# OOp-s-Kata-WashingMachine


## Observations: ##

1. Violation of SOLID principle (Single Responsibility) in WashingServices class. Filtering the fabric and other responsibilities are been in a single class.


2. Violation of SOLID principle (Single Responsibility) in WashingServices class. Validating the weight of laundry and other responsibilities are been in a single class. And Implementing the weight validation in the service layer would lose the reusability of code for lower or higher capacity washing machines.


3. Violation of OOP’s Concept (Abstractions and Encapsulation of Business Logic ) in WashingService. The logic of setting the Temperature and spin speed of different fabrics wasn’t encapsulated which leads to the consistency issue.

## Approach: ##

1. To Obey the SOLID principle in WashingService, created a new class named Basket where all the laundry is filtered in it and utilized where ever required. And this Basket object is sent as a parameter to ensure abstraction.


2. To resolve the issue, LaundryWeight class is created and it ensures the limitations of weight by accepting the parameters List of Laundry and max_weight. This is implemented in WashingMachine class. So that, it can be utilized for other versions of washing machines.


3. To ensure the logic is abstracted and encapsulated, a new abstract class Programme is created where all our business logic will go and the object of the Programme is utilized all across the code.

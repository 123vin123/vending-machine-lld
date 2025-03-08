Vending Machine Low level design.
This project implements a Vending Machine using SOLID principles and various design patterns, including Singleton, Strategy, and State patterns. 
The system is designed to be modular, scalable, and easily extensible.
Design Pattern Used:
Singleton Pattern: Ensures a single instance of critical components like ItemDatabase and Inventory.
Strategy Pattern: Used for different payment methods (CardPaymentStrategy, CoinPaymentStrategy).
State Pattern: Manages vending machine states (IdleState, ReadyState, DispenseState, ReturnChangeState).

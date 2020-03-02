# OOP Master Challenge Repository

This is my solution to the OOP Master Challenge at [the Java course on Udemy.](https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/3404262)

## Original requirements

The purpose of the application is to help a fictitious company called Bill's Burgers to manage their process of selling hamburgers.

Our application will help Bill to select types of burgers, some of the additional items (additions) to be added to the burgers and pricing.

We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bill's store. The basic hamburger should have the following items.

Bread roll type, meat, and up to 4 additional additions (things like lettuce, tomato, carrot, etc.) that the customer can select to be added to the burger.

Each one of these items get charged an additional price so you may need some way to track how many items got added and to calculate the final price (base burger with all the additions).

This burger has a base price and the additions are all separately priced (up to 4 additions, see above).

Create a Hamburger class to deal with all the above.

The constructor should only include the roll type, meat and price, can also include name of burger or you can use a setter.

Also create two extra varieties of Hamburgers (subclasses) to cater for:

 - Healthy burger (on a brown rye bread roll), plus two additional items that can be added. The healthy burger can have 6 items (Additions) in total.
 
   Hint: You probably want to process the two additional items in this new class (subclass of Hamburger), not the base class (Hamburger), since the two additions are only appropriate for this new class (in other words new burger type).
 - Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
 
   Hint: You have to find a way to automatically add these new additions at the time the deluxe burger object is created, and then prevent other additions being made.

All 3 classes should have a method that can be called any time to show the base price of the hamburger plus all additional additions, each showing the addition name, and addition price, and a grand/final total for the burger (base price + all additions)

For the two additional classes this may require you to be looking at the base class for pricing and then adding totals to final price.

## Note

Yes, for the additions I could've used another class and a Set - but we're not at that part yet in the course...
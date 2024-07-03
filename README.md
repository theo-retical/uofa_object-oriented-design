# uofa_object-oriented-design

Homeworks and Assignments for the course Object-Oriented Design @ Univeristy of Alberta via Coursera 
Capstone Project - Sharing Items App

## Week/Module 1 - Object-Oriented Analysis and Design

Quizzes only.

## Week/Module 2 - Object Oriented Modelling

### Assignment 1.1 UML Class Diagram

In its current state, a user of the app—the owner—is able to record the items they own and wish to share.
The owner may view all of their items, their “Available” items, or their “Borrowed” items.
The owner may change the status of an item they own from “Available” to “Borrowed” and back.
When an item’s status is changed to “Borrowed”, the owner must enter the username of the borrower.
Review the user stories, then download, examine, and run the code base provided.
After you have become familiar with the code, construct a UML class diagram that captures all the classes and relationships in the code base. For each class you should document all attributes and methods.
These classes are:

- MainActivity
- SectionsPagerAdapter
- ItemsFragment
- AllItemsFragment
- AvailableItemsFragment
- BorrowedItemsFragment
- AddItemActivity
- EditItemActivity
- ItemList
- Item
- ItemAdapter
- Dimensions

You should also include any superclasses that the above classes inherit from. However, you are NOT required to document any methods or variables from these, only their names:

- AppCompatActivity
- FragmentPagerAdapter
- ArrayAdapter<\Item>
- Fragment

Style guidelines for UML class diagram

- superclasses should be drawn above subclasses
- whole things should be drawn to the left of the part
- there should be few crossing edges
- boxes should not overlap other boxes or edges
- diagram should flow from top to bottom and left to right

#### Solution

![Capstone1 1 Assessment](https://github.com/theo-retical/uofa_object-oriented-design/assets/98850030/3d208973-5ae0-4d42-83f6-7da82df04992)


## Week/Module 3 - Design Principles

### Assignment 1.2 UML Sequence Diagram

Review the code responsible for adding a new item.
Make a sequence diagram that captures the interactions of objects in the app when a new item is added.
Your sequence diagram should contain the following classes:
 
- AddItemActivity
- ItemList
- Dimensions
- Item

And contain calls of the following methods:

- onCreate()
- loadItems()
- saveItem()
- Dimensions constructor
- Item constructor
- addItem()
- saveItems()
 
Lastly, the activation of AddItemActivity should start with the call to “onCreate()”
Hint: you may need to use nested activations.

### Solution

![Cap1 2](https://github.com/theo-retical/uofa_object-oriented-design/assets/98850030/621ae68d-3f23-46ef-b5c5-21a29d9c82fd)

### Assignment 1.3 UML State Diagram

Review the code responsible for adding a new item and editing an existing item.
Remember that an item can either be “Available” or “Borrowed” and can either have an image attached or not.
In this assignment you are to make a state diagram that captures the four possible states of an item.

- Available without photo
- Available with photo
- Borrowed without photo
- Borrowed with photo

Include arrows to indicate transitions between the states and label these transitions accordingly. And, remember to include the terminal state and to indicate the starting state.

![Assignment 1 3 UML State Diagram](https://github.com/theo-retical/uofa_object-oriented-design/assets/98850030/77404739-0d95-4360-90e6-54d8121507d9)


## Week/Module 4 - Capstone Challenge

### Assignment 1.4 - Update the Application

This version of the app should accommodate the new contacts feature. In particular:

- ContactsActivity should be accessible from the MainActivity.
- ContactsActivity should be implemented as a ListView.
- An owner should now be able to add a potential borrower (a contact) to their contacts. Each contact must have a unique username and an email.
- An owner can edit or delete a contact, but not if the contact is currently borrowing an item, i.e. the contact is a borrower.
- Owners are now required to select a contact to be the borrower of an item when changing the status of an item from “Available” to “Borrowed”. That is, it is no longer sufficient to enter the borrower’s username as a string -- now the borrower must be
- picked from the owner’s list of contacts.

<<Contacts Code>>
<<Contacts List Code>>

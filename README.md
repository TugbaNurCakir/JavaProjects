# JavaProjects
Java projects added, git commands, pull requests and merging are tried in this repo.


**Project 1: Email Application**

***Scenario: You are an IT Support Administrator Specialist and are
charged with the task of creating email accounts for new hires***

Your application should do the following:
>Generate an email with the following syntax: firstname.lastname@department.company.com

>Determine the department (sales, development, accounting), if none leave blank

>Generate a random String for a password

>Have set methods to change the password, set the mailbox capacity, and define an alternate email address

>Have get methods to display the name, email, and mailbox capacity

**Project 2: Student Database Application**

***Scenario: You are a Database Administrator for a university and need to
create an application to manage student enrollments and balance.***

Your application should do the following:
>Ask the user how many new students will be added to the database

>The user should be prompted to enter the name and year for each student

>The student should have a 5-digit unique ID, with the first number being their grade level

>A student can enroll in the following courses:

-History 101

-Mathematics 101

-English 101

-Chemistry 101

-Computer Science 101

>Each course costs $600 to enroll

>The student should be able to view their balance and pay the tuition

>To see the status of the student, we should see their name, ID, courses enrolled, and balance

**Project 3: Bank Account Application**

***Scenario: You are a back-end developer and need to
create an application to handle new customer bank account requests***

Your application should do the following:
>Read a .csv file of names, social security numbers, account type and initial deposit
>Use a proper data structure to hold all these accounts
>Both savings and checking accounts share the following properties:

-deposit()
-withdraw()
-transfer()
-showInfo()


11-Digit Account Number(generated with the following process: 1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)

>Saving Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code

>Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN 

>Both account will use an interface that determines the base interest rate.
(Savings accounts will use .25 points less than the base rate,
Checking accounts will use 15% of the base rate)

>The ShowInfo method should reveal relevant account information as well as information specific to the Checking or Savings account

Learning objectives:

>Learn to develop a robust application architecture

>Use when to use abstract classes and abstract methods 

>Use an interface API to receive information from a developer's application

>Explore constructors deeper and use the super() keyword

>Explore access modifiers and when to use public, protected or private

>Read data from a file and store in an appropriate data structure

>Generate random numbers and work with String API

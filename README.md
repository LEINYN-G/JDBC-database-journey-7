<img src="Image/jv.jpeg" alt="App Screenshot" width="200" height="300">

# JDBC-database

<img src="Image/db.jpeg" alt="App Screenshot" width="200" height="300">


In this section, we will learn more about databases, their types, and how to connect a database to our Java program. We will also dive deep into how to interact and manipulate a database using Java.

Databases play a major role in the development of an application. As we know, databases help us to store, access and manipulate data.

We can categorize databases into various categories based on how they store and process data. One of the most common types of database is the Relational database.

<img src="Image/table.jpeg" alt="App Screenshot" width="500" height="300">

A relational database stores the data in the form of tables. A table is a collection of related data entries where the data is stored in rows and columns. You can visualize it just like a spreadsheet.

Let's talk about something called Database Management System (DBMS).

It is a collection of programs that enable the users to access databases, manipulate data, report and represent data, and also control access to the database.

Hence, a relational database is often referred to as a Relational Database Management System (RDBMS). It is one of the most popular DBMS in the industry. To work with relational database systems, we use something called SQL.

SQL is the standard language for relational database systems.

<img src="Image/sql.jpeg" alt="App Screenshot" width="200" height="300">

Structured Query Language, commonly known as SQL, is a standard programming language for relational databases. It helps in storing, manipulating, and retrieving data stored in a relational database.

<img src="Image/sqlb.jpeg" alt="App Screenshot" width="200" height="300">

Using SQL, you can query, update, and reorganize data, as well as create and modify the schema (structure) of a database system, and control access to its data.
As we have seen, SQL is the standard language for relational database systems. But, there are different versions of the SQL language.

Some of the examples are MySQL, MS Access, Oracle, Sybase, Informix, Postgres, SQL Server, and more which depend on SQL and use it as the base. MySQL is one such version of SQL that we will be using throughout this section to work with Java.

Navigate to the next screen to look at the overview of MySQL.

<img src="Image/mysql.jpeg" alt="App Screenshot" width="200" height="300">

MySQL is a freely available open-source Relational Database Management System (RDBMS) that uses Structured Query Language (SQL). It is one of the best RDBMS being used for developing various web-based software applications.

MySQL is compatible with all the major operating systems and works pretty well with major programming languages such as Java, Python, PHP, C++, and more.
Once the installation completes, click the Finish button to close the installation wizard. That's it, MySQL will be successfully installed on your local machine.

To check whether the installation is done successfully, search MySQL Command Line Client on the Windows search bar and open it.

<img src="Image/jdbc.jpeg" alt="App Screenshot" width="200" height="300">

With a basic glimpse of SQL and MySQL, let's move ahead and work with database and database connectivity in Java. In Java, JDBC is something that makes this possible. But, what exactly is JDBC?

Developed as an alternative to the C-based ODBC API, JDBC offers a programming-level interface that handles the mechanics of Java applications communicating with a database or RDBMS.

<img src="Image/jdb.jpeg" alt="App Screenshot" width="200" height="300">

The JDBC interface consists of two layers, the JDBC API & the JDBC Driver API.

The JDBC API defines the Java interfaces and classes that programmers use to connect to databases and send queries while a JDBC driver implements these interfaces and classes for a particular DBMS vendor.
The JDBC API consists of a set of interfaces and classes written in the Java programming language.

Using these standard interfaces and classes, programmers can write applications that connect to databases, send queries written in structured query language (SQL), and process the results.

The following are the different types of drivers available in JDBC which are used by the application based on the scenario and type of application,

1 Type 1 or the JDBC-ODBC Bridge Driver

2 Type 2 or the JDBC-Native API

3 Type 3 or the JDBC-Net pure Java

4 Type 4 or the 100% Pure Java (Thin Driver)

<img src="Image/code.jpeg" alt="App Screenshot" width="300" height="300">


With all the concepts that we have learned so far, you might have a basic idea of how we can connect a database to our Java application. Having said that, it's time to actually do all that we have talked about from the last few sections and write some code!

In this section, we have a few tasks for you! But, before that, let's quickly guide you through a code example where we will access & retrieve some data from the database.

<img src="Image/cont.jpeg" alt="App Screenshot" width="200">
Explore the code file!

<img src="Image/lets.jpeg" alt="App Screenshot" width="200" height="300">


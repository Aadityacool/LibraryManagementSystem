Library Management System

A simple Java console application to manage a library of books with features to add, display, borrow, and return books.

Features

Preloaded list of books

Add new books to the library

Show all books with availability status

Borrow books if available

Return borrowed books

User-friendly menu-driven interface


How to Use

1. Run the program.


2. Choose from the menu options:

Add Book: Enter title and author to add a new book.

Show All Books: View all books and their status (Available/Borrowed).

Borrow Book: Borrow a book by entering its number.

Return Book: Return a borrowed book by entering its number.

Exit: Exit the program.




Code Overview

Book class represents a book with title, author, and isBorrowed status.

LibraryManagezementSystem class contains the main logic and menu.

Uses an ArrayList<Book> to store books.

Console input via Scanner.


Example

--- Library Menu ---
1. Add Book
2. Show All Books
3. Borrow Book
4. Return Book
5. Exit
Choose option: 2

Library Books:
1. Wings of Fire by A.P.J. Abdul Kalam [Available]
2. The White Tiger by Aravind Adiga [Available]
...

Requirements

Java JDK 8 or above

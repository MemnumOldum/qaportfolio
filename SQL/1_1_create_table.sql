CREATE TABLE book(
    book_id INTEGER PRIMARY KEY AUTOINCREMENT,
    title VARCHAR(50),
	author VARCHAR(30),
	price DECIMAL(8, 2),
	amount INT
);
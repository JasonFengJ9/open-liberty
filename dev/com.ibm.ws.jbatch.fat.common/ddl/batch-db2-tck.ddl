CREATE TABLE NUMBERS (
	item INT,
	quantity INT
);

CREATE TABLE ORDERS (
	orderID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY,
	itemID INT,
	quantity INT
);

CREATE TABLE INVENTORY (
	itemID INT NOT NULL PRIMARY KEY,
	quantity INT NOT NULL
);

INSERT INTO INVENTORY VALUES (1, 100);

INSERT INTO NUMBERS VALUES (1, 10);

INSERT INTO NUMBERS VALUES (2, 10);

INSERT INTO NUMBERS VALUES (3, 10);

INSERT INTO NUMBERS VALUES (4, 10);

INSERT INTO NUMBERS VALUES (5, 10);

INSERT INTO NUMBERS VALUES (6, 10);

INSERT INTO NUMBERS VALUES (7, 10);

INSERT INTO NUMBERS VALUES (8, 10);

INSERT INTO NUMBERS VALUES (9, 10);

INSERT INTO NUMBERS VALUES (10, 10);

INSERT INTO NUMBERS VALUES (11, 10);

INSERT INTO NUMBERS VALUES (12, 10);

INSERT INTO NUMBERS VALUES (13, 10);

INSERT INTO NUMBERS VALUES (14, 10);

INSERT INTO NUMBERS VALUES (15, 10);

INSERT INTO NUMBERS VALUES (16, 10);

INSERT INTO NUMBERS VALUES (17, 10);

INSERT INTO NUMBERS VALUES (18, 10);

INSERT INTO NUMBERS VALUES (19, 10);

INSERT INTO NUMBERS VALUES (20, 10);

COMMIT WORK;
CONNECT RESET;
TERMINATE;
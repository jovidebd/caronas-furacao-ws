CREATE TABLE account (
	account_id SERIAL NOT NULL,
	username varchar(255) NOT NULL,
	password varchar(255),
	PRIMARY KEY (account_id)
	);
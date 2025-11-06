
-- Creating bank bank demo database
create database bank;


-- Creating table for user account details
CREATE TABLE bank.user_accounts (
    user_account_id INT AUTO_INCREMENT PRIMARY KEY,
	account_number BIGINT NOT NULL,
	account_name VARCHAR(20),
	account_type VARCHAR(10),
	balance_date DATE NOT NULL,
	currency char(3) NOT NULL,
	opening_available_balance DECIMAL(12, 2),
	UNIQUE (account_number)
);

-- Creating table for transaction details on particular user account
CREATE TABLE bank.user_account_transactions (
    user_account_transaction_id INT AUTO_INCREMENT PRIMARY KEY,
	account_number BIGINT NOT NULL,
	account_type VARCHAR(10),
	transaction_date DATE NOT NULL,
	currency char(3) NOT NULL,
	debit_amount DECIMAL(12, 2),
	credit_amount DECIMAL(12, 2),
	transaction_type VARCHAR(10), 
	transaction_narrative TEXT
);

-- To view tables
use bank;
show tables;



/*-------Data insertions in tables -------------- */
Insert into bank.user_accounts( 
	account_number, account_name, account_type, balance_date, currency, opening_available_balance
) values 
	( 585309209, 'SGSavings726', 'Savings', CURDATE(), 'SGD', 84327.51),
	( 795309219, 'AUSavings933', 'Savings', CURDATE(), 'AUD', 84005.09),
	( 325309048, 'AUCurrent433', 'Current', CURDATE(), 'AUD', 44891.67);		 



-- Inserting some values into user_account_transactions table
Insert into bank.user_account_transactions(
	account_number,
	account_type,
	transaction_date,
	currency,
-- 	debit_amount,
 	 credit_amount,
	transaction_type,
	transaction_narrative
) values 
	--  ( 585309209, 'Saving', CURDATE(), 'SGD', 4327.51, "Debit", "Education Loan EMI"),
	  ( 585309209, 'Saving', CURDATE(), 'SGD',  327.00,  "Credit", "Deposit from Bank");
	-- ( 585309209, 'Saving', CURDATE(), 'SGD', 1327.10, "Debit", "ATM Withdrawal");



Insert into bank.user_account_transactions(
	account_number,
	account_type,
	transaction_date,
	currency,
 	debit_amount,
 --	 credit_amount,
	transaction_type,
	transaction_narrative
) values 
	  ( 585309209, 'Saving', CURDATE(), 'SGD', 4327.51, "Debit", "Education Loan EMI"),
	--  ( 585309209, 'Saving', CURDATE(), 'SGD',  327.00,  "Credit", "Deposit from Bank");
	 ( 585309209, 'Saving', CURDATE(), 'SGD', 1327.10, "Debit", "ATM Withdrawal");


select * from bank.user_accounts;
select * from bank.user_account_transactions;


-- Finally clearing all the tables and schema

drop table bank.user_accounts;
drop table bank.user_account_transactions;

drop database bank;




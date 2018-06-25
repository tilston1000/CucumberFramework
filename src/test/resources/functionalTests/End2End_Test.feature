Feature: Automated end-to-end test

Scenario: Customer creates a new account
	Given a new user on the automation practise
	When they create a new account
	Then they can login successfully
	
Scenario: Ensuring item is retained in shopping cart when user logs out and back in again
	Given a user logs in to the site
	And adds the most expensive dress to the shopping cart
	When they log out of the site
	And then log back in
	Then the dress is retained in the shopping cart

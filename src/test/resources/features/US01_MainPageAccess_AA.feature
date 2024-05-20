@B33G9-191
Feature: Default
Feature: Access Main Modules

	Scenario: Sales or Store Managers can see all modules
		Given the user is logged in as "storemanager51"
		When Sales or Store manager on a dashboard page
		Then Sales or Store Manager should see 8 modules

	Scenario:  Driver can see 4 modules on the main page
		Given the user is logged in as "user1"
		When Driver is on a dashboard page
		Then Driver should see 4 modules
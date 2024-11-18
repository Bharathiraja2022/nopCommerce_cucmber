Feature: Login

Scenario: Successful login with credentials
	Given User Launch chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com/login"
	And User enters email as "admin@yourstore.com" and Password as "admin"
	And Click on login
	Then Page title should be "Dashboard / nopCommerce administration"
	When user click on logout link 
	Then Page title should be "Your store.login"
	And close the browser

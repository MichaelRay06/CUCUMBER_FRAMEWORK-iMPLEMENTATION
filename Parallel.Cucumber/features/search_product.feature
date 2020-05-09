@parallelRunner
Feature: verifying search module of a Car Guruji site 




Scenario Outline: verify produt search 

	Given I am on Carguruji on "<browserName>" browser 
	Then I coud vrify the page tile as "<pageTitle>" 
	When I logged in the site with user name as "<emailAddr>" password as "<passwDdAddr>" 
	Then I verify my  account title text as "<myAccountTitleText>" 
	And I search for desired product as  "<searchProduct>" 
	Then I click to make product search 
	Then I verifyed the serched product as "<vrifyProduct>" 
	
	Examples: 
	
		|browserName       |pageTitle         |emailAddr                 |passwDdAddr       |myAccountTitleText        |searchProduct    |vrifyProduct |
		#| chrome           |CarGuruji Shop    |bfatogun@yahoo.com        |sonsofgod          |MY ACCOUNT                  |blouse           |BLOUSE|
		| firefox          |CarGuruji Shop    |bfatogun@yahoo.com        |sonsofgod          |MY ACCOUNT                  |blouse           |BLOUSE|
		
		
		
		
	Scenario Outline: I could verify produt search 

	Given I am on Carguruji on "<browserName>" browser 
	Then I coud vrify the page tile as "<pageTitle>" 
	When I logged in the site with user name as "<emailAddr>" password as "<passwDdAddr>" 
	Then I verify my  account title text as "<myAccountTitleText>" 
	And I search for desired product as  "<searchProduct>" 
	Then I click to make product search 
	Then I verifyed the serched product as "<vrifyProduct>" 
	
	Examples: 
	
		|browserName       |pageTitle         |emailAddr                 |passwDdAddr       |myAccountTitleText        |searchProduct    |vrifyProduct |
		| chrome           |CarGuruji Shop    |bfatogun@yahoo.com        |sonsofgod          |MY ACCOUNT                  |blouse           |BLOUSE|
		#| firefox          |CarGuruji Shop    |bfatogun@yahoo.com        |sonsofgod          |MY ACCOUNT                  |blouse           |BLOUSE|
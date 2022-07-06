Feature: Checkout  

Scenario: ValidAddress
Given open the application url
When user enters valid username and password
And user clicks on login button
And user add the Sauce Labs Backpack by clicking add to cart button
And user clicks on shopping cart button
And user clicks on checkout button
When user enters Firstname Lastname and postalcode into the fields
And user clicks on continue button
Then user should see the payment page

Scenario: EmptyAddress
Given open the application url
When user enters valid username and password
And user clicks on login button
And user add the Sauce Labs Backpack by clicking add to cart button
And user clicks on shopping cart button
And user clicks on checkout button
When user enters Firstname Lastname into the fields by leaving postalcode empty
And user clicks on continue button
Then user should see error message

Scenario: ShippingPriceTax
Given open the application url
When user enters valid username and password
And user clicks on login button
And user add the Sauce Labs Backpack by clicking add to cart button
And user clicks on shopping cart button
And user clicks on checkout button
When user enters Firstname Lastname and postalcode into the fields
And user clicks on continue button
Then user should see tax price and total price of the item

Scenario: EmptyCartcheckout
Given open the application url
When user enters valid username and password
And user clicks on login button
And user clicks on shopping cart button
And user clicks on checkout button
When user enters Firstname Lastname and postalcode into the fields
And user clicks on continue button
And user clicks on finish
Then user should see order conformation message


Scenario: Successfullcheckout
Given open the application url
When user enters valid username and password
And user clicks on login button
And user add the Sauce Labs Backpack by clicking add to cart button
And user clicks on shopping cart button
And user clicks on checkout button
When user enters Firstname Lastname and postalcode into the fields
And user clicks on continue button
And user clicks on finish
Then user should see order conformation message
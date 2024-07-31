Feature: Verify user functionality errors

    Background: User login
        Given the user is on the saucedemo login page
        When the user enters the credentials "error_user" "secret_sauce"

    Scenario: User adds a product and wants to pay it
        When the user wants to buy a product from inventory "user3" "testing" "4569"
        Then the user does not see the complete purchase message

    Scenario: User wants to remove a product after it has been added
        When the user adds a product and wants to remove it
        Then the user sees that the product has not been removed

    Scenario: User adds a product that it does not exist
        When the user adds and wants to pay a product that is not found
        Then the user sees a blank page

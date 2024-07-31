Feature: Verify user functionality issues

    Background: User login
        Given the user is on the saucedemo login page
        When the user enters the credentials "problem_user" "secret_sauce"

    Scenario: User selects a product and wants to add it to cart
        When the user selects a product and tries to add it to the cart
        Then the user sees that the button add to cart is faulty

    Scenario: User adds a product and wants to buy it
        When the user wants to buy a product from inventory "user3" "testing" "4569"
        Then the user sees an error when filling the form

    Scenario: User wants to remove a product after it has been added
        When the user adds a product and wants to remove it
        Then the user sees that the product has not been removed

    Scenario: User adds a product that it does not exist
        When the user adds and wants to pay a product that is not found
        Then the user sees a blank page

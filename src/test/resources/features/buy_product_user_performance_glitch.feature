Feature: User buys a product successfully

    @test
    Scenario: User adds an item to cart and pay it
        Given the user is on the saucedemo login page
        When the user enters the credentials "performance_glitch_user" "secret_sauce"
        When the user adds an item to shopping cart
        When the user wants to add a new product
        When the user completes the purchase with "user1" "testing" "1234"
        Then the user sees their purchase completed
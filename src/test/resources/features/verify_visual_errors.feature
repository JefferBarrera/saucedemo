Feature: Main page has visual errors

    Scenario: Login with locked user credentials
        Given the user is on the saucedemo login page
        When the user enters the credentials "visual_user" "secret_sauce"
        Then the user sees that some elements are faulty
        When the user adds an item to shopping cart
        Then the user sees that checkout button is faulty
        When the user completes the purchase with "test" "testing" "1111"
        Then the user sees their purchase completed
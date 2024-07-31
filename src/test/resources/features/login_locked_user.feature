Feature: Login failed

    Scenario: Login with locked user credentials
        Given the user is on the saucedemo login page
        When the user enters the credentials "locked_out_user" "secret_sauce"
        Then the user sees that the account is blocked
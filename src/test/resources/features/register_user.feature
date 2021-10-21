# se crea el código con las precondiciones para el inicio de la página, por ejemplo

  # Registro las características del diseño

  Feature: I as user of the New Experience
    i want to create a new register
    to access as user

  Scenario: Successful user creation
    Given User in the home page
    When The user creates an account by registering their data and filling out the form
    Then User sees its username
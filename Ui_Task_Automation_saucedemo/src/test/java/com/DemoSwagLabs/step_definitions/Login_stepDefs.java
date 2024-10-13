package com.DemoSwagLabs.step_definitions;

import com.DemoSwagLabs.pages.LoginPage;
import com.DemoSwagLabs.utilities.ConfigurationReader;
import com.DemoSwagLabs.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class Login_stepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("The user navigates to website")
    public void the_user_navigates_to_website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("The user clicks on login button and enters credentials")
    public void theUserClicksOnLoginButtonAndEntersCredentials(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : credentials) {
            String username = row.get("username");
            String password = row.get("password");

            if ("null".equals(username)) {
                username = null;
            }
            if ("null".equals(password)) {
                password = null;
            }

            loginPage.login(username, password);
        }
    }

    @Then("The user verifies welcome message")
    public void the_user_verifies_welcome_message(DataTable dataTable) {
        List<Map<String, String>> messages = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : messages) {
            String expectedMessage = row.get("expectedMessage");

            loginPage.verifyErrorMessage(expectedMessage);
        }
    }

    @Then("The user verifies the header")
    public void theUserVerifiesTheHeader(DataTable dataTable) {
        List<Map<String, String>> headers = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : headers) {
            String expectedHeader = row.get("expectedHeader");

            loginPage.verifySwagLabsHeader(expectedHeader);
        }
    }
}

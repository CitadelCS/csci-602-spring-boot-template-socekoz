package edu.citadel.main;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class CommonStepDefinitions extends SpringIntegrationTest{
    public final ObjectMapper objectMapper = new ObjectMapper();

    @When("^the client calls /info")
    public void theClientCallsInfo() throws Throwable {
        executeGet(createURLWithPort("/info"));
    }
    @When("^the client calls /version")
    public void theClientCallsVersion() throws Throwable {
        executeGet(createURLWithPort("/version"));
    }
    @When("^the client calls /description")
    public void theClientCallsDescription() throws Throwable {
        executeGet(createURLWithPort("/description"));
    }
    @When("^the client calls /health")
    public void theClientCallsHealth() throws Throwable {
        executeGet(createURLWithPort("/health"));
    }
    @Then("^the client receives status code of (\\d+)$")
    public void theClientReceivesStatusCodeOf(int statusCode) throws Throwable {
        int currentStatusCode = responseEntity.getStatusCode().value();
        assertEquals("status code is incorrect : " +
                responseEntity.getBody(), currentStatusCode, is(statusCode));
    }
    @And("^the client receives server version (.+)$")
    public void theClientReceivesServerVersionBody(String version) throws Throwable {
        JsonNode jsonResponse = objectMapper.readTree(responseEntity.getBody());
        String actualVersion = jsonResponse.get("version").asText();
        assertThat(actualVersion, is(version));
    }
    @And("^the client receives server description (.+)$")
    public void theClientReceivesServerDescriptionBody(String description) throws Throwable {
        JsonNode jsonResponse = objectMapper.readTree(responseEntity.getBody());
        String actualDescription = jsonResponse.get("description").asText();
        assertThat(actualDescription, is(description));
    }
    @And("^the client receives system status (.+)$")
    public void theClientReceivesSystemStatusBody(String status) throws Throwable {
        JsonNode jsonResponse = objectMapper.readTree(responseEntity.getBody());
        String actualStatus = jsonResponse.get("status").asText();
        assertThat(actualStatus, is(status));
    }

}

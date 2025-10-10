package edu.citadel.main;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@CucumberContextConfiguration
@SpringBootTest

public class SpringIntegrationTest {
    @LocalServerPort
    private int port;
    protected TestRestTemplate testRestTemplate = new TestRestTemplate();
    protected ResponseEntity<String> responseEntity;
    protected void executeGet(String url) {
        responseEntity = testRestTemplate.getForEntity(url, String.class);
    }
    protected String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }

}

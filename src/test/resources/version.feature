Feature: the version can be retrieved
  Scenario: client makes call to GET /version
    When the client calls /version
    Then the client receives status code of 200
    And the client receives server version 1.0

  Scenario: client makes call to GET /description
    When the client calls /description
    Then the client receives status code of 200
    And the client receives server description "My API"

  Scenario: client makes call to GET /health
    When the client calls /health
    Then the client receives status code of 200
    And the client receies system status "UP"
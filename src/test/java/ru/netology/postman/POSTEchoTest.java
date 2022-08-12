package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class POSTEchoTest {
    @Test
    void shouldResponseEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .body("the value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("WRONG VALUE"));
    }
}




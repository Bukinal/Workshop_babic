package orgexample.api;

import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class helpers {
    public void createUnicorn(String body) {
        Map<String, String> jsonBody = new HashMap<>();
        jsonBody.put("name", "Artem");
        jsonBody.put("color", "Green");
        System.out.println(jsonBody);

        given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .post("/unicorns")
                .then()
                .assertThat().statusCode(201)
                .body("$", hasKey("_id"));
    }
}

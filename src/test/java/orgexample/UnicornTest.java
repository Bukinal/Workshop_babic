package orgexample;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class UnicornTest {
    @BeforeAll
    public static void setup() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://crudcrud.com/api/073c293746ea489292e82e4b87b4c1a7";
    }

    @Test
    public void userShouldBeAbleCreateUnicorn() {

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

    @Test
    public void userShouldBeAbleDeleteUnicorn() {

        Map<String, String> jsonBody = new HashMap<>();
        jsonBody.put("name", "Artem");
        jsonBody.put("color", "Green");
        System.out.println(jsonBody);

        String id = given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post("/unicorns")
                .then()
                .assertThat().statusCode(201)
                .body("$", hasKey("_id"))
                .extract()
                .path("_id");

        given()
                .delete("/unicorns/" + id)
                .then()
                .assertThat()
                .statusCode(200);


        given()
                .get("/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }

    @Test
    public void userShouldBeAbleUpdateUnicorn() {
        Map<String, String> jsonBody = new HashMap<>();
        jsonBody.put("name", "Artem");
        jsonBody.put("color", "Green");
        System.out.println(jsonBody);

        String id = given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post("/unicorns")
                .then()
                .assertThat().statusCode(201)
                .body("$", hasKey("_id"))
                .extract()
                .path("_id");

        jsonBody.put("color", "Blue");

        given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .put("/unicorns/" + id)
                .then()
                .assertThat().statusCode(HttpStatus.SC_OK);

        given()
                .get("/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }

}

package steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class BDDStyledMethod {

    public static void SimpleGETPost(String postNumber){
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/users/%s", postNumber)).
                then().body("firstName", is("Raghav"));
    }

    public static void PerformContainsCollection() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("http://localhost:3000/users/")
                .then()
                .body("firstName", containsInAnyOrder("Raghav", "Wiktor")).statusCode(200);
    }
}

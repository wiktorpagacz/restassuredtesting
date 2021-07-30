import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Tests_POST {

    @Test(enabled = false)
    public void test_1_post() {

//        Map<String, Object> map = new HashMap<>();
//
//        map.put("name", "Raghav");
//        map.put("job", "Teacher");
//
//        System.out.println(map);

        JSONObject request = new JSONObject();

        request.put("name", "Raghav");
        request.put("job", "Teacher");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201);
    }

    @Test(enabled = false)
    public void test_2_put() {
        JSONObject request = new JSONObject();

        request.put("name", "Raghav");
        request.put("job", "Teacher");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().all();
    }

    @Test(enabled = false)
    public void test_3_patch() {
        JSONObject request = new JSONObject();

        request.put("name", "Raghav");
        request.put("job", "Teacher");

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().all();
    }

    @Test(enabled = true)
    public void test_4_delete() {
                when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).
                log().all();
    }
}

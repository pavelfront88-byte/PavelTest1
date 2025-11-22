import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class post1 {

    @Test
    public void testPostRequestToPostmanEcho() {
        Response response = RestAssured
                .given()
                .contentType(ContentType.URLENC)
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("https://postman-echo.com/post")
                .then()
                .extract().response();
        assertEquals(200, response.statusCode());
        String actualResponseBody = response.getBody().asString();
        String expectedResponseBody = "";
        assertEquals(expectedResponseBody.trim(), actualResponseBody.trim());
    }
}

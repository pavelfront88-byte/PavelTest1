

import io.restassured.response.Response;
import org.example.get1;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GetMethodTest extends get1
{
    @Test
    void testGetRequest() {
        Response response = given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .extract().response();
        assertEquals(200, response.statusCode());
        assertEquals("bar1", response.jsonPath().getString("args.foo1"));
        assertEquals("bar2", response.jsonPath().getString("args.foo2"));
        assertEquals("get", response.jsonPath().getString("method"));
    }}
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
public class Postraw {
    @Test
    public void postRawText() {
        Object TEST_DATASTRING = null;
        given()
                // .log().all()
                .body(TEST_DATASTRING)
                .when().post("/post")
                .then()
                // .log().all()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_DATASTRING));
    }}

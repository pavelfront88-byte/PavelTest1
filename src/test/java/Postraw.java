import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
public class Postraw {
    @Test
    public void postRawText() {
        Object postraw = null;
        given()
                // .log().all()
                .body(postraw)
                .when().post("/post")
                .then()
                // .log().all()
                .assertThat().statusCode(200)
                .and().body("data", is(postraw));
    }}

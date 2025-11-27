import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
public class Put {
    @Test
    public void putRequest() {
        given()
                // .log().all()
                .when().put()
                .then()
                // .log().all()
                .assertThat().statusCode(200);
    }}
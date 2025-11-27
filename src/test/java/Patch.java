import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
public class Patch {
    @Test
    public void patchRequest() {
        given()
                // .log().all()
                .when().patch()
                .then()
                // .log().all()
                .assertThat().statusCode(200);

    }}

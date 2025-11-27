import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
public class delete {
    @Test
    public void deleteRequest() {
        given()
                // .log().all()
                .when().delete()
                .then()
                // .log().all()
                .assertThat().statusCode(200);}}

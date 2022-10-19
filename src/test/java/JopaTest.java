import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class JopaTest {
    @Test
    public void Jop(){
        given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=2")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200);
    }
}

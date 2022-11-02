import io.restassured.http.ContentType;
import jdk.jshell.spi.ExecutionControl;
import org.example.Main;

import static io.restassured.RestAssured.given;

public class ApiUser {

    public void createUser(Main model) {
        given()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON)
                .body(model)
                .post("/api/login")
                .then()
                .statusCode(400)
                .log().all();
    }

}

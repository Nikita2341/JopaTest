import org.example.Main;

public class StepUser {
    ApiUser apiUser = new ApiUser();
    public void createUser(String name, String job){
        Main model = new Main(name,job);
        apiUser.createUser(model);
    }
}

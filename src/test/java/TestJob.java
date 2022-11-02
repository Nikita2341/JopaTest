import org.testng.annotations.Test;

public class TestJob {
    StepUser stepUser = new StepUser();
    @Test
    public void firstTest(){
        stepUser.createUser("email","password");
    }
}




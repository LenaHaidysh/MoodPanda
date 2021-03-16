import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    String email = "aromantikova@mail.ru";
    String password = "aroma90";

    @Test
    public void updateMood() {
        loginPage.openPage();
        loginPage.login(email, password);
        moodPage.updateMood(10, "Awesome");

        //getWebDriver() вернет классический веб драйвер селениума
        //update mood
        //set mood
        //set description
    }
}

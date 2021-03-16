package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    public static final String EMAIL_INPUT = "#ContentPlaceHolderContent_TextBoxEmail"; //решетка вначале чтобы по ид искать
    public static final String PASS_INPUT = "#ContentPlaceHolderContent_TextBoxPassword";//
    public static final String LOGIN_BUTTON = "#ContentPlaceHolderContent_ButtonLogin";

    public void openPage(){
        open("https://moodpanda.com/Login/");
    }

    public void login(String email, String password){
        $(EMAIL_INPUT).setValue(email); //getwrappedelement чтобы работать как в селениуме
        $(PASS_INPUT).setValue(password);
        $(LOGIN_BUTTON).click();
        $(LOGIN_BUTTON).shouldNotBe(Condition.visible); //ожидания, что элемент не виден ,
        // a exist есть в доме, но не обязательно виден
        //$$(LOGIN_BUTTON).shouldHave()
    }
}

package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MoodPage {
    public static final String UPDATE_MOOD_BUTTON = "#LinkUpdate";
    public static final String SLIDER = ".ui-slider-handle"; //поиск через класс
    public static final String DESCRIPTION ="#TextBoxUpdateMoodTag";
    public static final String UPDATE_bUTTON =".ButtonUpdate";
    public static final String MYDIARY_BUTTON = ".ButtonMyDiary";


    public void clickUpdate(){
        $(UPDATE_MOOD_BUTTON).click();
    }

    public void updateMood (int rating, String description ){
        setMood(rating);
        $(DESCRIPTION).sendKeys(description);
    }

    private void setMood(int rating){
        $(SLIDER).click();
        int defaultMood=5;
        Keys direction;//направление вправо/влево
        int steps = Math.abs(rating - defaultMood); //абсолютное значение, учитывает без минуса
        if (rating> defaultMood){
            direction = Keys.RIGHT;
        } else {
            direction = Keys.LEFT;
        }
        for (int i=0; i<steps;i++){
            $(SLIDER).sendKeys(direction);
        }}
}

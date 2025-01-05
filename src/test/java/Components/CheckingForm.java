package Components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class CheckingForm {
    public void checkingTable(String text, String value) {
        $(".table-responsive").$(byText(text)).sibling(0).shouldHave(text(value));
    }
}
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HW5 {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }
    @BeforeEach
    void beforeEach() {
        Configuration.browser = "firefox";
    }
    @Test
    void hoverPractice () {
        open("https://github.com");
        $(".d-lg-flex").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(byText("Build like the best")).should(exist);
    }

    @Test
    void dragAndDropPractice () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // меняем элементы местами с помощью dragAndDrop
        $("[id=column-a]").dragAndDropTo("[id=column-b]");
        $("[id=column-a]").shouldHave(text("B"));
    }
}
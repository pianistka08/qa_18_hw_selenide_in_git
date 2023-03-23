import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideWiki {

    @BeforeAll
    static void beforeAll() {
        open("https://github.com/selenide/selenide");
        Configuration.browserSize = "1024x768";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void codeExampleJunit() {
        $("[id=wiki-tab]").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
//        $(byLinkText("Soft Assertion")).should(exist);
        $(byLinkText("Soft Assertion")).click();
        $("[id=user-content-3-using-junit5-extend-test-class").should(exist);
    }
}
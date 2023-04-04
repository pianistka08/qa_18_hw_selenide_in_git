import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWiki {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.holdBrowserOpen = true;

    }

    @BeforeEach
    void beforeEach() {
        Configuration.browser = "firefox";
    }

    @Test
    void testJunit5Class() {
        String codeExample = """
                @ExtendWith({SoftAssertsExtension.class})
                class Tests {
                  @Test
                  void test() {
                    Configuration.assertionMode = SOFT;
                    open("page.html");

                    $("#first").should(visible).click();
                    $("#second").should(visible).click();
                  }
                }
                """;
        open("/selenide/selenide");
        $("[id=wiki-tab]").click();
        $(".js-wiki-more-pages-link").click();
        $(byLinkText("SoftAssertions")).click();
        $("[id=user-content-3-using-junit5-extend-test-class").should(exist);
        $(".markdown-body").shouldHave(text(codeExample));
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
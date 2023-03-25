import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideWiki {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }

    @BeforeEach
    void beforeEach() {
        Configuration.browser = "firefox";
    }

    @Testssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC9luxUaPeaYmOTxq+WOnxF81Cdh3Fu3ufhfwrCE8Fq/syDsIkZO5dnOxgnWSx6KSpxB7ZT4rciufsltBDiNtbAPyiwcGBwj8YDkS77oHGdl42lrpUKBRrgBBxntGLquXhcIeEOMJRERs0XatbVlhxIomTn39XlT3Nj2mWcb4q/ReGaXxCuBa/gXVyiY0T+188QdOiyocAemWGMW1PH5waDUPGQz6C29gYcj48vOaXjq3k9CevZeFUZk3U5AKiPjpwVhCJxpuWS2Pit7BxqkqfeKV1WHj/S8yhwXspGiwS7mZAd2wFVnFHZkbeRBHcd9bm5R1CR+AGJRkt7/y5wtZ0RCUl74LGwhxl9h6lvPKYY4ddEcqiQOqza31rP+GVSo9ZJ/9fgFhHLk3Kv6RYJG662hmdE2LtqA6dcRMViBt0+pRa7r7+YvqRNun3EfRTr5zz73LF/HGCGgfn//jbqBTbhmD/qcTaYA8h2fgvtohZSyRtB70EZb2Set8WjOpN/k3qEjUF+OU9TYYPZO82ws4XpXshXuRY2asrG/YGTqg4ToiXx3p6jix+Ek4CNW1XUoOlBYihJlkbgRwLpstQ9w61piB0r4drFJaDnCkRMaarD3lvLIks6yIyJw4Y7VXF9q1wvmG7agVOfMRadNPz/ZjMDhOSbTShQRr1I6/ZXmkRULw== pianistka08@mail.ru

    void testJunit5Class() {
        open("https://github.com/selenide/selenide");
        $("[id=wiki-tab]").click();
        $("[id=wiki-body]").shouldHave(text("Soft Assertions"));
        $(byLinkText("Soft assertions")).click();
        $("[id=user-content-3-using-junit5-extend-test-class").should(exist);
    }
}
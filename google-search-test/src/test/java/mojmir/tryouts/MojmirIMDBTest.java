package mojmir.tryouts;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;
//import static org.junit.Assert.assertEquals;


public class MojmirIMDBTest {

    @Test
    public void googlingMojmirOnIMDBNoDiacritics() {
        open("http://google.com");
        $(By.name("q")).setValue("Mojmir Kubistel").pressEnter();
        $$(By.partialLinkText("imdb.com")).shouldHave(size(1));
        $(By.partialLinkText("imdb.com")).click();
    }

// //   With Diacritics - no result
//    @Test
//    public void googlingMojmirOnIMDBWithDiacriticsShouldNotFind() {
//        open("http://google.com");
//        $(By.name("q")).setValue("Mojmír Kubištel").pressEnter();
//        assertEquals(0, $$(By.partialLinkText("imdb.com")).size());
//    }
}

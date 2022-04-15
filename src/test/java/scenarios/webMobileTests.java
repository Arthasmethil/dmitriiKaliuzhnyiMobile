package scenarios;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tc.hw02.setup.BaseTest;
import com.epam.tc.hw02.pages.web.SearchGooglePage;
import com.epam.tc.hw02.pages.web.WebIndexPage;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class webMobileTests extends BaseTest {

    @SneakyThrows
    @Test(groups = {"web"}, description = "Make sure that we've opened IANA homepage")
    public void simpleWebTest() {

        WebIndexPage googlePage = (WebIndexPage) setDriverPage().getPage();

        SearchGooglePage searchPage = googlePage.openUrl(properties.getProperty("url"))
                                                .sendRequest(properties.getProperty("search.epam"));

        searchPage.searchTitlesList()
                  .forEach(title -> assertThat(title)
                      .as("Does not contain EPAM")
                      .contains(properties.getProperty("key.word")));
    }
}

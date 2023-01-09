package day1;

import com.microsoft.playwright.*;

public class PlaywrightTables {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://automatenow.io/sandbox-automation-testing-practice-website/");


        page.click("//*[@id=\"post-399\"]/div/div[3]/div/div[1]/div[5]/div/a");
        String title = page.title();
        System.out.println("page Title is" + title);

        page.click("//*[@id=\"tablepress-1_filter\"]/label/input");
        page.fill("//*[@id=\"tablepress-1_filter\"]/label/input","india");

        Locator row= page.locator ("table#tablepress-1 ");
        row.locator(":scope",new Locator.LocatorOptions().setHasText("2"));

        row.locator(":scope").allInnerTexts().forEach(e->System.out.println(e));

         page.close();
         playwright.close();

        //const tableRows = await page.$$('tr:has-text("Ind")');

       // for await (const tableRow of tableRows) {
        //    let rowText = await tableRow.innerText();
        //    expect(rowText).toContain("Ind");
       // }
   // });
    }
}

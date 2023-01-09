package day1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightHover {
    public static void main(String[] args) {
        Playwright playwright= Playwright.create();
       Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
       Page page=browser.newPage();
        page.navigate("https://automatenow.io/sandbox-automation-testing-practice-website/");

        String title=page.title();
        System.out.println("page Title is"+title);

        page.click("//*[@id=\"post-399\"]/div/div[3]/div/div[2]/div[5]/div/a");

        page.hover("//*[@id=\"mouse_over\"]");
        String text1=page.textContent("//*[@id=\"mouse_over\"]");
        System.out.println(text1);

      //  page.getByText("//*[@id=\"mouse_over\"]");

       // page.close();
      //  playwright.close();
    }
}

package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        jar dosyalarini yukleyerek selenium u kullanilir hale getirdik.
        Ancak her bir class in hangi browswe ile calismasini istiyorsak,
         o browser ile ilgilidriver i class da tanimlamamiz lazim.

         Browser ile ilgili tercihimiz dogrultusunda ilgili ayarlari yapmak icin
          javadaki  system class indan setProperty() kullanilir.

          Method a 2 parametre ekleyecegiz.
          1.parametre herkes icin ayni: Webdriver.chrome.driver
          2.parametre bu driver in dosya yolu herkesin bilgisayarinda farkli olabilir.
          Windows bilgisayarlarda sonunda .exe yazilmalidir. Mac lerde .exe yazilmaz.
         */

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();

        // istenen sayfaya gitmek icin;

        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);

        driver.close();

    }
}

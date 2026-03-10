package TestPrograms;

import java.net.HttpURLConnection;
import java.net.URL;




//Broken Links in Slenium




public class BrokenLinks {

    /*public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link : links){

            String url = link.getAttribute("href");

            if(url == null || url.isEmpty()){
                continue;
            }

            URL linkURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();

            connection.connect();

            if(connection.getResponseCode() >= 400){
                System.out.println(url + " → Broken Link");
            }
            else{
                System.out.println(url + " → Valid Link");
            }
        }

        driver.quit();
}*/
}
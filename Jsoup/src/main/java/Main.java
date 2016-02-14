import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by HP on 2016-02-14.
 */
public class Main {

    public static void main(String args[]) throws IOException {
        Document doc = Jsoup.connect("https://kibr.org.pl/pl/rejestr_bieglych").get();
        Elements node = doc.getElementsByClass("podmiot_desc");

        String name;
        String surname;
        String email;

        for (Element item : node) {
            String[] strArray = item.text().split(" ");
            name = strArray[0];
            surname = strArray[1];
            email = strArray[0] + "." + strArray[1] + "@gmail.com";
            System.out.println("Name: " + name + " , and surname: " + surname + " oraz emial: " + email);
        }

    }
}

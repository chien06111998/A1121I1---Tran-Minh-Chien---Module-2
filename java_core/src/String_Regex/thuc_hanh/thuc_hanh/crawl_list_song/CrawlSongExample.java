package String_Regex.thuc_hanh.thuc_hanh.crawl_list_song;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        URL url;
        {
            try {
                url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
                Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
                sc.useDelimiter("\\Z");
                String content = sc.next();
                sc.close();
                content = content.replace("\\n+", "");
                Pattern pattern = Pattern.compile("name_song\">(.*>)</a>");
                Matcher matcher = pattern.matcher(content);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

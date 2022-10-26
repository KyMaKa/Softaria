package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class UrlsParser {

  private final Hashtable<String, String> todayUrls = new Hashtable<>();
  private final Hashtable<String, String> yesterdayUrls = new Hashtable<>();

  public void getUrls(String todaySource, String yesterdaySource) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(todaySource));
    while (reader.ready())
      todayUrls.put(reader.readLine(), reader.readLine());
    reader = new BufferedReader(new FileReader(yesterdaySource));
    while (reader.ready())
      yesterdayUrls.put(reader.readLine(), reader.readLine());
  }

  public Hashtable<String, String> getTodayUrls() {
    return this.todayUrls;
  }

  public Hashtable<String, String> getYesterdayUrls() {
    return this.yesterdayUrls;
  }

}

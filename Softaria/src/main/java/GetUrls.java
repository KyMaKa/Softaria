package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class GetUrls {

  static Hashtable<String, String> todayUrls = new Hashtable<>();
  static Hashtable<String, String> yesterdayUrls = new Hashtable<>();

  void getUrls() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/todayUrls.txt"));
    while (reader.ready())
      todayUrls.put(reader.readLine(), reader.readLine());
    reader = new BufferedReader(new FileReader("src/main/resources/yesterdayUrls.txt"));
    while (reader.ready())
      yesterdayUrls.put(reader.readLine(), reader.readLine());
  }

}

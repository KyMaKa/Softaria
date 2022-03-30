package main.java;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    GetUrls urls = new GetUrls();
    Changes changes = new Changes();
    Message message = new Message("Ирина", "Никулина");

    urls.getUrls();

    changes.getChanges(GetUrls.yesterdayUrls, GetUrls.todayUrls);

    System.out.println(message.writeMessage(Changes.added, Changes.deleted, Changes.changed));

  }
}

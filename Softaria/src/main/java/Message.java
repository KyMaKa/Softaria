package main.java;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class Message {

Secretary secretary;

  public Message(String name, String middle_name) {
    this.secretary = new Secretary(name, middle_name);
  }

  public String writeMessage(Set<String> added, Set<String> deleted,
      Set<String> changed) throws IOException {

    return "Здравствуйте, дорогая " + secretary.getFirst_name() + " " + secretary.getMiddle_name() + " \n" +
        "За последние сутки во вверенных Вам сайтах произошли следующие изменения:\n" +
        "Исчезли следующие страницы:"+deleted.toString().replaceAll("(^.)|(.$)|(, )","\n")+
        "Появились следующие новые страницы "+added.toString().replaceAll("(^.)|(.$)|(, )","\n") +
        "Изменились следующие страницы "+changed.toString().replaceAll("(^.)|(.$)|(, )","\n") +
        "С уважением,\n" +
        "автоматизированная система мониторинга";
  }
}

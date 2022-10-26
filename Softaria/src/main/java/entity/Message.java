package entity;

import java.util.Set;


public class Message {

private final Secretary secretary;

  public Message(Secretary secretary) {
    this.secretary = secretary;
  }

  public final String writeMessage(Set<String> added, Set<String> deleted,
      Set<String> changed) {

    return "Здравствуйте, дорогая " + secretary.getFirstName() + " " + secretary.getMiddleName() + " \n" +
        "За последние сутки во вверенных Вам сайтах произошли следующие изменения:\n" +
        "Исчезли следующие страницы:"+deleted.toString().replaceAll("(^.)|(.$)|(, )","\n")+
        "Появились следующие новые страницы "+added.toString().replaceAll("(^.)|(.$)|(, )","\n") +
        "Изменились следующие страницы "+changed.toString().replaceAll("(^.)|(.$)|(, )","\n") +
        "С уважением,\n" +
        "автоматизированная система мониторинга";
  }
}

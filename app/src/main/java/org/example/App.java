/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;





public class App {
  public static void main(String[] args) {
    try {
      String botToken = "7849739712:AAGUU_05X4wX91mjYop8NRMRDpPP5pINn5A";
      TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication();
      botsApplication.registerBot(botToken, new TelegramBot());
    } catch (TelegramApiException e) {
      e.printStackTrace();
    }
  }
}

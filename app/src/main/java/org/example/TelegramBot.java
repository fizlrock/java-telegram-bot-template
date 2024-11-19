package org.example;

import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * TelegramBot
 */
public class TelegramBot implements LongPollingSingleThreadUpdateConsumer {
   // private TelegramClient telegramClient = new OkHttpTelegramClient("12345:YOUR_TOKEN");

   @Override
   public void consume(Update update) {
      System.out.println(update);
      // We check if the update has a message and the message has text
      // if (update.hasMessage() && update.getMessage().hasText()) {
      //     // Create your send message object
      //     SendMessage sendMessage = new SendMessage(update.getMessage().getChatId(), update.getMessage().getText());
      //     try {
      //        // Execute it
      //        telegramClient.execute(method);
      //     } catch (TelegramApiException e) {
      //        e.printStackTrace();
      //     }
      // }
   }
}


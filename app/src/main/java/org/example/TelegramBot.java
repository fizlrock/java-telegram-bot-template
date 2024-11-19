package org.example;

import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

/**
 * TelegramBot
 */
public class TelegramBot implements LongPollingSingleThreadUpdateConsumer {

   String botToken = "7849739712:AAGUU_05X4wX91mjYop8NRMRDpPP5pINn5A";
   
   TelegramClient tgClient = new OkHttpTelegramClient(botToken);

   @Override
   public void consume(Update update) {

      if (update.hasMessage() && update.getMessage().hasText()) {
          // Create your send message object
          // SendMessage sendMessage = new SendMessage(update.getMessage().getChatId(), update.getMessage().getText());

          SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), update.getMessage().getText());

          try {
             // Execute it
             tgClient.execute(sendMessage);
          } catch (TelegramApiException e) {
             e.printStackTrace();
          }
      }
   }
}


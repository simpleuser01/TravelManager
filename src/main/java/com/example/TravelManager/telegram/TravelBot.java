package com.example.TravelManager.telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import static com.example.TravelManager.telegram.ConnectToDb.getDataFromDb;

public class TravelBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update){

        String command = update.getMessage().getText().trim();
        SendMessage message = new SendMessage();

        if(command.equals("/info")){
            message.setText("Введите название города");
            message.setChatId(update.getMessage().getChatId());
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
        String dataFromDb = getDataFromDb(command);

        message.setText(dataFromDb);
        message.setChatId(update.getMessage().getChatId());
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotUsername() {
        return "super_travel_bot";
    }

    @Override
    public String getBotToken() {
        return "782998534:AAEIUfUdvAih0GRbqPepFT3X6oRyHUtDEvI";
    }

}

package com.example.TravelManager;

import com.example.TravelManager.telegram.TravelBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class TravelManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelManagerApplication.class, args);
    }
    @Bean
    public void registerWithTelegram() {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new TravelBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

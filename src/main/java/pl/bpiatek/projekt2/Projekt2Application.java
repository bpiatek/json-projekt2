package pl.bpiatek.projekt2;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import pl.bpiatek.projekt2.exchange.api.ExchangeClient;

import java.math.BigDecimal;
import java.util.Scanner;

@SpringBootApplication
@EnableFeignClients
public class Projekt2Application implements CommandLineRunner {

  private final ExchangeClient exchangeClient;

  public Projekt2Application(ExchangeClient exchangeClient) {this.exchangeClient = exchangeClient;}

  public static void main(String[] args) {
    SpringApplication.run(Projekt2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Podaj kod waluty:");
    Scanner scanner = new Scanner(System.in);
    String rate = scanner.nextLine().trim().toUpperCase();

    BigDecimal responseRate = exchangeClient.getEuroRates().getRates().get(rate);

    String responseToUser = responseRate == null ? "Nie ma takiej waluty" : "Dzisiejszy kurs EUR/" + rate + " to: " + responseRate;

    System.out.println(responseToUser);
  }
}

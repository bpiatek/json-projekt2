package pl.bpiatek.projekt2.exchange.api;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bartosz Piatek on 22/05/2020
 */
@Configuration
class ClientConfiguration {

  @Bean
  public OkHttpClient client() {
    return new OkHttpClient();
  }
}

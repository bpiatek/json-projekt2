package pl.bpiatek.projekt2.exchange.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Bartosz Piatek on 22/05/2020
 */
@FeignClient(value = "exchangeclient", url = "https://api.exchangeratesapi.io/latest", configuration = ClientConfiguration.class)
public interface ExchangeClient {

  @GetMapping
  ExchangeResponse getEuroRates();
}

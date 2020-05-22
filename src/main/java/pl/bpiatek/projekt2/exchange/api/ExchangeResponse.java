package pl.bpiatek.projekt2.exchange.api;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

/**
 * Created by Bartosz Piatek on 22/05/2020
 */
@Getter
@AllArgsConstructor
public class ExchangeResponse {
  private String base;
  private LocalDate date;
  private Map<String, BigDecimal> rates;
}

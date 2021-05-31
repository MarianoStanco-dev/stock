package com.prueba.stockclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    // clase para el stock de precios StockPrice
    public class StockPrice {
        private String symbol;
        private Double price;
        private LocalDateTime time;
    }


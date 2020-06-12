package com.dish.demo.model;

import java.math.BigDecimal;

public class EquipmentC implements Equipment {
    @Override
    public BigDecimal calculateUsageAmount() {
        return BigDecimal.TEN;
    }
}

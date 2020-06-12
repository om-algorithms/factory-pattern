package com.dish.demo.model;

import java.math.BigDecimal;

public class EquipmentB implements Equipment {
    @Override
    public BigDecimal calculateUsageAmount() {
        return BigDecimal.valueOf(5.59);
    }
}

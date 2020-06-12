package com.dish.demo.model;

import java.math.BigDecimal;

public class EquipmentA implements Equipment {
    @Override
    public BigDecimal calculateUsageAmount() {
        return BigDecimal.ONE;
    }
}

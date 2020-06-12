package com.dish.demo.service;

import com.dish.demo.model.Equipment;
import com.dish.demo.model.EquipmentA;
import com.dish.demo.model.EquipmentB;
import com.dish.demo.model.EquipmentC;

import static com.dish.demo.service.EquipmentType.*;

public class EquipmentFactory {

    private EquipmentFactory() {
    }

    static Equipment crateEquipment(EquipmentType equipmentType) {
        if (equipmentType.equals(A)) {
            return new EquipmentA();
        }

        if (equipmentType.equals(B)) {
            return new EquipmentB();
        }

        if (equipmentType.equals(C)) {
            return new EquipmentC();
        }

        throw new IllegalArgumentException();
    }
}

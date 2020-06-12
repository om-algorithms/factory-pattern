package com.dish.demo.service;

import com.dish.demo.model.Equipment;
import com.dish.demo.model.EquipmentA;
import com.dish.demo.model.EquipmentB;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.dish.demo.service.EquipmentType.*;

public class EquipmentLambdaFactory {

    static final Map<EquipmentType, Supplier<Equipment>> equipmentTypeMap = new EnumMap<>(EquipmentType.class);

    static {
        equipmentTypeMap.put(A, EquipmentA::new);
        equipmentTypeMap.put(B, EquipmentB::new);
        equipmentTypeMap.put(C, EquipmentA::new);
    }

    private EquipmentLambdaFactory() {
    }

    static Equipment crateEquipment(EquipmentType equipmentType) {
        return equipmentTypeMap.get(equipmentType)
                               .get();
    }
}

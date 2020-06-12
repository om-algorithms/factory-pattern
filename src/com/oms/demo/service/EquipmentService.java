package com.dish.demo.service;

import com.dish.demo.model.Equipment;

import java.math.BigDecimal;

public class EquipmentService {
    void processEquipments(){
        System.out.println("Do something");

        final Equipment equipment1 = EquipmentFactory.crateEquipment(EquipmentType.A);
        final BigDecimal amount1 = equipment1.calculateUsageAmount();
        System.out.println("amount1 = " + amount1);

        final Equipment equipment2 = EquipmentFactory.crateEquipment(EquipmentType.B);
        final BigDecimal amount2 = equipment2.calculateUsageAmount();
        System.out.println("amount2 = " + amount2);


        final Equipment equipment3 = EquipmentFactory.crateEquipment(EquipmentType.C);
        final BigDecimal amount3 = equipment3.calculateUsageAmount();
        System.out.println("amount3 = " + amount3);

        final BigDecimal sum = amount1.add(amount2)
                                      .add(amount3);
        System.out.println("sum = " + sum);

    }


    public void processEquipmentsUsingLambda(){
        System.out.println("Do something");

        final Equipment equipment1 = EquipmentLambdaFactory.crateEquipment(EquipmentType.A);
        final BigDecimal amount1 = equipment1.calculateUsageAmount();
        System.out.println("amount1 = " + amount1);

        final Equipment equipment2 = EquipmentLambdaFactory.crateEquipment(EquipmentType.B);
        final BigDecimal amount2 = equipment2.calculateUsageAmount();
        System.out.println("amount2 = " + amount2);


        final Equipment equipment3 = EquipmentLambdaFactory.crateEquipment(EquipmentType.C);
        final BigDecimal amount3 = equipment3.calculateUsageAmount();
        System.out.println("amount3 = " + amount3);

        final BigDecimal sum = amount1.add(amount2)
                                      .add(amount3);
        System.out.println("sum = " + sum);

    }
    public static void main(String[] args) {
        EquipmentService equipmentService = new EquipmentService();
        equipmentService.processEquipmentsUsingLambda();
    }
}

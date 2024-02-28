package org.example;

public class CreditUI {
    // polymorphism
    public void CalculateCredit(BaseCreditManager baseCreditManager){
        baseCreditManager.Calculate();
    }
}

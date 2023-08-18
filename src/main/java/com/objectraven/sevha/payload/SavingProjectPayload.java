package com.objectraven.sevha.payload;

import com.objectraven.sevha.enums.CurrencyEnum;
import lombok.Data;
import java.time.LocalDate;

@Data
public class SavingProjectPayload {
    private String description;
    private Double target;
    private Double currentSaving;
    private LocalDate targetDate;
    private CurrencyEnum currency;

    public SavingProjectPayload(String description, Double target, Double currentSaving,
                                LocalDate targetDate, CurrencyEnum currency) {
        this.description = description;
        this.target = target;
        this.currentSaving = currentSaving;
        this.targetDate = targetDate;
        this.currency = currency;
    }
}

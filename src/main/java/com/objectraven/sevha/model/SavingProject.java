package com.objectraven.sevha.model;

import com.objectraven.sevha.enums.CurrencyEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SavingProject extends BaseEntity{
    private String description;
    private Double target;
    private Double currentSaving;
    private LocalDate targetDate;
    private CurrencyEnum currency;
}

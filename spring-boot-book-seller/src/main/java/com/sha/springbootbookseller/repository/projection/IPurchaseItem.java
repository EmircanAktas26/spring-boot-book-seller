package com.sha.springbootbookseller.repository.projection;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IPurchaseItem
{
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}

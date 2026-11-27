package se.iths.viggo.laboration2.model;

import java.time.LocalDate;

public class AccessCard {
    private static Integer id = 0;

    private Integer accessCardId;
    private final String cardNumber;
    private final LocalDate issueDate;
    private final LocalDate validityDate;

    public AccessCard(String cardNumber, LocalDate issueDate, LocalDate validityDate) {
        id++;
        this.accessCardId = id;
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.validityDate = validityDate;
    }

    public Integer getAccessCardId() {
        return accessCardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getValidityDate() {
        return validityDate;
    }
}

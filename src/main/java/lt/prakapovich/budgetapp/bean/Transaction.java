package lt.prakapovich.budgetapp.bean;

import java.util.Calendar;

public class Transaction {
    private Calendar date;
    private String type;
    private String party;
    private String narrative;
    private double amount;
    
    public Transaction(Calendar date, String type, String party, String narrative, double amount) {
        this.date = date;
        this.type = type;
        this.party = party;
        this.narrative = narrative;
        this.amount = amount;
    }
    
    public Transaction() {
    }

    public Calendar getDate() {
        return date;
    }
    public void setDate(Calendar date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getParty() {
        return party;
    }
    public void setParty(String party) {
        this.party = party;
    }
    public String getNarrative() {
        return narrative;
    }
    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((party == null) ? 0 : party.hashCode());
        result = prime * result + ((narrative == null) ? 0 : narrative.hashCode());
        long temp;
        temp = Double.doubleToLongBits(amount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Transaction other = (Transaction) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (party == null) {
            if (other.party != null)
                return false;
        } else if (!party.equals(other.party))
            return false;
        if (narrative == null) {
            if (other.narrative != null)
                return false;
        } else if (!narrative.equals(other.narrative))
            return false;
        if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
            return false;
        return true;
    }

    @Override
    public String toString() {
        // Get the current date
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH) + 1; // January is represented by 0
        int day = date.get(Calendar.DAY_OF_MONTH);
        String dateString = String.format("%d-%02d-%02d", day, month, year);
        return "Transaction [date=" + dateString + ", type=" + type + ", party=" + party + ", narrative=" + narrative
                + ", amount=" + amount + "]";
    }

    

    
}

package behavior.Chain_of_Responsibility;

public class Money {
    protected int amt;

    public Money(int amt) {
        this.amt = amt;
    }

    public Money() {
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        if (amt > 0 && amt <= 40_000 && amt % 5 == 0) {
            this.amt = amt;
        } else {
            throw new RuntimeException("Сумма денег должна быть не более 40 000 и кратна 5");
        }
    }
}
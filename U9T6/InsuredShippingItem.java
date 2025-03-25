package U9T6;

public class InsuredShippingItem extends ShippingItem {
    private double insuredAmount;

    public InsuredShippingItem(double w, double insAmt) {
        super(w); 
        insuredAmount = insAmt; 
    }

    public double getInsuredAmount() {
        return insuredAmount;
    }

    @Override
    public double getCost() {
        return insuredAmount + super.getCost(); 
    }

    public void addMoreInsurance(double amt) {
        insuredAmount += amt;
    }
}

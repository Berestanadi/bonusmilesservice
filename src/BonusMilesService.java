public class BonusMilesService {
    public int calculate (int price, int amountmiles) {
        int miles = price / amountmiles;
        return miles;
    }
}

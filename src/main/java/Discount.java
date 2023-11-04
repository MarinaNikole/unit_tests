public class Discount {
    public int discountCalc(int i, int after18) {

//на каждую вторую покупку скидка 2%
//после 18:00 +2%
//int i - номер покупки
//int after18 часов (0, 1) - после 18 или нет

        int result = 0;

        if (i <=0){
            return 0;
        }
        if (i % 2 == 0) {
            result = result + 2;
        }
        if (after18 == 1){
            result = result + 2;
        }
        return result;
    }


}


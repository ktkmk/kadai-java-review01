public class Review01{

        public static void main(String[] args) {
            int price=1500;
            double rate=0.1;
            int tax_price=tax(price,rate);
            int total=price+tax_price;
            System.out.println(price+"円の商品の税価格は"+total+"円（消費税は"+tax_price+"円）です。");
        }

        public static int tax(int price,double rate){
            int tax=(int)(price*rate);
            return tax;
        }

}

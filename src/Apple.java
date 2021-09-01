public class Apple {
    public static int knapsack(int num, int appleshop1, int priceshop1, int appleshop2, int priceshop2)
    {
        int answer = 0;

        float pricePerApple1 = (float) priceshop1/appleshop1;
        float pricePerApple2 = (float) priceshop2/appleshop2;

        float totalPrice1 = pricePerApple1 * num;
        float totalPrice2 = pricePerApple2 * num;

        int a1 = 0, a2 = 0;
        int a=0,b=0;

        for(int i = 1; i<num;i++){
            if(totalPrice1 < totalPrice2){
                a1 = (i*priceshop1);
                totalPrice1 = totalPrice1 + pricePerApple1;
                System.out.println(a1);
            }
            if(totalPrice2 > totalPrice1){
                a2 = (i*priceshop2);
                totalPrice2 = totalPrice2 - pricePerApple1;
                System.out.println(a2);
            }

        }
        System.out.println(a1 + " "+ a2);
        answer = a1 + a2;

        return answer;
    }

    // 0–1 Knapsack problem
    public static void main(String[] args)
    {
        int r = knapsack(19,3,10,4,15);
        System.out.println(r);
    }
}

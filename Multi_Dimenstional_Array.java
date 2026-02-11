public class Multi_Dimenstional_Array {
    public static void main(String[] args) {
        int nums[][] = new int[3][4]; // 3rows and 4columns

         for(int i =0; i<3; i++){

            for(int j=0; j<4; j++){
               nums [i][j] = (int)(Math.random() * 10); // here Math.random() is used to generate random values and random() give decimal values thats why to get whole number we have multiplied it by 10(for single number) or 100(for 2gigit numbers), also did type casting double to int
            }
        }
    

        for(int i =0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        //Enhanced For Loop
        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

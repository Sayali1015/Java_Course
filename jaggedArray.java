public class jaggedArray {
        public static void main(String[] args) {
        int nums[][] = new int[3][]; //here if we dont know about the elements/Columns size then it is called as jagged array, Then we need to individually specify how many columns we have 

        nums[0] = new int[3]; // jagged array
        nums[1] = new int[4]; // jagged array
        nums[2] = new int[2]; // jagged array



         for(int i =0; i<nums.length; i++){

            for(int j=0; j<nums[i].length; j++){
               nums [i][j] = (int)(Math.random() * 10); 
            }
        }

        //Enhanced For Loop here no need to define of the array it will automatically take the size of the array
        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}


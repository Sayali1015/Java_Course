public class forEachLoop_Array {
    public static void main(String[] args) {
        int nums[] = new int[4];

        nums[0]=16;
        nums[1]=90;
        nums[2]=78;
        nums[3]=24;

        //Normal For Loop
        // for(int i = 0; i<nums.length;i++){
        //     System.out.print(nums[i] + " ");
        // }

        //ForEach Loop(which only works with array and array type of data)

        for(int n : nums){  //Here this from nums, give me one value at a time.

            System.out.println(n);
        }
    }
}

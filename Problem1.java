public class Problem1 {


    public static void main(String[] args) {
        //example 1
//        int[] arr1 = {2,7,11,15};
//        int sum = 9; //0,1

//        int[] arr1 = {2,7,11,15};
//        int sum = 18; //1,2
//        int[] arr1 = {2,7,11,15};
//        int sum = 26; //2,3
        int[] arr1 = {1,5,3,6,9,22,3,21,77,23,9};
//        int sum = 18; //4,10
        int sum = 99 ;//5,8
        int[] sol = twosum(arr1,sum);
        System.out.println("solution : ");
        System.out.println(sol[0]+" , "+sol[1]);
        //when there is a solution
        System.out.println("numbers : "+arr1[sol[0]]+" , "+arr1[sol[1]]);


    }

    public static int[] twosum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){
                int diff = target - arr[i];
                if (arr[j]==diff){
                    return new int[] {i,j}; //array containing index of those
                        // two numbers
                }
            }
        }
        return new int[] {}; //empty array otherwise
    }
}


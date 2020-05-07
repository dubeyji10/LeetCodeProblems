package LeetCodeProblems;

public class Problem9 {
    public static void main(String[] args) {

        System.out.println(-123+"--------------------"+isPalindrome(-123));
        System.out.println(123+"--------------------"+isPalindrome(123));
        System.out.println(32123+"--------------------"+isPalindrome(32123));
        System.out.println(10+"--------------------"+isPalindrome(10));
        System.out.println(1000000001+"----------------"+isPalindrome(1000000001));
        System.out.println(0+"---------------"+reverse(0));
    }

    public static boolean isPalindrome(int x) {

        if(x>=0){

            int n=x;
            if(x==reverse(n)){
                return true;
            }
        }
        return false;
    }


    public static int reverse(int num){

        int num2=num;
        int rev=0;
        while (num2>0){
            rev = (10*rev)+(num2%10);
            num2/=10;
        }
        return rev;
    }


}

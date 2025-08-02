class Solution {
    public void sort012(int[] arr) {
        // code here
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        int bount=0;
        for(int i=0;i<zero;i++){
            arr[bount]=0;
            bount++;
        }
        for(int i=0;i<one;i++){
            arr[bount]=1;
            bount++;
        }
        for(int i=0;i<two;i++){
            arr[bount]=2;
            bount++;
        }
    }
}
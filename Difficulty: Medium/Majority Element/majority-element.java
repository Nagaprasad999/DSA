class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : ans.entrySet()){
    
            if(entry.getValue()>arr.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
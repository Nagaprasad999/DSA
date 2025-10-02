class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
for(int i=0;i<a.length;i++){
    ans.add(a[i]);
}
for(int i=0;i<b.length;i++){
    ans.add(b[i]);
}

Collections.sort(ans);
int count=0;
for(int i=0;i<a.length;i++){
    a[i]=ans.get(count++);
}
for(int i=0;i<b.length;i++){
    b[i]=ans.get(count++);
}

    }
}

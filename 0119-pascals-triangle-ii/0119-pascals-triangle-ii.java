class Solution {
    public List<Integer> getRow(int rowIndex) {
     List<Integer> ansrow=new ArrayList<>();
     long ans=1;
     ansrow.add(1) ;

     for(int col=1;col<=rowIndex;col++){
        ans=ans*(rowIndex-col+1);
        ans=ans/col;
        ansrow.add((int)ans);
     }  
     return ansrow;
    }
}
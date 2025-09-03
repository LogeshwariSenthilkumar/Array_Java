class Array30{
    public static void main(String[] args){
        int[] arr={2,3,4,5};
        boolean haszero=false;
        boolean hasminusone=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                haszero=true;
                }
            if(arr[i]==-1){
              hasminusone=true;
            }
        }
        if(haszero && hasminusone){
            System.out.println("The Array Does Contain 0 and -1");
        }
        else{
             System.out.println("The Array Doesnot Contain 0 and -1");
        }
    }
}
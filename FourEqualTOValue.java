class Array43{
    public static void main(String[] args){
        int[] arr={4,2,3,5,6,1,7,8};
        int value=10;
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
                for(int k=j+1;k<arr.length-1;k++){
                       for(int h=k+1;h<arr.length;h++){
                             if((arr[i]+arr[j]+arr[k]+arr[h])==value){
                                  System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[h]);
                             }
                         }
                 }
           }
        }
    }
}
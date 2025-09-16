class Array35{
    public static void main(String[] args){
        int[] arr={1,2,4,5,6,3};
        int num=6;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               for(int k=j+1;k<arr.length;k++){
                  if((arr[i]+arr[j]+arr[k])==num){
                    System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                  }
               }
            }
        }
    }
}
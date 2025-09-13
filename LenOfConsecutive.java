class Array34{
    public static void main(String[] args){
        int[] arr={49, 1, 3, 200, 2, 4, 70, 5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
     
        int consecutive=1,longer=1;
          for(int i=1;i<arr.length;i++){
                if(arr[i]==arr[i-1]+1){
                  consecutive++;
                  longer=Math.max(longer,consecutive);
                }
                else if(arr[i]!=arr[i-1]){
                    consecutive=1;
                }
        }
        System.out.print(longer);
    }
}
class Array33{
    public static void main(String[] args){
        int[] arr={20, 20, 30, 40, 50, 50, 50};
        int[] newarr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<index;j++){
                if(arr[i]==newarr[j]){
                    isDuplicate=true;
                }
            }
            if(!isDuplicate){
                newarr[index++]=arr[i];
            }
        }
      System.out.print("Updated Length : "+index);
    }
}
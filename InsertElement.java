//insert element:
class Array9{
    public static void main(String[] args){
        int[] arr={1,2,4,5};
        int[] newarr=new int[arr.length+1];
        int index=2;
        int element=3;
        for(int i=0;i<index;i++){
            newarr[i]=arr[i];
        }
        newarr[index]=element;
        for(int i=index;i<arr.length;i++){
            newarr[i+1]=arr[i];
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
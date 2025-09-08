class Array13{
    public static void main(String[] args){
        String[] str={"Logu","Chitra","Janani","Logu","Chitra"};
        System.out.println("The Duplicate Elements are : ");
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    System.out.println(str[i]);
                }
            }
        }
    }
}
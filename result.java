class result{
    public static void main(String[] args){
        sequence s = new sequence();
        s.seq(2,3);

    }
}



class sequence{
    public void seq(int a, int b){
        int flag=0;
        int len1=a;
        int len2=b;
        int count=0;
        
        while(true){
            
            if(flag ==0){
                System.out.print(len1);
                for(int i=0;i<len1;i++){
                flag =1; 
                System.out.print(len2);
                }
            }
            System.out.print(len1);
            for(int j =0 ; j<len2;j++){
                System.out.print(len2);
                
            }
            count++;
                if(count == len1){
                    flag=0;
                    count =0;                }
            
        }
    }
}
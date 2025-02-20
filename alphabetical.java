/*ALPHABETICAL ORDERING OF STRING */

public class alphabetical {
    static String name[]={"badsha","mim","sweety","lamia"};
    public static void main(String args[]){
        int size=name.length;
        String temp=null;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(name[j].compareTo(name[i])<0)
                {
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(name[i]);
        }
    }

    
}

 class inheritance {
    protected String brand ="Ford";
    public void  honk(){
        System.out.println("Tuut,tuut!");

    }
    
}
class Car extends inheritance {
    private String modelName="Mustang";
    public static void main(String []args){
        Car myCar=new Car();//my car object
        myCar.honk();//
        System.out.println(myCar.brand +" "+myCar.modelName);

    }

}
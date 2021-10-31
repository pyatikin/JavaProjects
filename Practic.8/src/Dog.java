public class Dog extends Pet{
    @Override
    public void voice(){
        System.out.println("Woof");
    }
    Dog(String name){
        setName(name);
    }
}

public class Cat extends Pet{
    @Override
    public void voice(){
        System.out.println("Meow");
    }
    Cat(String name){
        setName(name);
    }
}

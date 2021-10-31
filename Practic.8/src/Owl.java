public class Owl extends Pet{
    @Override
    public void voice(){
        System.out.println("Hoot");
    }
    Owl(String name){
        setName(name);
    }
}

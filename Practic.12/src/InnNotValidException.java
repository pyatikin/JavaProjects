public class InnNotValidException extends Exception {


    public InnNotValidException(String inn){
        super("ИНН с номером "+ inn + " не действителен!");
    }

}
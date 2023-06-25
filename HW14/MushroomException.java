package HW14;

public class MushroomException extends Exception{

    public MushroomException(){
       super("MushroomException not found");
    }

    public MushroomException(String message){
        super(message);
    }

    public MushroomException(Object obj, String message){
        super(obj.toString() + message);
    }
}



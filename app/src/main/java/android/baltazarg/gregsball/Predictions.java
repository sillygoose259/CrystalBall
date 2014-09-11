package android.baltazarg.gregsball;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions(){
        answers = new String[]

    }

    public static Predictions get(){
        if(predictions == null)  {
            predictions = new Predictions();
        }
            return predictions;
    }
}

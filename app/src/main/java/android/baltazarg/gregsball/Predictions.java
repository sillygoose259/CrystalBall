package android.baltazarg.gregsball;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;
            // the predictions//
    private Predictions(){
        answers = new String[]{
                // the answers the user will receive//
                "Your wishes will come true",
                "Your wishes will NEVER come true",
                "Your Next",
                "Die"7
        };


    }

    public static Predictions get(){
        if(predictions == null)  {
            predictions = new Predictions();
        }
            return predictions;

    }
    public String getPrediction() {
        return answers[1];
    }
}

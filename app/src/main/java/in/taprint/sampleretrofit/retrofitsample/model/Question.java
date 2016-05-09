package in.taprint.sampleretrofit.retrofitsample.model;

/**
 * Created by kavi on 5/9/16.
 */
// This is used to map the JSON keys to the object by GSON
public class Question {

    String title;
    String link;

    @Override
    public String toString() {
        return(title);
    }
}
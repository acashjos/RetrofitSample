package in.taprint.sampleretrofit.retrofitsample;

import in.taprint.sampleretrofit.retrofitsample.model.StackOverflowQuestions;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by kavi on 5/9/16.
 */
public interface StackOverflowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<StackOverflowQuestions> loadQuestions(@Query("tagged") String tags);
}

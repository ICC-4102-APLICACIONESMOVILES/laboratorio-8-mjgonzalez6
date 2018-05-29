package cl.magnet.mobileappsexample.db;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by MariaJose on 29-05-2018.
 */

public class QuestionViewModel {
    private QuestionRepository mRepository;

    private LiveData<List<Question>> mAllQuestions;

    public QuestionViewModel(@NonNull Application application) {
        super();
        mRepository = new QuestionRepository(application);
        mAllQuestions = mRepository.getAllQuestions();
    }

    public LiveData<List<Question>> getAllQuestions() {
        return mAllQuestions;
    }

    public void insert(List<Question> questions) {
        mRepository.insert(questions);
    }
}

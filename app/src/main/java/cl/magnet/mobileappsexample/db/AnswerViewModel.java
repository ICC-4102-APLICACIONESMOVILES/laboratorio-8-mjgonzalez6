package cl.magnet.mobileappsexample.db;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by MariaJose on 29-05-2018.
 */

public class AnswerViewModel {
    private AnswerRepository mRepository;

    private LiveData<List<Answer>> mAllAnswers;

    public AnswerViewModel(@NonNull Application application) {
        super();
        mRepository = new AnswerRepository(application);
        mAllAnswers = mRepository.getmAllAnswers();
    }

    public LiveData<List<Answer>> getAllAnswers() {
        return mAllAnswers;
    }

    public void insert(List<Answer> answers) {
        mRepository.insert(answers);
    }
}

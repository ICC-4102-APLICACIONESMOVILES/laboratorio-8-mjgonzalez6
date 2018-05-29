package cl.magnet.mobileappsexample.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by MariaJose on 29-05-2018.
 */
@Dao
public interface AnswerDao {

    @Query("SELECT * FROM answer")
    LiveData<List<Answer>> getAllAnswers();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAll(Answer... answers);

    @Query("DELETE FROM answer")
    void deleteAll();

    @Insert
    void insertOnlySingleQuestion(Answer answer);
}

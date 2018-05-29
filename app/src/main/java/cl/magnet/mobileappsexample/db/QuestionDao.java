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
public interface QuestionDao {

    @Query("SELECT * FROM question")
    LiveData<List<Question>> getAllQuetions();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAll(Question... questions);

    @Query("DELETE FROM question")
    void deleteAll();

    @Insert
    void insertOnlySingleQuestion(Question question);
}

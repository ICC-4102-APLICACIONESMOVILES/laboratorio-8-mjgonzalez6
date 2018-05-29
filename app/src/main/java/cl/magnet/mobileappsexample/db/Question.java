package cl.magnet.mobileappsexample.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by MariaJose on 29-05-2018.
 */

@Entity
public class Question {
    @PrimaryKey
    private int qid;

    @ForeignKey(entity = Form.class, parentColumns = "formId", childColumns = "form")

    @ColumnInfo(name = "Content")
    private String content;

    @ColumnInfo(name = "Type")
    private String TextQuestion;

    public String getContent(){
        return content;
    }

    public int getQid() {
        return qid;
    }

    public String getTextQuestion() {
        return TextQuestion;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTextQuestion(String textQuestion) {
        TextQuestion = textQuestion;
    }
}

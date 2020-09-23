package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

// テーブル"tasks"のDTOクラス"
@Entity
@NamedQueries({
    @NamedQuery(
            name = "getAllTasks",
            query = "SELECT t FROM Task AS t ORDER BY t.id DESC"
            ),
    @NamedQuery(
            name = "getTasksCount",
            query = "SELECT COUNT(t) FROM Task AS t"
            )
})
@Table(name = "tasks")
public class Task {

    /* ID */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /* タスクの内容 */
    @Column(name = "content", length = 255, nullable = false)
    private String content;

    /* 作成日時 */
    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    /* 更新日時 */
    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at;

    // id のゲッター
    public Integer getId() {
        return id;
    }

    // id のセッター
    public void setId(Integer id) {
        this.id = id;
    }

    // content のゲッター
    public String getContent() {
        return content;
    }

    // content のセッター
    public void setContent(String content) {
        this.content = content;
    }

    // created_at のゲッター
    public Timestamp getCreated_at() {
        return created_at;
    }

    // created_at のセッター
    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    // updated_at のゲッター
    public Timestamp getUpdated_at() {
        return updated_at;
    }

    // updated_at のセッター
    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
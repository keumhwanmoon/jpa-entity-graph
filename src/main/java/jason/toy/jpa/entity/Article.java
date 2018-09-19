package jason.toy.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author jason, Moon (jason.moon.kr@gmail.com)
 * @since 2018-09-19
 */
@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany
    private List<Comment> comments;

    public Article() {
    }

    public Article(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

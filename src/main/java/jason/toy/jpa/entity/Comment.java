package jason.toy.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author jason, Moon (jason.moon.kr@gmail.com)
 * @since 2018-09-19
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    private Article article;

    public Comment() {
    }

    public Comment(String title, Article article) {
        this.title = title;
        this.article = article;
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

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}

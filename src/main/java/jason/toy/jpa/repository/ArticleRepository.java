package jason.toy.jpa.repository;

import jason.toy.jpa.entity.Article;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jason, Moon (jason.moon.kr@gmail.com)
 * @since 2018-09-19
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
    /**
     * Article에 OneToMany로 Mapping된 Comment의 기본적인 FetchType은 LAZY이다.
     * * 기본적으로 Fetch하지 않는다.
     * EntityGraph Annotation이 적용되면, attributePaths에 설정된 property에 대해서 join하여 가져온다.
     */
    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = {"comments"})
    List<Article> findByTitleLike(String title);

    List<Article> findByTitle(String title);
}

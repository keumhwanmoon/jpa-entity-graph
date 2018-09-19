package jason.toy.jpa.repository;

import jason.toy.jpa.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jason, Moon (jason.moon.kr@gmail.com)
 * @since 2018-09-19
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}

package jason.toy.jpa;

import jason.toy.jpa.entity.Article;
import jason.toy.jpa.entity.Comment;
import jason.toy.jpa.repository.ArticleRepository;
import jason.toy.jpa.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext run = SpringApplication.run(Application.class, args)) {
        }
    }

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private CommentRepository commentRepository;

    @Bean
    public CommandLineRunner run() {

        return (args) -> {
            Article a1 = new Article("하나");
            Article a2 = new Article("둘");
            Article a3 = new Article("셋");

            articleRepository.save(a1);
            articleRepository.save(a2);
            articleRepository.save(a3);

            articleRepository.flush();

            Comment c1 = new Comment("하나", a1);
            Comment c2 = new Comment("둘", a1);
            Comment c3 = new Comment("셋", a2);
            Comment c4 = new Comment("넷", a2);
            Comment c5 = new Comment("다섯", a3);
            Comment c6 = new Comment("여섯", a3);


            commentRepository.save(c1);
            commentRepository.save(c2);
            commentRepository.save(c3);
            commentRepository.save(c4);
            commentRepository.save(c5);
            commentRepository.save(c6);

            commentRepository.flush();

            articleRepository.findById(a1.getId());

            articleRepository.findByTitleLike(a1.getTitle());
            articleRepository.findByTitle(a1.getTitle());
        };
    }
}

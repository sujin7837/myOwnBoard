package myOwnBoard;


import com.springstudy.myownboard.domain.Post;
import com.springstudy.myownboard.domain.PostRepository;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class CreateTest {
    PostRepository postRepository;

    @After("")
    public void cleanUp() {
        postRepository.deleteAll();
    }

    @Test
    public void 게시물_생성_테스트() {
        String writer="홍길동";
        String contents="테스트 본문";

        postRepository.save(Post.builder())
    }
}

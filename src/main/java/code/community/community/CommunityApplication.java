package code.community.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "code.community.community.Mapper")
@SpringBootApplication
public class CommunityApplication {

    public static void main(String[] args) {

        SpringApplication.run(CommunityApplication.class, args);
    }

}

package imyeomsulck.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//배치 기능 활성화 어노테이션
@EnableBatchProcessing
@SpringBootApplication
public class BatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchApplication.class, args);
	}

}

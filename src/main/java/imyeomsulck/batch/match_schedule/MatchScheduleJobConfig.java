package imyeomsulck.batch.match_schedule;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MatchScheduleJobConfig {

    @Bean
    public Job matchScheduleJob(JobRepository jobRepository, Step step){
        return new JobBuilder("matchScheduleJob", jobRepository)
                .start(step)
                .build();
    }
}

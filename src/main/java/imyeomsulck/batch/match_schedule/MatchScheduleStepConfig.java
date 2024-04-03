package imyeomsulck.batch.match_schedule;

import imyeomsulck.batch.match_schedule.data.MatchSchedule;
import imyeomsulck.batch.match_schedule.processor.MatchScheduleProcessor;
import imyeomsulck.batch.match_schedule.reader.MatchScheduleReader;
import imyeomsulck.batch.match_schedule.writer.MatchScheduleWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@RequiredArgsConstructor
@Configuration
public class MatchScheduleStepConfig {

    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;

    @Bean
    public ItemReader<MatchSchedule> itemReader() {
        return new MatchScheduleReader();
    }

    @Bean
    public ItemProcessor<MatchSchedule,MatchSchedule> itemProcessor() {
        return new MatchScheduleProcessor();
    }

    @Bean
    public ItemWriter<MatchSchedule> itemWriter() {
        return new MatchScheduleWriter();
    }


    @Bean
    public Step matchScheduleStep(JobRepository jobRepository, PlatformTransactionManager transactionManager,
                                  ItemReader<MatchSchedule> matchScheduleReader, ItemProcessor<MatchSchedule, MatchSchedule> matchScheduleProcessor,
                                  ItemWriter<MatchSchedule> matchScheduleWriter) {
        return new StepBuilder("processMatchSchedules", jobRepository)
                .<MatchSchedule,MatchSchedule> chunk(2, transactionManager)
                .reader(matchScheduleReader)
                .processor(matchScheduleProcessor)
                .writer(matchScheduleWriter)
                .build();
    }
}

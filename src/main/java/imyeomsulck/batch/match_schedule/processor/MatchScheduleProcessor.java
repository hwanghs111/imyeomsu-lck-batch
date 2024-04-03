package imyeomsulck.batch.match_schedule.processor;


import imyeomsulck.batch.match_schedule.data.MatchSchedule;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemProcessor;

@RequiredArgsConstructor
public class MatchScheduleProcessor implements ItemProcessor<MatchSchedule, MatchSchedule> {

    @Override
    public MatchSchedule process(MatchSchedule item) throws Exception {
        return null;
    }
}

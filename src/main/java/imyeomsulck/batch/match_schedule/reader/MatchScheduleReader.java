package imyeomsulck.batch.match_schedule.reader;

import imyeomsulck.batch.match_schedule.data.MatchSchedule;
import lombok.RequiredArgsConstructor;

import org.springframework.batch.item.ItemReader;

@RequiredArgsConstructor
public class MatchScheduleReader implements ItemReader<MatchSchedule> {
    @Override
    public MatchSchedule read() throws Exception {
        return null;
    }
}

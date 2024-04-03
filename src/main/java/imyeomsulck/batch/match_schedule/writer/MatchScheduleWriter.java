package imyeomsulck.batch.match_schedule.writer;

import imyeomsulck.batch.match_schedule.data.MatchSchedule;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class MatchScheduleWriter implements ItemWriter<MatchSchedule> {
    @Override
    public void write(Chunk<? extends MatchSchedule> chunk) throws Exception {

    }
}

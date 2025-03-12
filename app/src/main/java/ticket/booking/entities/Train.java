package ticket.booking.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String, String> stationTimes;
    private List<String> stations;

    public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, String> stationTimes, List<String> stations){
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s", trainId, trainNo);
    }

}


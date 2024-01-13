package goral.psychotherapistoffice.domain.calender;
import jakarta.persistence.*;

@Entity
public class Calender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dayof;
    private String time;
    private boolean free;



    public Calender() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDayof() {
        return dayof;
    }

    public void setDayof(String dayof) {
        this.dayof = dayof;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}

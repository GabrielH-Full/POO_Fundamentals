package EnumeracaoComposicaoPOO.Entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double ValuerPerHour;
    private Integer hours;

    public HourContract(Date date, Double ValuerPerHour, Integer hours) {
        this.date = date;
        this.ValuerPerHour = ValuerPerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuerPerHour() {
        return ValuerPerHour;
    }

    public void setValuerPerHour(Double valuerPerHour) {
        ValuerPerHour = valuerPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValuerPerHour() {
        return ValuerPerHour * hours;
    }
}

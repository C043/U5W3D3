package fragnito.U5W3D3.Adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Adapter implements DataSource{
    private Info info;
    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + " " + this.info.getCognome();
    }

    @Override
    public int getEta() {
        return Period.between(this.info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()).getYears();
    }
}

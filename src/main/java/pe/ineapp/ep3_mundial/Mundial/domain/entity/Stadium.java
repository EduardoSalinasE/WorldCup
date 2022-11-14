package pe.ineapp.ep3_mundial.Mundial.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="Stadium")
@Table(
        name="tbl_stadium"
)

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stadium {

    @SequenceGenerator(
            name="stadium_sequence",
            sequenceName = "stadium_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "stadium_sequence"
    )
    @Id
    @JsonIgnore
    Long id;
    String estadio;
    String ciudad;
}

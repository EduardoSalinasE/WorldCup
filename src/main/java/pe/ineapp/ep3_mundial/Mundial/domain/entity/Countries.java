package pe.ineapp.ep3_mundial.Mundial.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="Countries")
@Table(
        name="tbl_countries"
)

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Countries {

    @SequenceGenerator(
            name="countries_sequence",
            sequenceName = "contries_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "countries_sequence"
    )
    @Id
    Long id;
    String pais;
    String continente;
    String grupo;
}

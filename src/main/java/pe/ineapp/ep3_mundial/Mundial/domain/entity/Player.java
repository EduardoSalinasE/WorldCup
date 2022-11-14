package pe.ineapp.ep3_mundial.Mundial.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name="Player")
@Table(
        name="tbl_player"
)

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player{

    @SequenceGenerator(
            name="player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    @Id
    @JsonIgnore
    Long id;
    String jugador;
    String pais;
    String edad;
}

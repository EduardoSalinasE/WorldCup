package pe.ineapp.ep3_mundial.Mundial.infrastructure.response;

import lombok.Builder;
import lombok.Data;
import pe.ineapp.ep3_mundial.Mundial.domain.entity.Stadium;

import java.util.List;

@Builder
@Data
public class StadiumResponse {
    private List<Stadium> stadiumList;
}

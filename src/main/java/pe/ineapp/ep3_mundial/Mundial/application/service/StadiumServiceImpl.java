package pe.ineapp.ep3_mundial.Mundial.application.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ineapp.ep3_mundial.Mundial.domain.entity.Stadium;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.repository.StadiumRepository;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.StadiumRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.BasicResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.StadiumResponse;

import java.util.List;

@Log4j2
@Service
public class StadiumServiceImpl implements StadiumService{

    @Autowired
    private StadiumRepository stadiumRepository;

    @Override
    public BasicResponse addStadium(StadiumRequest request) {
        try {
            stadiumRepository.save(this.buildStadiumFromRequest(request));
            return BasicResponse.whenSuccess();

        }catch(Exception e){
            log.error(e.getMessage());
            return BasicResponse.whenError(e.getMessage());
        }
    }

    public Stadium buildStadiumFromRequest(StadiumRequest request) {

        return Stadium.builder()
                .estadio(request.getEstadio())
                .ciudad(request.getCiudad())
                .build();
    }

    @Override
    public StadiumResponse getAll() {
        List<Stadium> stadiumList= stadiumRepository.findAll();
        return StadiumResponse.builder().stadiumList(stadiumList).build();
    }
}

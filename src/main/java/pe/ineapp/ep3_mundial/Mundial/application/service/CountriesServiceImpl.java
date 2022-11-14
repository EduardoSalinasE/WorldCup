package pe.ineapp.ep3_mundial.Mundial.application.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ineapp.ep3_mundial.Mundial.domain.entity.Countries;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.repository.CountriesRepository;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.ContriesRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.BasicResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.CountriesResponse;

import java.util.List;

@Log4j2
@Service
public class CountriesServiceImpl implements CountriesService{

    @Autowired
    private CountriesRepository countriesRepository;

    @Override
    public BasicResponse addCountry(ContriesRequest request) {
        try {
            countriesRepository.save(this.buildCountryFromRequest(request));
            return BasicResponse.whenSuccess();
        }catch(Exception e){
            log.error(e.getMessage());
                return BasicResponse.whenError(e.getMessage());
        }
    }

    public Countries buildCountryFromRequest(ContriesRequest request) {

        return Countries.builder()
                .pais(request.getPais())
                .continente(request.getContinente())
                .grupo(request.getGrupo()).build();
    }

    @Override
    public CountriesResponse getAll() {
        List<Countries> countriesList= countriesRepository.findAll();

        return CountriesResponse.builder().countriesList(countriesList).build();
    }
}

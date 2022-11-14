package pe.ineapp.ep3_mundial.Mundial.application.service;

import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.ContriesRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.BasicResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.CountriesResponse;

public interface CountriesService {

    public BasicResponse addCountry(ContriesRequest request);

    public CountriesResponse getAll();
}

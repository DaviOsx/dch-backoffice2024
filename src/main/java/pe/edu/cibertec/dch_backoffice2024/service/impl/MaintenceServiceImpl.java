package pe.edu.cibertec.dch_backoffice2024.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dch_backoffice2024.dto.CityDto;
import pe.edu.cibertec.dch_backoffice2024.entity.City;
import pe.edu.cibertec.dch_backoffice2024.repository.CityRepository;
import pe.edu.cibertec.dch_backoffice2024.service.MaintenanceService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class MaintenceServiceImpl implements MaintenanceService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<CityDto> findAllCitys() {

        // PARA CONSULTAR ......
        List<CityDto>citys = new ArrayList<CityDto>();
        Iterable<City> iterable = cityRepository.findAll();

        iterable.forEach(city -> {
           CityDto cityDto = new CityDto(city.getCityId(),
                                        city.getCity(),
                                        city.getLastUpdate());
           citys.add(cityDto);
        });
        return citys;

    }
}

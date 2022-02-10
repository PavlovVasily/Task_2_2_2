package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCarList(List<Car> carList, Integer count) {
        if (count != null) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carList;
        }

    }
}

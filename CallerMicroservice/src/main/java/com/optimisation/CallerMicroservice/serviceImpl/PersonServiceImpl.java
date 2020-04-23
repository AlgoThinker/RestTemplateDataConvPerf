package com.optimisation.CallerMicroservice.serviceImpl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.optimisation.CallerMicroservice.dto.PersonDto;
import com.optimisation.CallerMicroservice.entity.EmployeeDetail;
import com.optimisation.CallerMicroservice.entity.Person;
import com.optimisation.CallerMicroservice.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Person> getAllPersons() {       // ToDo : Change List type to PersonDto

        return getAllPersonsFromMockRepository();
    }

    public List<Person> getAllPersonsFromMockRepository() {

        List<EmployeeDetail> allEmpDetails = getAllEmployeeDetailsRESTTemplate();
        List<Person> allPersons = new ArrayList<>();

        for (EmployeeDetail ed : allEmpDetails) {
            allPersons.add(new Person(ed.getId(), ed.getFirstName() + " " + ed.getLastName(), ed, "30"));
        }

        return allPersons;

    }

    public List<EmployeeDetail> getAllEmployeeDetailsRESTTemplate() {

        ResponseEntity<String> empDetailResponse = restTemplate.exchange(
                "http://localhost:8081/employees/all-employees", HttpMethod.GET, null, String.class);
        String employeesDetailsJson = empDetailResponse.getBody();

        JsonParser parser = new JsonParser();
        JsonElement tradeElement = parser.parse(employeesDetailsJson);
        JsonArray arr = tradeElement.getAsJsonArray();

        ArrayList<JsonObject> list = new ArrayList<>();
        arr.forEach(jsonElement -> list.add(jsonElement.getAsJsonObject()));

        List<EmployeeDetail> employeeDetail = list.stream().parallel().map(empJsonObject
                -> new Gson().fromJson(empJsonObject, EmployeeDetail.class)).collect(Collectors.toList());

        return employeeDetail;

    }

}

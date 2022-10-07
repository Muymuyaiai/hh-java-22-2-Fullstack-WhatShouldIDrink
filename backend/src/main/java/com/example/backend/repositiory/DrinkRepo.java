package com.example.backend.repositiory;

import com.example.backend.model.Drink;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface DrinkRepo extends MongoRepository <Drink, String> {


}

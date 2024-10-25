package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;  // This imports assertFalse, assertTrue, assertEquals, etc.


public class CustomListTest {
    private CustomList list;

    /**
     * Create a mock list for city list
     * @return an empty CustomList
     */
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());  // Passing null as we don't need the first parameter here
        return list;
    }

    /**
     * Test to check if a city is added to the list and the size increases by one
     */
    @Test
    public void addCityTest() {
        list = MockCityList();  // Initialize the mock list
        int initialSize = list.getCount();  // Get the initial size of the list, should be 0
        list.addCity(new City("Estevan", "SK"));  // Add a new city to the list
        assertEquals(list.getCount(), initialSize + 1);  // Check if the size increased by 1
    }
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        assertFalse(list.hasCity(city));  // Test should fail, as functionality is not yet implemented
        list.addCity(city);
        assertTrue(list.hasCity(city));  // Should pass once functionality is implemented
    }
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(1, list.getCount());  // Ensure city is added
        list.deleteCity(city);
        assertEquals(0, list.getCount());  // After deletion, the list should be empty
    }
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        assertEquals(0, list.countCities());  // Should start with 0 cities
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Regina", "SK"));
        assertEquals(2, list.countCities());  // Should count two cities
    }




}

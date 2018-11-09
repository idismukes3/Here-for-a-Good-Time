package com.example.kory.donationtracker.Models.LocationClasses;

import com.example.kory.donationtracker.Models.LocationClasses.InventoryClasses.Inventory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Location test
 */
public class LocationTest {

    private Location typeOne;
    private Location typeTwo;
    private Location typeThree;

    private Inventory temp1;
    private Inventory temp2;
    private Inventory temp3;

    /**
     * sets up the test
     */
    @Before
    public void setup() {
        typeOne = new Location("New Location", "101", "111", "420 High Road",
                "Drop Off", "478-550-0168", "google.com");
        typeTwo = new Location("New Location", "101", "111", "420 High Road",
                "Store", "478-550-0168", "google.com");
        typeThree = new Location("New Location", "101", "111", "420 High Road",
                "Warehouse", "478-550-0168", "google.com");

        temp1 = new Inventory(typeOne);
        temp2 = new Inventory(typeTwo);
        temp3 = new Inventory(typeThree);


    }

    /**
     * test 1
     */
    @Test
    public void testConstructorTypeOne() {
        assertEquals("New Location", typeOne.getName());
        assertEquals("101", typeOne.getLat());
        assertEquals("111", typeOne.getLon());
        assertEquals("420 High Road", typeOne.getAddress());
        assertEquals("Drop Off", typeOne.getType().getStringType());
        assertEquals("478-550-0168", typeOne.getPhone());
        assertEquals("google.com", typeOne.getWebsite());
        assertEquals(0, temp1.getTotalItems());
    }

    /**
     * test 2
     */
    @Test
    public void testConstructorTypeTwo() {
        assertEquals("New Location", typeTwo.getName());
        assertEquals("101", typeTwo.getLat());
        assertEquals("111", typeTwo.getLon());
        assertEquals("420 High Road", typeTwo.getAddress());
        assertEquals("Store", typeTwo.getType().getStringType());
        assertEquals("478-550-0168", typeTwo.getPhone());
        assertEquals("google.com", typeTwo.getWebsite());
        assertEquals(0, temp2.getTotalItems());
    }

    /**
     * test 3
     */
    @Test
    public void testConstructorTypeThree() {
        assertEquals("New Location", typeThree.getName());
        assertEquals("101", typeThree.getLat());
        assertEquals("111", typeThree.getLon());
        assertEquals("420 High Road", typeThree.getAddress());
        assertEquals("Warehouse", typeThree.getType().getStringType());
        assertEquals("478-550-0168", typeThree.getPhone());
        assertEquals("google.com", typeThree.getWebsite());
        assertEquals(0, temp3.getTotalItems());
    }
}
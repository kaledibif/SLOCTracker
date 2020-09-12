package com.farukkaledibi.SLOCTracker.controllers;

import java.util.List;

import com.farukkaledibi.SLOCTracker.models.ItemModel;
import com.farukkaledibi.SLOCTracker.requests.ItemRequest;
import com.farukkaledibi.SLOCTracker.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Faruk Kaledibi
 */
@RestController
@RequestMapping(value = "/item", produces = "application/json")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/list")
    public List<ItemModel> listAllItems() {
        return itemService.findAll();
    }

    @RequestMapping(value = "/list/{id}")
    public ItemModel findById(@PathVariable Long id) {
        return itemService.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ItemModel addItem(@RequestBody ItemRequest request) {
        return itemService.addItem(request);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ItemModel updateItem(@PathVariable Long id, @RequestBody ItemRequest request) {
        return itemService.updateItem(id, request);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
        return true;
    }
}

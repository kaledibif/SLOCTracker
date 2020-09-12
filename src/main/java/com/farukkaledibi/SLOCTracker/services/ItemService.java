package com.farukkaledibi.SLOCTracker.services;

import com.farukkaledibi.SLOCTracker.requests.ItemRequest;
import com.farukkaledibi.SLOCTracker.models.ItemModel;
import com.farukkaledibi.SLOCTracker.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;

/**
 * @author Faruk Kaledibi
 */
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<ItemModel> findAll() {
        return itemRepository.findAll();
    }

    public ItemModel addItem(ItemRequest request) {
        ItemModel itemModel = new ItemModel();
        itemModel.setProjectId(request.getProjectId());
        itemModel.setSprintId(request.getSprintId());
        itemModel.setLanguageId(request.getLanguageId());
        itemModel.setFiles(request.getFiles());
        itemModel.setCodes(request.getCodes());
        itemModel.setComments(request.getComments());
        itemModel.setBlanks(request.getBlanks());
        return itemRepository.save(itemModel);
    }

    public ItemModel findById(Long id) {
        return itemRepository.findOne(id);
    }

    public ItemModel updateItem(Long id, ItemRequest request) {
        ItemModel updatedItem = Optional.ofNullable(itemRepository.findOne(id)).map(item -> {
            item.setFiles(request.getFiles());
            item.setCodes(request.getCodes());
            item.setComments(request.getComments());
            item.setBlanks(request.getBlanks());
            return item;
        }).get();
        return itemRepository.save(updatedItem);
    }

    public void deleteItem(Long id) {
        itemRepository.delete(id);
    }
}

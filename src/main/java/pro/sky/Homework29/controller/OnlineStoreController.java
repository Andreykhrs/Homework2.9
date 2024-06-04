package pro.sky.Homework29.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Homework29.service.OnlineStoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OnlineStoreController {
    private final OnlineStoreService onlineStoreService;

    public OnlineStoreController(OnlineStoreService onlineStoreService) {
        this.onlineStoreService = onlineStoreService;
    }

    @GetMapping("/add")
    public List<Integer> addId(@RequestParam List<Integer> ID) {
        return onlineStoreService.addId(ID);
    }

    @GetMapping("/get")
    public List getId() {
        return onlineStoreService.getId();
    }

}

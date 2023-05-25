package com.example.ontap22_5.controller;

import com.example.ontap22_5.entity.Gift;
import com.example.ontap22_5.entity.Menu;
import com.example.ontap22_5.entity.Product;
import com.example.ontap22_5.entity.Total;
import com.example.ontap22_5.repository.GiftRepo;
import com.example.ontap22_5.repository.MenuRepo;
import com.example.ontap22_5.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/")
@RestController
public class GiftController {
    @Autowired
    GiftRepo giftRepo;
    @Autowired
    MenuRepo menuRepo;
    @Autowired
    ProductRepo productRepo;
    @GetMapping("/total")
//    dự kiến 600 ng , mỗi mâm  dự kiến 6 ng ngồi ăn chúng ta cần cbi 100 mâm
//=> viết api tính tổng chi phí của buổi tiệc và tổng tiền mừng
    public ResponseEntity<?> getPrice() {
        float total = 0;
        Total total1 = new Total();

        List<Menu> menus = menuRepo.findAll();
        for (Menu menu : menus) {
            total += menu.getPrice();
        }
        total *= 100;
        total1.setToltalMenu(total);
        total = 0;
        List<Product> products = productRepo.findAll();
        for (Product pro : products) {
            total += pro.getPrice() * pro.getQuantity();
        }
        total1.setTotalProduct(total);
        total=0;
        List<Gift> gifts = giftRepo.findAll();
        for (Gift gift : gifts) {
            total += gift.getPrice();
        }
        total1.setToltalGift(total);
        return ResponseEntity.ok(total1);

    }
}

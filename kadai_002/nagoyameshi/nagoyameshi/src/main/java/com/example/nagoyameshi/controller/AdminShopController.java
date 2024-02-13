package com.example.nagoyameshi.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.nagoyameshi.entity.Shop;
import com.example.nagoyameshi.repository.ShopRepository;

@Controller
@RequestMapping("/admin/shops")

public class AdminShopController {

    private final ShopRepository shopRepository;         
    
    public AdminShopController(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;                
    }	
    
    @GetMapping
    public String index(Model model, @PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable, @RequestParam(name = "keyword", required = false) String keyword) {
        Page<Shop> shopPage ;
        
        
        if (keyword != null && !keyword.isEmpty()) {
            shopPage = shopRepository.findByNameLike("%" + keyword + "%", pageable);                
        } else {
        	shopPage = shopRepository.findAll(pageable);
        }  

        model.addAttribute("shopPage", shopPage); 
        model.addAttribute("keyword", keyword);
        
        return "admin/shops/index";
    }  

    @GetMapping("/{id}")
    public String show(@PathVariable(name = "id") Integer id, Model model) {
        Shop shop = shopRepository.getReferenceById(id);
        
        model.addAttribute("shop", shop);
        
        return "admin/shops/show";
    }    

}

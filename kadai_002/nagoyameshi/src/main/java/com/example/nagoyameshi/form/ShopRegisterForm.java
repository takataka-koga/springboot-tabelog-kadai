package com.example.nagoyameshi.form;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ShopRegisterForm {
    @NotBlank(message = "店舗名を入力してください。")
    private String name;
        
    private MultipartFile imageFile;
    
    @NotBlank(message = "説明を入力してください。")
    private String description;   
    
    @NotNull(message = "価格帯（下限）を入力してください。")
    @Min(value = 1, message = "価格帯（下限）は1円以上に設定してください。")
    private Integer price_min;  
    
    @NotNull(message = "価格帯（上限）を入力してください。")
    @Min(value = 1, message = "価格帯（上限）は1円以上に設定してください。")
    private Integer price_max;  
    
    @NotBlank(message = "営業時間（開店）を入力してください。")
    private String open_time;

    @NotBlank(message = "営業時間（閉店）を入力してください。")
    private String close_time;
        
    @NotBlank(message = "郵便番号を入力してください。")
    private String postalCode;
    
    @NotBlank(message = "住所を入力してください。")
    private String address;
    
    @NotBlank(message = "電話番号を入力してください。")
    private String phoneNumber;
    
    @NotBlank(message = "定休日を入力してください。")
    private String rest_day;

}

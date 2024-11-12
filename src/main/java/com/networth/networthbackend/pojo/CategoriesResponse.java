package com.networth.networthbackend.pojo;

import com.networth.networthbackend.data.Category;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoriesResponse extends BaseResponse {
    private List<Category> categories;
}

package com.networth.networthbackend.db;

import com.networth.networthbackend.data.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

package com.muniao.wjback.dao;

import com.muniao.wjback.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer>
{
}

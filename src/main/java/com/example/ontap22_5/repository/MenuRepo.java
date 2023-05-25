package com.example.ontap22_5.repository;

import com.example.ontap22_5.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface MenuRepo extends JpaRepository<Menu,Long> {

}

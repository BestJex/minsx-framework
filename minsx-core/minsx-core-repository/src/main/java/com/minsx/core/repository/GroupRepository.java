package com.minsx.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsx.core.entity.ordinary.Group;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer>{
	

}

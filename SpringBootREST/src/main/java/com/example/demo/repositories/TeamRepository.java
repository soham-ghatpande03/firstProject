package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Team;

@Transactional
public interface TeamRepository extends JpaRepository<Team, Integer> {
	
	@Query(value = "SELECT * FROM teams t WHERE t.team_manager_id = ?1",
            nativeQuery=true
    )
	public Team getTeamByTManId(int id);
}

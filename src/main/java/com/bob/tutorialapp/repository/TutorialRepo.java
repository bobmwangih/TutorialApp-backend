package com.bob.tutorialapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bob.tutorialapp.model.Tutorial;
@Repository
public interface TutorialRepo extends JpaRepository<Tutorial, Long> {

	//two custom methods
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
}

package com.westagile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.westagile.entity.PleaseProvideTheInfoBelow;
import com.westagile.repository.PleaseProvideTheInfoBelowRepository;

@RestController
public class PleaseProvideTheInfoBelowController {
	@Autowired
	private PleaseProvideTheInfoBelowRepository contactRepo;
	@RequestMapping("/contact/{id}")
	public PleaseProvideTheInfoBelow getInfo(@PathVariable long id) {
		Optional<PleaseProvideTheInfoBelow> findById = contactRepo.findById(id);
		PleaseProvideTheInfoBelow contactInfo = findById.get();
		
		return contactInfo;
	}

}

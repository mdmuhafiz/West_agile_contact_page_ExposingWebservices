package com.westagile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.westagile.entity.PleaseProvideTheInfoBelow;
import com.westagile.repository.PleaseProvideTheInfoBelowRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class PleaseProvideTheInfoBelowRepositoryTest {
	@Autowired
	private PleaseProvideTheInfoBelowRepository contactRepo;
	@Test
	public void saveOneInfo() {
		PleaseProvideTheInfoBelow p = new PleaseProvideTheInfoBelow("Tom","tom@gmail.com","9010976314","project is about exposing the webservices");
		contactRepo.save(p);
	}

}

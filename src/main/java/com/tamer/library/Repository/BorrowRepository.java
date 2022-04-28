package com.tamer.library.Repository;

import java.util.List;

import com.tamer.library.Model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<Borrow, Integer> {

	public List<Borrow> findByBookIdAndReturned(int id,int r);
	public List<Borrow> findByBookId(int id);
	public List<Borrow> findByUserId(int id);
	
	
}
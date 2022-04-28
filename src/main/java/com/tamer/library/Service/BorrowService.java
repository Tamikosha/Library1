package com.tamer.library.Service;

import java.util.List;

import com.tamer.library.Model.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamer.library.Repository.BorrowRepository;

@Service
public class BorrowService {

	@Autowired
	BorrowRepository br;
	public Borrow add(Borrow b)
	{
	  return br.save(b);	
	}
	public boolean receiveBook(int id)
	{
		List<Borrow> borrow=br.findByBookIdAndReturned(id, 0);
		Borrow b=borrow.get(0);
		b.setReturned(1);
		br.save(b);
        return true;
	}
}
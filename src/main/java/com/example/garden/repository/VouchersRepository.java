package com.example.garden.repository;

import com.example.garden.entity.UserProfile;
import com.example.garden.entity.Vouchers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VouchersRepository extends CrudRepository<Vouchers, Long> {
    List<Vouchers> deleteById(String id);
}

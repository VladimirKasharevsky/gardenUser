package com.example.garden.service;

import com.example.garden.entity.Vouchers;

import java.util.Optional;

public interface VouchersService {
    Optional<Vouchers> findVoucher(Long id);
    void deleteVoucher(Long id);
}

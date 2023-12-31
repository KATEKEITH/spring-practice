package com.practice.multicore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.multicore.entity.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Long> {

    Optional<Membership> findByUserId(Long userId);

}

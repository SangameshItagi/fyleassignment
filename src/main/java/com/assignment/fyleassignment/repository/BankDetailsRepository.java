package com.assignment.fyleassignment.repository;

import org.springframework.stereotype.Repository;
import com.assignment.fyleassignment.entity.BankDetails;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, String> {

	@Query("select b from BankDetails b where b.ifsc = :ifsc")
	BankDetails findDetails(@Param("ifsc") String ifsc);

	@Query(value = "select * from bankdetails b where b.bankid = :bankid AND b.city = :city ORDER BY b.ifsc ASC limit :limit offset :offset", nativeQuery = true)
	List<BankDetails> findByIdAndCity(@Param("bankid") Integer bankid, @Param("city") String city,
			@Param("limit") Integer limit, @Param("offset") Integer offset);
}
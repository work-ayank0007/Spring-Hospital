package com.example.hospital.demo.repository;

import com.example.hospital.demo.dto.BloodGroupStats;
import com.example.hospital.demo.dto.CPatientInfo;
import com.example.hospital.demo.dto.IPatientInfo;
import com.example.hospital.demo.entity.Patient;
import com.example.hospital.demo.entity.type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Patient,Long> {
//
//    @Query("SELECT p.id as id, p.name as name from PatientEntity p")
//     List<IPatientInfo> findPatientInfo();
//
//    @Query("SELECT new com.example.hospital.demo.dto.CPatientInfo(p.id , p.name) from PatientEntity p")
//    List<CPatientInfo> findCPatientInfo();
//
//    @Query("SELECT new com.example.hospital.demo.dto.BloodGroupStats(p.bloodGroup,COUNT(p)) from PatientEntity p group by p.bloodGroup order by COUNT(p) DESC")
//    List<BloodGroupStats> findBloodGroupStats();
//
//    @Transactional
//    @Modifying
//    @Query("UPDATE PatientEntity p SET p.bloodGroup=:bloodGroup WHERE  p.id=:id ")
//    int rowsAffected(BloodGroupType bloodGroup,Long id);
}

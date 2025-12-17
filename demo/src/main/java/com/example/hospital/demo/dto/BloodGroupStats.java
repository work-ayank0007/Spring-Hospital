package com.example.hospital.demo.dto;

import com.example.hospital.demo.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroup;
    private final Long count;
}

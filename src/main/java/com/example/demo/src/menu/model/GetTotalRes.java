package com.example.demo.src.menu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class GetTotalRes {
    private int total_idx;
    private int scholarship_idx;
    private int fund_idx;
    private String total_createAt;
    private String total_updateAt;
    private String total_status;
}

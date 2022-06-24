package com.example.metroinder.controller;

import com.example.metroinder.service.RealtimeStationservice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class RealtimeStationController {
    private final RealtimeStationservice RTSs;
    @GetMapping("/getRealtimeStation")
//    public String getRealtimeStation(String Station) throws IOException
    public String getRealtimeStation()throws IOException{
//        RTSs.getStation(Station);
        RTSs.getStation("서울");
        RTSs.RealtimeStaion();

        return "testrealtime";
    }

    @GetMapping("/returnRealtimeStation")
    public String returnRealtimeStaion(){
        return"test";
    }


}

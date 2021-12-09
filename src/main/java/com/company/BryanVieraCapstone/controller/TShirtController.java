package com.company.BryanVieraCapstone.controller;

import com.company.BryanVieraCapstone.model.TShirt;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TShirtController {

    private List<TShirt> tShirtList;

    private static int idCounter = 1;

    public TShirtController(){
        tShirtList = new ArrayList<>();

        tShirtList.add(new TShirt(idCounter++, "Large", "Blue", "Rainbow Cats", 9.99, 5));

    }

}

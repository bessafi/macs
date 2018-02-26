package com.bombardier.macs.util.temp.forme;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.json.model.CahierFields;
import com.bombardier.macs.json.model.CahierInformation;
import com.bombardier.macs.model.CahierDrawing;
import com.bombardier.macs.model.CahierTool;
import com.google.gson.Gson;
 
public class MapToJsonEx {
 
    public static void main(String a[]){
         //{"site":{"effectivity":"123","flagMethod":true},"cahier":{"id":1111,"cahierInformation":{},"cahierFields":{},"parts":[],"isConfirmed":false}}

        Gson gsonObj = new Gson();
        Cahier cahier=new Cahier();
        //cahier.setCahierFields(new CahierFields());
        //cahier.setCahierInformation(new CahierInformation());
        cahier.setId(1111L);
        CahierDrawing cdr=new CahierDrawing();
        cdr.setEffectivity("123");
        Set<CahierDrawing> list =new HashSet<CahierDrawing>();
        list.add(cdr);
        cdr.setFlagMethod(true);
        Map<String, Object> inputMap = new HashMap<String, Object>();
        cahier.setDrawings(list);
        inputMap.put("cahier", cahier);
        inputMap.put("site", cdr);
        // convert map to JSON String
        String jsonStr = gsonObj.toJson(inputMap);
        System.out.println(jsonStr);
    }
}
package com.bombardier.macs.util.csv;

import com.opencsv.bean.ColumnPositionMappingStrategy;


class CustomMappingStrategy<T> extends ColumnPositionMappingStrategy<T> {
	  private static final String[] HEADER = new String[]{"Bom Item Level", "Component Quantity", 
			  "Part Number", "Part Title", "EDRN/NIEO Rev", "INSTALLED BY", "TO DWG" , "DIR Release Date", 
			  "Dataset Type", "Cage Code", "Mod/Sum No.", "Material Group", "Cahier Id"};
	  
	  @Override
	    public String[] generateHeader() {
	        return HEADER;
	    }
}
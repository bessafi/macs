package com.bombardier.macs.util;

import java.util.ArrayList;
import java.util.List;

import com.bombardier.macs.json.model.SubSector;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * This is an <internal> class to support the parsing of the sectors and subsectors comming back from PI.
 * We JsonIgnore the 'subSectors' element because the API used by MACS WebApp doesn't have subsectors as a child array of the sector...
 * @author jblaplace
 *
 */
public class Sector extends com.bombardier.macs.json.model.Sector {
	@JsonIgnore
	List<SubSector> subSectors = new ArrayList<SubSector>();
	
	@JsonIgnore
	public List<SubSector> getSubSectors() {
		return subSectors;
	}
}

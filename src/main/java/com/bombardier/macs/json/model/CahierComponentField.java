package com.bombardier.macs.json.model;

import java.util.HashSet;
import java.util.Set;

public  class CahierComponentField {

	private Set<CahierHistoryUpdatedField> updatedFields = new HashSet<CahierHistoryUpdatedField>();

	public Set<CahierHistoryUpdatedField> getUpdatedFields() {
		return updatedFields;
	}

	public void setUpdatedFields(Set<CahierHistoryUpdatedField> updatedFields) {
		this.updatedFields = updatedFields;
	}
	
	
}

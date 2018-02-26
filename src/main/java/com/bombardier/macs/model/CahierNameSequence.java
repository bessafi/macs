package com.bombardier.macs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cahierNameSequence", uniqueConstraints = @UniqueConstraint(columnNames = { "sequenceKey" }))
public class CahierNameSequence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "sequenceKey")
	private String sequenceKey = null;

	@Column(name = "currentValue")
	private Long currentValue = 0l;

	@Column(name = "nextValue")
	private Long nextValue = 1l;

	public CahierNameSequence() {
	}

	public CahierNameSequence(String sequenceKey) {
		super();
		this.sequenceKey = sequenceKey;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKey() {
		return sequenceKey;
	}

	public void setSequenceKey(String sequenceKey) {
		this.sequenceKey = sequenceKey;
	}

	public Long getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Long currentValue) {
		this.currentValue = currentValue;
	}

	public Long getNextValue() {
		return nextValue;
	}

	public void setNextValue(Long nextValue) {
		this.nextValue = nextValue;
	}

	public void incrementValue() {
		this.currentValue++;
		this.nextValue++;
	}

}

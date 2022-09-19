package com.springpostman.fetchdata_spr_pm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "election_base_data")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "election_id")
	String election_id;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "constituency")
	String constituency;
	
	@Column(name = "round")
	int round;
	
	@Column(name = "candidate_name")
	String candidate_name;
	
	@Column(name = "party")
	String party;
	
	@Column(name = "round_count")
	int round_count;

	public String getElection_id() {
		return election_id;
	}

	public void setElection_id(String election_id) {
		this.election_id = election_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getRound_count() {
		return round_count;
	}

	public void setRound_count(int round_count) {
		this.round_count = round_count;
	}

	
	

	
}

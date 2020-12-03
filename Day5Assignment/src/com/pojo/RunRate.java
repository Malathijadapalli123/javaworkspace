package com.pojo;

public class RunRate {
	private int totalRuns;
	private int totalOvers;

	public RunRate(int totalRuns, int totalOvers) {
		super();
		this.totalRuns = totalRuns;
		this.totalOvers = totalOvers;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getTotalOvers() {
		return totalOvers;
	}

	public void setTotalOvers(int totalOvers) {
		this.totalOvers = totalOvers;
	}

	
}

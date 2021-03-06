package ar.com.fravega.fravegaChallenge.response;

import ar.com.fravega.fravegaChallenge.entity.Branch;
import ar.com.fravega.fravegaChallenge.entity.Node;
import ar.com.fravega.fravegaChallenge.request.BranchRequest;

public class BranchNodeResponse extends BranchRequest {

	public BranchNodeResponse(Branch branch) {
		super.setAddress(branch.getAddress());
		super.setDateAttention(branch.getDateAttention().toString());
		super.setLatitude(branch.getLatitude());
		super.setLongitude(branch.getLongitude());
	}

	public BranchNodeResponse(Node node) {
		super.setAddress(node.getBranch().getAddress());
		super.setDateAttention(node.getBranch().getDateAttention().toString());
		super.setLatitude(node.getBranch().getLatitude());
		super.setLongitude(node.getBranch().getLongitude());
	}

}
package edd.kh.oarr.run;

import edd.kh.oarr.model.service.MemberService;
import edd.kh.oarr.model.service.MemberServiceHome;

public class MemberRun {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		
		//ms.displayMenu();
		
		MemberServiceHome msHome = new MemberServiceHome();
		
		msHome.displayMenu();
	}

}

package edu.kh.test.money.run;

import edu.kh.test.money.model.vo.Money;

public class Run {

	public static void main(String[] args) {
		
		Money m = new Money();
		
		m.setMoney(10000);
		m.print();
		//System.out.print(m.getMoney());
		//System.out.print(m.getUnit());
	}

}

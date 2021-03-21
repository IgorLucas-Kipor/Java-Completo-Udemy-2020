package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentFee onlinePaymentFee;
	
	public ContractService(OnlinePaymentFee onlinePaymentFee) {
		this.onlinePaymentFee = onlinePaymentFee;
	}

	public ContractService() {
		
	}


	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i=1; i<=months; i++){
			double updatedQuota = basicQuota + onlinePaymentFee.interest(basicQuota, i);
			double fullQuota = updatedQuota + onlinePaymentFee.paymentFee(updatedQuota);
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int N) {
		Calendar c1 = Calendar.getInstance();
		c1.setTime(date);
		c1.add(Calendar.MONTH, N);
		return c1.getTime();
	}

}

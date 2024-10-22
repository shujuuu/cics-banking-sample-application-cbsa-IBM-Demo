/*                                                                        */
/* Copyright IBM Corp. 2023                                               */
/*                                                                        */
package com.ibm.cics.cip.bank.springboot.customerservices.jsonclasses.deleteaccount;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.ibm.cics.cip.bank.springboot.customerservices.JsonPropertyNamingStrategy;
import com.ibm.cics.cip.bank.springboot.customerservices.OutputFormatUtils;

@JsonNaming(JsonPropertyNamingStrategy.class)
public class DeleteAccountJson
{



	private static final String FLOAT_FORMAT = "%.02f";

	@JsonProperty("DELACC_COMMAREA")
	private DelaccJson delaccCommarea;


	public DeleteAccountJson()
	{
		super();
	}


	public DelaccJson getDelaccCommarea()
	{
		return delaccCommarea;
	}


	public void setDelaccCommarea(DelaccJson delaccCommareaIn)
	{
		delaccCommarea = delaccCommareaIn;
	}


	@Override
	public String toString()
	{
		return "DeleteAccountJson [DELACC_COMMAREA=" + delaccCommarea.toString()
				+ "]";
	}


	public String toPrettyString()
	{
		DelaccJson accInfo = delaccCommarea;
		String output = "";
		output += "Account Number: "
				+ OutputFormatUtils.leadingZeroes(8, accInfo.getDelaccAccno())
				+ "\n" + "Sort Code: " + accInfo.getDelaccSortcode() + "\n"
				+ "Account Type: " + accInfo.getDelaccAccType() + "\n"
				+ "Customer Number: "
				+ OutputFormatUtils.leadingZeroes(10, accInfo.getDelaccCustno())
				+ "\n" + "Interest Rate: "
				+ String.format(FLOAT_FORMAT, accInfo.getDelaccInterestRate())
				+ "\n" + "Overdraft Limit: " + accInfo.getDelaccOverdraft()
				+ "\n" + "Available Balance: "
				+ String.format(FLOAT_FORMAT,
						accInfo.getDelaccAvailableBalance())
				+ "\n" + "Actual Balance: "
				+ String.format(FLOAT_FORMAT, accInfo.getDelaccActualBalance())
				+ "\n" + "Account Opened: "
				+ OutputFormatUtils.date(accInfo.getDelaccOpened()) + "\n"
				+ "Last Statement Date: "
				+ OutputFormatUtils.date(accInfo.getDelaccLastStatementDate())
				+ "\n" + "Next Statement Date: "
				+ OutputFormatUtils.date(accInfo.getDelaccNextStatementDate())
				+ "\n";
		return output;
	}
}

package com.BridgeLabz;

public class CompanyList 
{
    String compName;
    int stockVal;
    double stockPrice;
    
    CompanyList( String compName,int stockVal,double stockPrice)
    {
    	this.compName=compName;
    	this.stockVal=stockVal;
    	this.stockPrice=stockPrice;
    }
    
    public String toString()
    {
    	return ("comany name -" + this.compName+" \t stock value -" +this.stockVal+"\t stock price -"+this.stockPrice);
    }
}

package test;

import writer.IWriter;

public class Test {
	private IWriter writer;
	String myName;
	
	public Test()
	{
		this.writer = null;
	}
	
	public Test(IWriter writer)
	{
		this.writer=writer;
	}
	

	public void setWriter(IWriter writer) {
		this.writer = writer;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getMyName() {
		return myName;
	}

	public void run(){
		String s = " My name is " + this.myName;
		writer.writer(s);
	}
	
	
}
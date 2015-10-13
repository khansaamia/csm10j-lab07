package csm10jlab07;

public class Line {

	private double NaN = 0;
	private double a,b,c;	//needs to store a,b,c three values
	
	//defaulst constructor function
	public Line()
	{
		a=0;
		b=0;
		c=0;
	}
	//parameterized constructor function
	public Line(double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	//this function or method getslope function returns slope of the line
	public double getSlope()
	{
		double slopeOfLine=0;	//variable to store slop of line
		
		if(b!=0)	//if b is not 0
		{	
			slopeOfLine=-a/b;	//slope can be found by using methamatical formula -a/b
			return slopeOfLine;	//return slope of line
		}
		else 
		{
			return NaN;	// return NaN
		}
	}
	
	//equals method return true if both lines are equal else false
 	public boolean equals(Line two)
	{

		if((this.a==two.a && this.b==two.b && this.c==two.c) || (2*a+3*b==1))	//checks if line1(a,b,c)=line2(a,b,c) || 2x+3y=1
		{
			return true;
		}
		else 
			return false;
	}

	
	//get value of a
	public double getA() {
		return a;
	}

	
	//set received value to a
	public void setA(double a) {
		this.a = a;
	}
	
	//get value of b

	public double getB() {
		return b;
	}

	
	//set received value to b
	public void setB(double b) {
		this.b = b;
	}

	
	//get value of c
	public double getC() {
		return c;
	}
	
	//set received value to c

	public void setC(double c) {
		this.c = c;
	}

	// is nana function checks if b == 0 then will return true
	public boolean isNan()
	{
		if(b==0)	//if b is equal to zero then their is Nan return true
		{
			return true;
		}
		else
		{
			return false;	//else return flase
		}
	}
	
	//checks the line is vertical
	public boolean isVertical ()
	{
		if(this.b==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//checks the lineis horizontal
	public boolean isHorizontal()
	{
		if(this.a==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//parallelTo method identifies if two lines are parallel to each other
	public boolean parallelTo(Line linetwo)
	{
		double slopeOfLineOne ;
		double slopeOfLineTwo ;
		
		//slope of both lines
		slopeOfLineOne=-this.a/this.b;
		slopeOfLineTwo=-linetwo.a/linetwo.b;
		
		//if slope of both the lines are same then they are parallel
		if(slopeOfLineOne==slopeOfLineTwo)
		{
			return true;
		}
		else 
			return false;
		
	}
	
	//parallelTo method identifies if two lines are perpandicular to each other
	public boolean perpendicularTo(Line line2)
	{
		double slopeOfLine1 ;
		double slopeOfLine2 ;
		
		//slope of both lines
		slopeOfLine1=-this.a/this.b;
		slopeOfLine2=-line2.a/line2.b;
		
		//if slope of both the lines are same then they are parallel
		if(slopeOfLine1*slopeOfLine2==-1)
		{
			return true;
		}
		else 
			return false;
		
	}
}

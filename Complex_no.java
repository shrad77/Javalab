
class complex
{
	int i, r;
	complex(int real,int img)
	{	r=real;
		i=img;
	}
	complex add(complex c)
	{
		complex b=new complex(r+c.r,i+c.i);
		return b;
	}
	complex sub(complex c)
	{
		complex b=new complex(r-c.r,i-c.i);
		return b;
	}
}



public class complexnums {

	public static void main(String[] args) {
		complex c1=new complex(1,2);
		complex c2=new complex(2,1);
		complex c3=c1.add(c2);
		complex c4=c1.sub(c2);
		System.out.println("addition:"+c3.r+"+("+c3.i+")i");
		System.out.println("subtraction:"+c4.r+"+("+c4.i+")i");		
	}

}
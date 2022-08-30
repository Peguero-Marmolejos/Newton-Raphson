
public class NewtonRaphson {
	public static void main(String args[]) {
		double j = NewtonRaphsonM(1.5,.00000001, .00000001);
		System.out.println(j);
	}
	public static double f(double x) {
		return(x*x*x) - 2*(x) - 2;
	}
	public static double df(double x){
		return 3*(x*x) - 2;
	}
	public static double NewtonRaphsonM(double x0, double tol_x, double tol_y) {
	
		if(df(x0)== 0) {
			System.out.println("This did not work because df(x) is 0");
			return -.9999;
		}
		
		//x(i+1) = x(i) - f(xi)/f'(xi);
		double  xi = x0 - f(x0)/df(x0);
		while (Math.abs(xi-x0) >= tol_x) {
			if(f(xi)<=tol_y) {
				System.out.println("The answer is : " + xi);
				return xi;
			}
			x0 = xi;
			xi = x0 - f(x0)/df(x0);
		}
		return xi;
	}
	
	}


public abstract class gaussFunction {

	//Height of gaussian function at exact given point
	public static double gsPoint(double x){
		return 1 / Math.sqrt(2*Math.PI) * Math.exp(-Math.pow(x,2) / 2);
	}

	//Given the left (l) and right (r) bound, this function calculates the approximate area underneath the function between that range
	//increments is used to determine the interval
	//Interval represents the distance from every time we calculage gsPoint
	//By averaging over more and more points we can more accurately determine the exact integral
	//Increments should be above 1000 near center and 10000 at greater magnitude values for best results
	public static double gsDist(double l, double r, int increments){
		if(l==r) return 0;
		else{
			double interval = (r-l)/increments;
			double total = 0;
			for(double i = l; i <= r; i+=interval){
				total+=gsPoint(i);
			}
			return total / increments * (r-l);
		}
	}
}
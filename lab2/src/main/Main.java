package main;

import java.util.Scanner;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import cos.Cos;
import ln.Ln;
import log.Log;
import sin.Sin;
import trig.Trig;

public class Main {

	public static Cos cos = new Cos();
	public static Sin sin = new Sin();
	public static Trig trig = new Trig();
	
	public static Ln ln = new Ln();
	public static Log log = new Log();
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		XYSeries series = new XYSeries("function");

		for(double i = -Math.PI*6-0.000001; i < -Math.PI/6-0.000001; i+=Math.PI/48){
		//for(double i = -6; i < -2; i+=0.0001){
	    //for(double i = -6; i < -4; i+=0.0001){
	      series.add(i, main.finalFunction(i));
	    }

	    XYDataset xyDataset = new XYSeriesCollection(series);
	    JFreeChart chart = ChartFactory
	        .createXYLineChart("function", "x", "y",
	                           xyDataset, 
	                           PlotOrientation.VERTICAL,
	                           true, true, true);
	    JFrame frame = 
	        new JFrame("MinimalStaticChart");
	    
	    frame.getContentPane()
	        .add(new ChartPanel(chart));
	    frame.setSize(400,300);
	    frame.show();
		
		/*Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		System.out.println(main.finalFunction(x));
		
		sc.close();*/
	}
	
	public double finalFunction(double x) {
		if (x<=0) {
			
			return ((  (Math.pow(Math.pow(sin.calcSin(x) - trig.calcCsc(x), 2), 2)) + (trig.calcCot(x) - cos.calcCos(x))) + (sin.calcSin(x) - (Math.pow((trig.calcCsc(x) * trig.calcSec(x)) + cos.calcCos(x),2))));
		} else {
			
			return ( Math.pow( (  ((Math.pow(ln.ln(x),3))-(log.log(5,x)/log.log(3,x))) * ((log.log(5,x) + log.log(2,x))/(log.log(5,x)))) / (log.log(10,x)),3));
		}
	}

}

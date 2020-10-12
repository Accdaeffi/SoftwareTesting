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

	public static void main(String[] args) {
		XYSeries series = new XYSeries("function");

		for(double i = -6; i < -2; i+=0.0001){
	    //for(double i = -6; i < -4; i+=0.0001){
	      series.add(i, finalFunction(i));
	    }

	    XYDataset xyDataset = new XYSeriesCollection(series);
	    JFreeChart chart = ChartFactory
	        .createXYLineChart("function", "x", "y",
	                           xyDataset, 
	                           PlotOrientation.VERTICAL,
	                           true, true, true);
	    JFrame frame = 
	        new JFrame("MinimalStaticChart");
	    // Помещаем график на фрейм
	    frame.getContentPane()
	        .add(new ChartPanel(chart));
	    frame.setSize(400,300);
	    frame.show();
		
		/*Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		System.out.println(finalFunction(x));
		
		sc.close();*/
	}
	
	public static double finalFunction(double x) {
		if (x<=0) {
			
			Cos cos = new Cos();
			Sin sin = new Sin();
			Trig trig = new Trig();
			
			return ((  (Math.pow(Math.pow(sin.calcSin(x) - trig.calcCsc(x), 2), 2)) + (trig.calcCot(x) - cos.calcCos(x))) + (sin.calcSin(x) - (Math.pow((trig.calcCsc(x) * trig.calcSec(x)) + cos.calcCos(x),2))));
		} else {
			
			Ln ln = new Ln();
			Log log = new Log();
			
			return ( Math.pow( (  ((Math.pow(ln.ln(x),3))-(log.log(5,x)/log.log(3,x))) * ((log.log(5,x) + log.log(2,x))/(log.log(5,x)))) / (log.log(10,x)),3));
		}
	}

}

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

	    for(double i = -7; i < -2; i+=0.0001){
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
			return ((  (Math.pow(Math.pow(Sin.calcSin(x) - Trig.calcCsc(x), 2), 2)) + (Trig.calcCot(x) - Cos.calcCos(x))) + (Sin.calcSin(x) - (Math.pow((Trig.calcCsc(x) * Trig.calcSec(x)) + Cos.calcCos(x),2))));
		} else {
			return ( Math.pow( (  ((Math.pow(Ln.ln(x),3))-(Log.log(5,x)/Log.log(3,x))) * ((Log.log(5,x) + Log.log(2,x))/(Log.log(5,x)))) / (Log.log(10,x)),3));
		}
	}

}

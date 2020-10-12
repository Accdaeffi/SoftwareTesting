package ln;

public class LnMock extends Ln {
	
	@Override
	public double ln(double x) {
		/*if (x==20) return 2.9957322735539909934352235;
		if (x==3) return 1.0986122886681096913952452;*/
		
		return Math.log(x);
	}
}

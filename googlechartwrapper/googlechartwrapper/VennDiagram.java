package googlechartwrapper;

import googlechartwrapper.chartLegend.ChartLegend;
import googlechartwrapper.chartLegend.IChartLegendable;

import java.awt.Dimension;
import java.util.Collection;

/**
 * Specifies a venn diagram <a href="http://code.google.com/apis/chart/#venn">
 * http://code.google.com/apis/chart/#venn</a>
 * 
 * @author steffan
 *
 */
public class VennDiagram extends AbstractChart implements IChartLegendable{
	
	private ChartLegend chartLegend;

	/**
	 * Constructs a venn diagram
	 * 
	 * @param chartDimension the size of the diagram
	 */
	public VennDiagram(Dimension chartDimension) {
		super(chartDimension);
		
		chartLegend = new ChartLegend();
	}

	@Override
	protected ChartType getChartType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getUrlChartType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected void collectUrlElements(){
	
			super.collectUrlElements();
			
			/*hier dann die legend zusammenbauen
			 * 
			 *  if (legendStrings.Count > 0)
         {
             string s = "chdl=";
             foreach (string str in legendStrings)
             {
                 s += str + "|";
             }
             urlElements.Enqueue(s.TrimEnd("|".ToCharArray()));
         }
			 * 
			 */
	}

	public void addChartLegend(String[] legend) {
		this.chartLegend.addChartLegend(legend);
		
	}

	public void addChartLegend(Collection<String> legend) {
		this.chartLegend.addChartLegend(legend);
		
	}
	

}
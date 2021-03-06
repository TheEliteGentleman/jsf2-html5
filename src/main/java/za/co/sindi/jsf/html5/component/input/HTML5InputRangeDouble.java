/**
 * 
 */
package za.co.sindi.jsf.html5.component.input;

import javax.faces.component.FacesComponent;
import javax.faces.convert.DoubleConverter;

import za.co.sindi.jsf.html5.component.HTML5InputRange;

/**
 * @author Bienfait Sindi
 * @since 03 August 2013
 *
 */
@FacesComponent(HTML5InputRangeDouble.COMPONENT_TYPE)
public class HTML5InputRangeDouble extends HTML5InputRange {

	public static final String COMPONENT_TYPE = "za.co.sindi.jsf.html5.HTML5InputRangeDouble";
	
	private enum PropertyKeys {
		min,
		max,
		step
	}
	
	/**
	 * 
	 */
	public HTML5InputRangeDouble() {
		super();
		// TODO Auto-generated constructor stub
		setConverter(new DoubleConverter());
	}
	
	/**
	 * @return the min
	 */
	public double getMin() {
		return (Double) getStateHelper().eval(PropertyKeys.min, Double.MIN_VALUE);
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(double min) {
		getStateHelper().put(PropertyKeys.min, min);
	}
	
	/**
	 * @return the max
	 */
	public double getMax() {
		return (Double) getStateHelper().eval(PropertyKeys.max, Double.MIN_VALUE);
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(double max) {
		getStateHelper().put(PropertyKeys.max, max);
	}
	
	/**
	 * @return the step
	 */
	public double getStep() {
		return (Double) getStateHelper().eval(PropertyKeys.step);
	}

	/**
	 * @param step the step to set
	 */
	public void setStep(double step) {
		getStateHelper().put(PropertyKeys.step, step);
	}
}

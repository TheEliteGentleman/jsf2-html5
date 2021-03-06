/**
 * 
 */
package za.co.sindi.jsf.html5.renderer;

import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.render.FacesRenderer;

import za.co.sindi.jsf.html5.component.media.HTML5Video;
import za.co.sindi.jsf.html5.constants.HTML5Attributes;

/**
 * @author Bienfait Sindi
 * @since 10 September 2013
 *
 */
@FacesRenderer(componentFamily=UIOutput.COMPONENT_FAMILY, rendererType=HTML5Video.RENDERER_TYPE)
public class HTML5VideoRenderer extends HTML5MediaRenderer {

	private static final String[] VIDEO_ADDITIONAL_ATTRIBUTES = {
		HTML5Attributes.POSTER,
		HTML5Attributes.HEIGHT,
		HTML5Attributes.WIDTH,
	};
	
	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.renderer.HTML5MediaRenderer#getElementName(javax.faces.component.UIComponent)
	 */
	@Override
	protected String getElementName(UIComponent component) {
		// TODO Auto-generated method stub
		return "video";
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.renderer.HTML5MediaRenderer#getAdditionalPassthroughAttributes()
	 */
	@Override
	protected String[] getAdditionalPassthroughAttributes() {
		// TODO Auto-generated method stub
		return VIDEO_ADDITIONAL_ATTRIBUTES;
	}
}

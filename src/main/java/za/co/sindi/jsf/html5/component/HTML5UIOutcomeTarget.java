/**
 * 
 */
package za.co.sindi.jsf.html5.component;

import java.util.Collection;

import javax.faces.component.UIOutcomeTarget;

import za.co.sindi.jsf.html5.constants.HTML5Attributes.HTML5PropertyKeys;

/**
 * @author Buhake Sindi
 * @since 25 April 2013
 *
 */
public abstract class HTML5UIOutcomeTarget extends UIOutcomeTarget implements HTML5UIComponent {

	private enum PropertyKeys {
		fragment
	}
	
	/**
	 * @return the fragment
	 */
	public String getFragment() {
		return (String) getStateHelper().eval(PropertyKeys.fragment);
	}

	/**
	 * @param fragment the fragment to set
	 */
	public void setFragment(String fragment) {
		getStateHelper().put(PropertyKeys.fragment, fragment);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getAccesskey()
	 */
	public String getAccesskey() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.accesskey);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setAccesskey(java.lang.String)
	 */
	public void setAccesskey(String accesskey) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.accesskey, accesskey);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getStyleClass()
	 */
	public String getStyleClass() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.styleClass);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setStyleClass()
	 */
	public void setStyleClass(String styleClass) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.styleClass, styleClass);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getContenteditable()
	 */
	public boolean isContenteditable() {
		// TODO Auto-generated method stub
		return (Boolean) getStateHelper().eval(HTML5PropertyKeys.contenteditable, false);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setContenteditable(java.lang.String)
	 */
	public void setContenteditable(boolean contenteditable) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.contenteditable, contenteditable);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getDir()
	 */
	public String getDir() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.dir);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setDir(java.lang.String)
	 */
	public void setDir(String dir) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.dir, dir);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getDraggable()
	 */
	public boolean isDraggable() {
		// TODO Auto-generated method stub
		return (Boolean) getStateHelper().eval(HTML5PropertyKeys.draggable, false);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setDraggable(java.lang.String)
	 */
	public void setDraggable(boolean draggable) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.draggable, draggable);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getDropzone()
	 */
	public String getDropzone() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.dropzone);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setDropzone(java.lang.String)
	 */
	public void setDropzone(String dropzone) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.dropzone, dropzone);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getHidden()
	 */
	public String getHidden() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.hidden);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setHidden(java.lang.String)
	 */
	public void setHidden(String hidden) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.hidden, hidden);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getLang()
	 */
	public String getLang() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.lang);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setLang(java.lang.String)
	 */
	public void setLang(String lang) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.lang, lang);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getSpellcheck()
	 */
	public boolean isSpellcheck() {
		// TODO Auto-generated method stub
		return (Boolean) getStateHelper().eval(HTML5PropertyKeys.spellcheck, false);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setSpellcheck(java.lang.String)
	 */
	public void setSpellcheck(boolean spellcheck) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.spellcheck, spellcheck);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getStyle()
	 */
	public String getStyle() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.style);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setStyle(java.lang.String)
	 */
	public void setStyle(String style) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.style, style);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getTabindex()
	 */
	public int getTabindex() {
		// TODO Auto-generated method stub
		return (Integer) getStateHelper().eval(HTML5PropertyKeys.tabindex, Integer.MIN_VALUE);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setTabindex(java.lang.Integer)
	 */
	public void setTabindex(int tabindex) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.tabindex, tabindex);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getTitle()
	 */
	public String getTitle() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.title);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.title, title);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getTranslated()
	 */
	public String getTranslate() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.translate);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setTranslated(java.lang.String)
	 */
	public void setTranslate(String translate) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.translate, translate);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnabort()
	 */
	public String getOnabort() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onabort);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnabort(java.lang.String)
	 */
	public void setOnabort(String onabort) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onabort, onabort);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnblur()
	 */
	public String getOnblur() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onblur);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnblur(java.lang.String)
	 */
	public void setOnblur(String onblur) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onblur, onblur);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOncancel()
	 */
	public String getOncancel() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.oncancel);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOncancel(java.lang.String)
	 */
	public void setOncancel(String oncancel) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.oncancel, oncancel);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOncanplay()
	 */
	public String getOncanplay() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.oncanplay);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOncanplay(java.lang.String)
	 */
	public void setOncanplay(String oncanplay) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.oncanplay, oncanplay);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOncanplaythrough()
	 */
	public String getOncanplaythrough() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.oncanplaythrough);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOncanplaythrough(java.lang.String)
	 */
	public void setOncanplaythrough(String oncanplaythrough) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.oncanplaythrough, oncanplaythrough);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnchange()
	 */
	public String getOnchange() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onchange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnchange(java.lang.String)
	 */
	public void setOnchange(String onchange) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onchange, onchange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnclick()
	 */
	public String getOnclick() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onclick);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnclick(java.lang.String)
	 */
	public void setOnclick(String onclick) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onclick, onclick);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnclose()
	 */
	public String getOnclose() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onclose);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnclose(java.lang.String)
	 */
	public void setOnclose(String onclose) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onclose, onclose);
	}

//	/* (non-Javadoc)
//	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOncontextmenu()
//	 */
//	public String getOncontextmenu() {
//		// TODO Auto-generated method stub
//		return (String) getStateHelper().eval(HTML5PropertyKeys.oncontextmenu);
//	}
//
//	/* (non-Javadoc)
//	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOncontextmenu(java.lang.String)
//	 */
//	public void setOncontextmenu(String oncontextmenu) {
//		// TODO Auto-generated method stub
//		getStateHelper().put(HTML5PropertyKeys.oncontextmenu, oncontextmenu);
//	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOncuechange()
	 */
	public String getOncuechange() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.oncuechange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOncuechange(java.lang.String)
	 */
	public void setOncuechange(String oncuechange) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.oncuechange, oncuechange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndblclick()
	 */
	public String getOndblclick() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondblclick);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndblclick(java.lang.String)
	 */
	public void setOndblclick(String ondblclick) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondblclick, ondblclick);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndrag()
	 */
	public String getOndrag() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondrag);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndrag(java.lang.String)
	 */
	public void setOndrag(String ondrag) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondrag, ondrag);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndragend()
	 */
	public String getOndragend() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondragend);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndragend(java.lang.String)
	 */
	public void setOndragend(String ondragend) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondragend, ondragend);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndragenter()
	 */
	public String getOndragenter() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondragenter);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndragenter(java.lang.String)
	 */
	public void setOndragenter(String ondragenter) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondragenter, ondragenter);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndragleave()
	 */
	public String getOndragleave() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondragleave);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndragleave(java.lang.String)
	 */
	public void setOndragleave(String ondragleave) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondragleave, ondragleave);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndragover()
	 */
	public String getOndragover() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondragover);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndragover(java.lang.String)
	 */
	public void setOndragover(String ondragover) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondragover, ondragover);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndragstart()
	 */
	public String getOndragstart() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondragstart);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndragstart(java.lang.String)
	 */
	public void setOndragstart(String ondragstart) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondragstart, ondragstart);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndrop()
	 */
	public String getOndrop() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondrop);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndrop(java.lang.String)
	 */
	public void setOndrop(String ondrop) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondrop, ondrop);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOndurationchange()
	 */
	public String getOndurationchange() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ondurationchange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOndurationchange(java.lang.String)
	 */
	public void setOndurationchange(String ondurationchange) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ondurationchange, ondurationchange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnemptied()
	 */
	public String getOnemptied() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onemptied);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnemptied(java.lang.String)
	 */
	public void setOnemptied(String onemptied) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onemptied, onemptied);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnended()
	 */
	public String getOnended() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onended);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnended(java.lang.String)
	 */
	public void setOnended(String onended) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onended, onended);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnerror()
	 */
	public String getOnerror() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onerror);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnerror(java.lang.String)
	 */
	public void setOnerror(String onerror) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onerror, onerror);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnfocus()
	 */
	public String getOnfocus() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onfocus);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnfocus(java.lang.String)
	 */
	public void setOnfocus(String onfocus) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onfocus, onfocus);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnformchange()
	 */
	public String getOnformchange() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onformchange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnformchange(java.lang.String)
	 */
	public void setOnformchange(String onformchange) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onformchange, onformchange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnforminput()
	 */
	public String getOnforminput() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onforminput);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnforminput(java.lang.String)
	 */
	public void setOnforminput(String onforminput) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onforminput, onforminput);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOninput()
	 */
	public String getOninput() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.oninput);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOninput(java.lang.String)
	 */
	public void setOninput(String oninput) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.oninput, oninput);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOninvalid()
	 */
	public String getOninvalid() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.oninvalid);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOninvalid(java.lang.String)
	 */
	public void setOninvalid(String oninvalid) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.oninvalid, oninvalid);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnkeydown()
	 */
	public String getOnkeydown() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onkeydown);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnkeydown(java.lang.String)
	 */
	public void setOnkeydown(String onkeydown) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onkeydown, onkeydown);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnkeypress()
	 */
	public String getOnkeypress() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onkeypress);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnkeypress(java.lang.String)
	 */
	public void setOnkeypress(String onkeypress) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onkeypress, onkeypress);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnkeyup()
	 */
	public String getOnkeyup() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onkeyup);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnkeyup(java.lang.String)
	 */
	public void setOnkeyup(String onkeyup) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onkeyup, onkeyup);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnload()
	 */
	public String getOnload() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onload);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnload(java.lang.String)
	 */
	public void setOnload(String onload) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onload, onload);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnloadeddata()
	 */
	public String getOnloadeddata() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onloadeddata);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnloadeddata(java.lang.String)
	 */
	public void setOnloadeddata(String onloadeddata) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onloadeddata, onloadeddata);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnloadedmetadata()
	 */
	public String getOnloadedmetadata() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onloadedmetadata);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnloadedmetadata(java.lang.String)
	 */
	public void setOnloadedmetadata(String onloadedmetadata) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onloadedmetadata, onloadedmetadata);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnloadstart()
	 */
	public String getOnloadstart() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onloadstart);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnloadstart(java.lang.String)
	 */
	public void setOnloadstart(String onloadstart) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onloadstart, onloadstart);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnmousedown()
	 */
	public String getOnmousedown() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onmousedown);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#getOnmouseenter()
	 */
	@Override
	public String getOnmouseenter() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onmouseenter);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#setOnmouseenter(java.lang.String)
	 */
	@Override
	public void setOnmouseenter(String onmouseenter) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onmouseenter, onmouseenter);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnmousedown(java.lang.String)
	 */
	public void setOnmousedown(String onmousedown) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onmousedown, onmousedown);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#getOnmouseleave()
	 */
	@Override
	public String getOnmouseleave() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onmouseleave);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#setOnmouseleave(java.lang.String)
	 */
	@Override
	public void setOnmouseleave(String onmouseleave) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onmouseleave, onmouseleave);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnmousemove()
	 */
	public String getOnmousemove() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onmousemove);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnmousemove(java.lang.String)
	 */
	public void setOnmousemove(String onmousemove) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onmousemove, onmousemove);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#getOnmouseout()
	 */
	@Override
	public String getOnmouseout() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onmouseout);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#setOnmouseout(java.lang.String)
	 */
	@Override
	public void setOnmouseout(String onmouseout) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onmouseout, onmouseout);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnmouseover()
	 */
	public String getOnmouseover() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onmouseover);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnmouseover(java.lang.String)
	 */
	public void setOnmouseover(String onmouseover) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onmouseover, onmouseover);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnmouseup()
	 */
	public String getOnmouseup() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onmouseup);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnmouseup(java.lang.String)
	 */
	public void setOnmouseup(String onmouseup) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onmouseup, onmouseup);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnmousewheel()
	 */
	public String getOnmousewheel() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onmousewheel);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnmousewheel(java.lang.String)
	 */
	public void setOnmousewheel(String onmousewheel) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onmousewheel, onmousewheel);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnpause()
	 */
	public String getOnpause() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onpause);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnpause(java.lang.String)
	 */
	public void setOnpause(String onpause) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onpause, onpause);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnplay()
	 */
	public String getOnplay() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onplay);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnplay(java.lang.String)
	 */
	public void setOnplay(String onplay) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onplay, onplay);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnplaying()
	 */
	public String getOnplaying() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onplaying);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnplaying(java.lang.String)
	 */
	public void setOnplaying(String onplaying) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onplaying, onplaying);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnprogress()
	 */
	public String getOnprogress() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onprogress);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnprogress(java.lang.String)
	 */
	public void setOnprogress(String onprogress) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onprogress, onprogress);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnratechange()
	 */
	public String getOnratechange() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onratechange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnratechange(java.lang.String)
	 */
	public void setOnratechange(String onratechange) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onratechange, onratechange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnreadystatechange()
	 */
	public String getOnreadystatechange() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onreadystatechange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnreadystatechange(java.lang.String)
	 */
	public void setOnreadystatechange(String onreadystatechange) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onreadystatechange, onreadystatechange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnreset()
	 */
	public String getOnreset() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onreset);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnreset(java.lang.String)
	 */
	public void setOnreset(String onreset) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onreset, onreset);	
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#getOnresize()
	 */
	@Override
	public String getOnresize() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onresize);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#setOnresize(java.lang.String)
	 */
	@Override
	public void setOnresize(String onresize) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onresize, onresize);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnscroll()
	 */
	public String getOnscroll() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onscroll);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnscroll(java.lang.String)
	 */
	public void setOnscroll(String onscroll) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onscroll, onscroll);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnseeked()
	 */
	public String getOnseeked() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onseeked);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnseeked(java.lang.String)
	 */
	public void setOnseeked(String onseeked) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onseeked, onseeked);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnseeking()
	 */
	public String getOnseeking() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onseeking);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnseeking(java.lang.String)
	 */
	public void setOnseeking(String onseeking) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onseeking, onseeking);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnselect()
	 */
	public String getOnselect() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onselect);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnselect(java.lang.String)
	 */
	public void setOnselect(String onselect) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onselect, onselect);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnshow()
	 */
	public String getOnshow() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onshow);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnshow(java.lang.String)
	 */
	public void setOnshow(String onshow) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onshow, onshow);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnstalled()
	 */
	public String getOnstalled() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onstalled);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnstalled(java.lang.String)
	 */
	public void setOnstalled(String onstalled) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onstalled, onstalled);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnsubmit()
	 */
	public String getOnsubmit() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onsubmit);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnsubmit(java.lang.String)
	 */
	public void setOnsubmit(String onsubmit) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onsubmit, onsubmit);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnsuspend()
	 */
	public String getOnsuspend() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onsuspend);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnsuspend(java.lang.String)
	 */
	public void setOnsuspend(String onsuspend) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onsuspend, onsuspend);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOntimeupdate()
	 */
	public String getOntimeupdate() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ontimeupdate);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOntimeupdate(java.lang.String)
	 */
	public void setOntimeupdate(String ontimeupdate) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ontimeupdate, ontimeupdate);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#getOntoggle()
	 */
	@Override
	public String getOntoggle() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.ontoggle);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeProperties#setOntoggle(java.lang.String)
	 */
	@Override
	public void setOntoggle(String ontoggle) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.ontoggle, ontoggle);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnvolumechange()
	 */
	public String getOnvolumechange() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onvolumechange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnvolumechange(java.lang.String)
	 */
	public void setOnvolumechange(String onvolumechange) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onvolumechange, onvolumechange);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#getOnwaiting()
	 */
	public String getOnwaiting() {
		// TODO Auto-generated method stub
		return (String) getStateHelper().eval(HTML5PropertyKeys.onwaiting);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.jsf.html5.HTML5AttributeTag#setOnwaiting(java.lang.String)
	 */
	public void setOnwaiting(String onwaiting) {
		// TODO Auto-generated method stub
		getStateHelper().put(HTML5PropertyKeys.onwaiting, onwaiting);
	}
	
	/* (non-Javadoc)
	 * @see javax.faces.component.UIComponentBase#getEventNames()
	 */
	@Override
	public Collection<String> getEventNames() {
		// TODO Auto-generated method stub
		return DEFAULT_EVENT_NAMES;
	}
}

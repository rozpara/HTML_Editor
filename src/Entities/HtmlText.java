package Entities;

import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.html.HTML.Tag;

public class HtmlText extends HTMLConstruct {

    String text;
    
    
    public HtmlText(Document doc, String text, HTMLConstruct parent) {
        super(doc, text, parent);
        this.parent = parent;
        this.text = text;
        // TODO Auto-generated constructor stub
    }

    public AttributeSet getAttributes() {
        // TODO Auto-generated method stub
        
        return null;
    }
    @Override
    public Element getElement(int index) {
        // TODO Auto-generated method stub
        //return this.theChildren.get(index);
        return null;
    }
    @Override
    public int getElementCount() {
        // TODO Auto-generated method stub
        return this.getChildCount();
    }
    @Override
    public int getElementIndex(int offset) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public int getEndOffset() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public Element getParentElement() {
        // TODO Auto-generated method stub
        //return this.theParent;
        return (HTMLComposite) this.getParent();
    }
    @Override
    public int getStartOffset() {
        // TODO Auto-generated method stub
        return 0;
    }

}

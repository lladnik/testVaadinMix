package com.test1;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;
public class MyUI extends UI{
    
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout vl = new VerticalLayout();
        vl.addComponent(new Label("AAAAA"));
        this.setContent(vl);
    }
    
}

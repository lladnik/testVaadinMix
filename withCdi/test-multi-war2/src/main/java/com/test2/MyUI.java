package com.test2;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Label;
import com.vaadin.cdi.CDIUI;

@CDIUI("ui2")
public class MyUI extends UI{
    
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout vl = new VerticalLayout();
        vl.addComponent(new Label("BBBBBB"));
        this.setContent(vl);
    }
    
}

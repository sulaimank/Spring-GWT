package com.mySampleApplication.client;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.mySampleApplication.client.services.MySampleApplicationServiceAsync;
import com.mySampleApplication.client.services.Services;

public class MySampleView extends ContentPanel {
    public MySampleView() {
        final Button button = new Button("Click me Sulaiman zzz!!!");
        final Button button2 = new Button("Second new dynamic button");
        final Label label = new Label();

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                if (label.getText().equals("")) {
                    MySampleApplicationServiceAsync applicationService = Services.getAccountService();
                    applicationService.getMessage("Hello, New World!", new MyAsyncCallback(label));
                } else {
                    label.setText("");
                }
            }
        });

        setLayout(new FitLayout());
        setBodyBorder(true);

        add(button);
        add(button2);
        add(label);
    }

    private static class MyAsyncCallback implements AsyncCallback<String> {
        private Label label;

        public MyAsyncCallback(Label label) {
            this.label = label;
        }

        public void onSuccess(String result) {
            label.getElement().setInnerHTML(result);
        }

        public void onFailure(Throwable throwable) {
            label.setText("Failed to receive answer from server!");
        }
    }
}

package io.philoyui.gmosdemo.service;

import io.phyloyui.client.MessageClient;
import io.phyloyui.client.MessageHandler;
import io.phyloyui.client.domain.Message;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UpEventHandler {

    @PostConstruct
    public void start(){

        String appKey = "appkey122fgfg112";

        String secret = "secret111222";

        String group = "default_group";

        MessageClient messageClient = new MessageClient(appKey,secret,group);

        messageClient.handleMessage(new MessageHandler(){

            @Override
            public void onTextMessage(Message message) {
                System.out.println( "--success--" + message.getContent());
            }

        });

        messageClient.connect("ws://localhost:8080/endpoints");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

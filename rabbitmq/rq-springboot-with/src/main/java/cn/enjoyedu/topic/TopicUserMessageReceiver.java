package cn.enjoyedu.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com
 *往期视频咨询芊芊老师  QQ：2130753077  VIP课程咨询 依娜老师  QQ：2470523467
 *类说明：
 */
@Component
@RabbitListener(queues = "sb.info.user" )
public class TopicUserMessageReceiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("TopicUserMessageReceiver  : " +msg);
    }

}
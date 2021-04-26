package com.sq.conf;


import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.RedeliveryPolicy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

/**
 * @version 1.0
 * @Author: shangqing
 * @Date: 2021/4/25 下午10:50
 */

@Configuration
public class JmsTogetherConfig {
    @Value ("${spring.activemq.broker-url}")
    private String activeMQURL;
    @Value ("${spring.activemq.user}")
    private String userName;
    @Value ("${spring.activemq.password}")
    private String password;

 
    @Bean("topicListenerContainerFactory")
    public JmsListenerContainerFactory<?> topicListenerContainerFactory (ConnectionFactory jmsConnectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory ();
        factory.setPubSubDomain (true);
        factory.setConnectionFactory (jmsConnectionFactory);
        return factory;
    }


    @Bean("queueListenerContainerFactory")
    public JmsListenerContainerFactory<?> queueListenerContainerFactory (ConnectionFactory jmsConnectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory ();
        factory.setPubSubDomain (false);
        factory.setConnectionFactory (jmsConnectionFactory);
        factory.setSessionTransacted (false);
        factory.setSessionAcknowledgeMode (4);
        return factory;
    }

    @Bean
    public ConnectionFactory jmsConnectionFactory () {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory ();

        connectionFactory.setBrokerURL (activeMQURL);
        connectionFactory.setUserName (userName);
        connectionFactory.setPassword (password);
        connectionFactory.setTrustAllPackages (true);
        connectionFactory.setMaxThreadPoolSize (ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE);
        RedeliveryPolicy redeliveryPolicy = new RedeliveryPolicy ();

        //定义ReDelivery(重发机制)机制 ，重发时间间隔是100毫秒，最大重发次数是3次
        //是否在每次尝试重新发送失败后,增长这个等待时间
        redeliveryPolicy.setUseExponentialBackOff (true);
        //重发次数,默认为6次   这里设置为1次
        redeliveryPolicy.setMaximumRedeliveries (6);
        //重发时间间隔,默认为1秒
        redeliveryPolicy.setInitialRedeliveryDelay (7200000);
        //第一次失败后重新发送之前等待500毫秒,第二次失败再等待500 * 2毫秒,这里的2就是value
        //redeliveryPolicy.setBackOffMultiplier (2);
        //最大传送延迟，只在useExponentialBackOff为true时有效（V5.5），假设首次重连间隔为10ms，倍数为2，那么第
        //二次重连时间间隔为 20ms，第三次重连时间间隔为40ms，当重连时间间隔大的最大重连时间间隔时，以后每次重连时间间隔都为最大重连时间间隔。
        redeliveryPolicy.setUseExponentialBackOff (true);
        redeliveryPolicy.setMaximumRedeliveryDelay (7200000);
        connectionFactory.setRedeliveryPolicy (redeliveryPolicy);
        return connectionFactory;
    }
}

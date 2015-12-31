package zookeeper.curator;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright @ 2015 yuzhouwan.com
 * All right reserved.
 * Function: ZKPaths in Curator
 *
 * @author jinjy
 * @since 2015/12/31 0031
 */
public class CuratorZKPaths {

    private static final Logger _log = LoggerFactory.getLogger(CuratorZKPaths.class);

    private CuratorFramework curatorFramework;


    private void init() {
        curatorFramework = CuratorFrameworkFactory
                .builder()
                .connectString("localhost:2181")
                .connectionTimeoutMs(3000)
                .sessionTimeoutMs(5000)
                .retryPolicy(new RetryNTimes(3, 2000))
                .namespace("zkPaths")
                .build();
        curatorFramework.start();
    }

    public CuratorZKPaths() {
        init();
    }

    public void zkPaths() {

    }
}

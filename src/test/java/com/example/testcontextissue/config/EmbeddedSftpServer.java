package com.example.testcontextissue.config;

import org.apache.sshd.common.file.virtualfs.VirtualFileSystemFactory;
import org.apache.sshd.server.SshServer;
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider;
import org.apache.sshd.sftp.server.SftpSubsystemFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;

public class EmbeddedSftpServer implements InitializingBean, DisposableBean {

    public static final String HOST = "localhost";
    public static final int PORT = 9999;
    private final SshServer sshServer;

    public EmbeddedSftpServer() {
        sshServer = SshServer.setUpDefaultServer();
        sshServer.setHost(HOST);
        sshServer.setPort(PORT);
        sshServer.setKeyPairProvider(new SimpleGeneratorHostKeyProvider());
        sshServer.setPasswordAuthenticator((username, password, serverSession) -> true);
        sshServer.setSubsystemFactories(Collections.singletonList(new SftpSubsystemFactory()));
        sshServer.setFileSystemFactory(new VirtualFileSystemFactory(Paths.get(System.getProperty("java.io.tmpdir"))));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(">>>>>>>>>>>>>> Starting server");
        System.out.println(">>>>>>>>>>>>>> Starting server");
        System.out.println(">>>>>>>>>>>>>> Starting server");
        System.out.println(">>>>>>>>>>>>>> Starting server");
        System.out.println(">>>>>>>>>>>>>> Starting server");
        System.out.println(">>>>>>>>>>>>>> Starting server");
        start();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(">>>>>>>>>>>>> Stopping server");
        System.out.println(">>>>>>>>>>>>> Stopping server");
        System.out.println(">>>>>>>>>>>>> Stopping server");
        System.out.println(">>>>>>>>>>>>> Stopping server");
        System.out.println(">>>>>>>>>>>>> Stopping server");
        System.out.println(">>>>>>>>>>>>> Stopping server");
        stop();
    }

    public void start() throws IOException {
        sshServer.start();
    }

    public void stop() throws IOException {
        sshServer.stop(true);
    }
}

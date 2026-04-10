import org.apache.ratis.conf.RaftProperties;
import org.apache.ratis.grpc.GrpcConfigKeys;
import org.apache.ratis.protocol.*;
import org.apache.ratis.server.RaftServer;
import org.apache.ratis.server.RaftServerConfigKeys;
import org.apache.ratis.thirdparty.com.google.protobuf.ByteString;

public class RatisServerExample {
    
    public static RaftServer createServer(String id, String address, 
                                          RaftGroup group) throws IOException {
        RaftProperties properties = new RaftProperties();
        
        // Configure server
        RaftServerConfigKeys.setStorageDir(properties, 
            Collections.singletonList(new File("/tmp/ratis/" + id)));
        
        // Configure gRPC
        GrpcConfigKeys.Server.setPort(properties, 
            Integer.parseInt(address.split(":")[1]));
        
        RaftPeer peer = RaftPeer.newBuilder()
            .setId(id)
            .setAddress(address)
            .build();
        
        return RaftServer.newBuilder()
            .setGroup(group)
            .setProperties(properties)
            .setServerId(RaftPeerId.valueOf(id))
            .setStateMachine(new MyStateMachine())
            .build();
    }
}


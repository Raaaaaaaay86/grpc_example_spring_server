package com.example.grpc_example_server;

import com.example.services.GreetingRequest;
import com.example.services.GreetingResponse;
import com.example.services.MyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {

    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseStreamObserver) {
        GreetingResponse response = GreetingResponse.newBuilder()
            .setGreeting("Hello ==> " + request.getName())
            .build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }
}

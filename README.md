# How to Use
1. Run ```mvn install``` to generate JAVA file according to .proto file. Files will be generated under the ```target/....``` directory.
2. Implement the service implementation which defined in the .proto file. ( servie MyServie {} =```.proto -> .java```=> MyServiceImpl).
3. Start the SpringBoot server. The RPC server will run on port 9090.
4. Use BloomRPC(or other RPC testing tools) to send request to the RPC server.

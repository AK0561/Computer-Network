# Computer Networks 

This repository contains the source code for various network programming examples, including TCP client-server, UDP client-server, a concurrent TCP daytime server, and an implementation of a file transfer protocol. These examples are designed to help you understand and work with network protocols, sockets, and communication between computers.

## Table of Contents

1. [TCP Client-Server](#tcp-client-server)
2. [UDP Client-Server](#udp-client-server)
3. [Concurrent TCP Daytime Server](#concurrent-tcp-daytime-server)
4. [File Transfer Protocol](#file-transfer-protocol)

## TCP Client-Server

The TCP client-server example demonstrates how to create a simple communication system using the Transmission Control Protocol (TCP). The code includes both a server and a client, allowing you to send and receive messages over a reliable, connection-oriented channel.

### Usage

- Compile and run the server code.
- Compile and run the client code, specifying the server's IP address and port number.
- Enter text in the client, and it will be sent to the server, which will echo the message back.

## UDP Client-Server

The UDP client-server example showcases communication using the User Datagram Protocol (UDP), a connectionless and lightweight protocol. The code includes both a server and a client for UDP communication.

### Usage

- Compile and run the server code.
- Compile and run the client code, specifying the server's IP address and port number.
- Send messages from the client to the server, which will process and respond to them.

## Concurrent TCP Daytime Server

The concurrent TCP daytime server demonstrates a multi-client server that provides the current date and time to multiple clients simultaneously. This example shows how to handle concurrent connections and manage client requests efficiently.

### Usage

- Compile and run the concurrent daytime server code.
- Connect multiple clients to the server, and each client will receive the current date and time.

## File Transfer Protocol

The file transfer protocol implementation simulates a basic file transfer system, allowing clients to upload and download files to/from a server. It is designed to illustrate the principles of file transfer over a network.

### Usage

- Compile and run the server code to start the file transfer service.
- Compile and run the client code, specifying the server's IP address and port number.
- Use the client to upload and download files to/from the server.

## Contributing

Feel free to contribute to this repository by adding improvements, fixing bugs, or extending the functionality of the existing examples. If you have any questions or suggestions, please open an issue or create a pull request.

## License

This repository is provided under the [MIT License](LICENSE), which allows you to use and modify the code for your projects, subject to certain conditions. Please review the license for more details.

**Enjoy exploring and learning about computer networks with these code examples!**

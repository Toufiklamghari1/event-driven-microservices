# Event-Driven Microservices

This project demonstrates an event-driven microservices architecture using Apache Kafka for communication between services. It includes multiple microservices that handle different responsibilities, such as Order, Stock, and Email services.

## Features
    - **Event-Driven Architecture**: Microservices communicate asynchronously via Kafka topics.
    - **Order Service**: Handles order creation and publishes order events.
    - **Stock Service**: Listens for order events and updates stock accordingly.
    - **Email Service**: Listens for order events and sends email notifications.
    - **Kafka Integration**: Utilizes Kafka consumers and producers to handle event-based communication.

## Microservices

### 1. Order Service
    - Creates new orders.
    - Publishes events to a Kafka topic when an order is placed.

### 2. Stock Service
    - Consumes order events from Kafka.
    - Updates stock levels based on order details.

### 3. Email Service
    - Listens to order events from Kafka.
    - Sends email notifications when orders are placed.

### 4. Base Domain
    - Contains common DTO classes such as `Order` and `OrderEvent` shared across the microservices.

## Kafka Topics
    - **order_events**: Used by the Order service to publish order-related events.
      Other services listen to this topic to react to order events.

## Getting Started

### Prerequisites
    - Java 17
    - Spring Boot
    - Apache Kafka
### How to Run
#### Clone the repository:
      git clone https://github.com/Toufiklamghari1/event-driven-microservices.git
#### DOWNLOAD AND INSTALL KAFKA
    [https://dlcdn.apache.org/kafka/3.2.0/kafka_2.13-3.2.0.tgz](https://kafka.apache.org/quickstart)

#### Start the ZooKeeper service
    C:\Users\RAMESH\Downloads\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

#### Start the Kafka broker service
    C:\Users\RAMESH\Downloads\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

#### Start the microservices:
      cd order-service
        ./mvnw spring-boot:run
    
      cd ../stock-service
        ./mvnw spring-boot:run
    
      cd ../email-service
        ./mvnw spring-boot:run

  # Project Structure

      event-driven-microservices/
      ├── .idea/
      ├── base-domains/
      │   ├── .mvn/wrapper/
      │   ├── src/
      │   │   ├── main/
      │   │   │   └── java/com/springboot/microservice/basedomains/
      │   │   │       ├── dto/
      │   │   │       │   ├── Order.java
      │   │   │       │   └── OrderEvent.java
      │   │   │       └── BaseDomainsApplication.java
      │   │   └── resources/
      │   │       └── application.properties
      │   └── test/
      │       └── java/com/springboot/microservice/basedomains/
      │           └── BaseDomainsApplicationTests.java
      │   ├── .gitattributes
      │   ├── .gitignore
      │   ├── mvnw
      │   ├── mvnw.cmd
      │   └── pom.xml
      ├── email-microservice/
      │   ├── .mvn/wrapper/
      │   ├── src/
      │   │   ├── main/
      │   │   │   └── java/com/springboot/microservice/emailmicroservice/
      │   │   │       ├── kafka/
      │   │   │       │   └── OrderConsumer.java
      │   │   │       └── EmailMicroserviceApplication.java
      │   │   └── resources/
      │   │       └── application.properties
      │   └── test/
      │       └── java/com/springboot/microservice/emailmicroservice/
      │           └── EmailMicroserviceApplicationTests.java
      │   ├── .gitattributes
      │   ├── .gitignore
      │   ├── mvnw
      │   ├── mvnw.cmd
      │   └── pom.xml
      ├── stock-microservice/
      │   ├── .mvn/wrapper/
      │   ├── src/
      │   │   ├── main/
      │   │   │   └── java/com/springboot/microservice/stockmicroservice/
      │   │   │       ├── kafka/
      │   │   │       │   └── OrderConsumer.java
      │   │   │       └── StockMicroserviceApplication.java
      │   │   └── resources/
      │   │       └── application.properties
      │   └── test/
      │       └── java/com/springboot/microservice/stockmicroservice/
      │           └── StockMicroserviceApplicationTests.java
      │   ├── .gitattributes
      │   ├── .gitignore
      │   ├── mvnw
      │   ├── mvnw.cmd
      │   └── pom.xml
      ├── README.md

# License
    This project is licensed under the MIT License - see the LICENSE file for details.

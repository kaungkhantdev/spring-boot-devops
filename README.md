# DevOps

## Prerequisites

Before running this application, ensure you have:

-  **Java 21 or higher**
-  **Maven 3.6+**
-  **MySQL 8.0+** (or Docker)
-  **Docker** (optional, for containerized setup)
-  **IDE** (IntelliJ IDEA, Eclipse, or VS Code)

## Installation

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/spring-boot-devops.git
cd spring-boot-devops
```

## Running the Application

### Option 1: Run with Maven

Build the application
```bash
mvn clean install
```

### Development Mode
```bash
mvn spring-boot:run
```

### Production Mode
```bash
# Build JAR
mvn clean package -DskipTests

# Run JAR
java -jar target/devops-1.0.0-SNAPSHOT.jar
```

### Option 2: Run with Docker

Build the Docker image
```bash
docker build -t spring-boot-devops .
```

Run the Docker container
```bash
docker run -p 8080:8080 spring-boot-devops
```

### Option 3: Run with Docker Compose

Build the Docker Compose image
```bash
docker-compose up -d

# Check status
docker-compose ps
```
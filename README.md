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

### Install Dependencies
```bash
mvn clean install
```

### Option 2: Docker Setup
```bash
# Start MySQL container
docker run --name financial-mysql \
  -e MYSQL_ROOT_PASSWORD=rootpassword \
  -e MYSQL_DATABASE=financial_db \
  -e MYSQL_USER=finapp \
  -e MYSQL_PASSWORD=finapp123 \
  -p 3306:3306 \
  -d mysql:8.0
```

### Option 3: Docker Compose
```bash
# Start all services
docker-compose up -d

# Check status
docker-compose ps
```

## 🏃‍♂️ Running the Application

### Development Mode
```bash
mvn spring-boot:run
```

### Production Mode
```bash
# Build JAR
mvn clean package -DskipTests

# Run JAR
java -jar target/financial-api-1.0.0.jar
```

### Docker
```bash
# Build image
docker build -t spring-boot-devops .

# Run container
docker run -p 8080:8080 spring-boot-devops
```
# DeepSeek Chat API with Spring Boot 🚀  

This is a **Spring Boot** application that integrates the **DeepSeek model** using **Ollama** for AI-powered chat responses.

## Features
👉 Spring Boot API  
👉 DeepSeek Model via Ollama  
👉 Docker Support  
👉 Easy Deployment  

## Setup Instructions

### 1. Install Dependencies
Ensure you have **Java 17+, Maven, and Ollama** installed.

### 2. Install Ollama & DeepSeek
```sh
# Install Ollama
curl -fsSL https://ollama.com/install.sh | sh

# Pull DeepSeek model
ollama pull deepseek-chat
```

### 3. Start Ollama Server
Run:
```sh
ollama serve
```

### 4. Configure Spring Boot
Create or update `src/main/resources/application.yml`:
```yaml
spring:
  ai:
    ollama:
      base-url: http://localhost:11434
      model: deepseek-chat
```

### 5. Run the Spring Boot App
```sh
mvn clean spring-boot:run
```

### 6. Test API in Postman
Make a `GET` request:
```
http://localhost:8080/api/v1/chat?message=Hello
```

### 7. Build & Run with Docker (Optional)
```sh
docker build -t deepseek-chat-app .
docker run -p 8080:8080 deepseek-chat-app
```

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET    | `/api/v1/chat?message=Hello` | Get AI-generated response |

## Project Structure
```
deepseek-chat-app/
│── src/
│   ├── main/java/com/ollama_deepseek/
│   │   ├── controller/HomeController.java
│   │   ├── DeepSeekChatApplication.java
│   │── resources/application.yml
│── pom.xml
│── Dockerfile
│── .gitignore
│── README.md
```

## Contributing
Want to improve the project? Feel free to **fork & contribute**! PRs are welcome. 😃

## GitHub Repository Setup
### Step 1: Initialize Git
```sh
git init
git add .
git commit -m "Initial commit with DeepSeek integration"
```

### Step 2: Create a GitHub Repository
1. Go to **GitHub** and create a new repository.
2. Copy the repository URL.

### Step 3: Push to GitHub
```sh
git remote add origin <YOUR_GITHUB_REPO_URL>
git branch -M main
git push -u origin main
```

## Next Steps
🌟 Deploy on a **cloud server** like AWS, DigitalOcean, or Azure.  
🌟 Improve the model by adding **prompt engineering** techniques.  

---
Now your project is **ready for GitHub**! 🚀


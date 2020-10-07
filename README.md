## REDIS

## 1. Check the current status of the Docker 
`sudo systemctl status docker`
- Status should be **active (running)**

### 2. Retrieve and start a Redis container `'my-redis'`
`sudo docker run --name my-redis -p 6379:6379 -d redis`
- --name my-redis is your db name
- -p 6379:6379 stands for **Outside_port:Docker_port**

### 3. Check the status of current docker containers
`sudo docker ps`

### 4. Start the interactive redis-cli command shell
`sudo docker exec -it my-redis sh`

### 5. Connect to the Redis container instance
`redis-cli`

### 6. Basic Redis Commands
- `ping`
- `set name pnap`
- `get name`

### 7. Return to the container terminal interface
`quit`

### 8. Close the connection with the Docker container
`exit`

---

## MongoDB

## 1. Check the current status of the Docker 
`sudo systemctl status docker`
- Status should be **active (running)**

### 2. Retrieve and start a MongoDB container `'mongodb'`
`sudo docker run -p 27017:27017 --name mongodb -d mongo`
- -p 27017:27017 stands for **Outside_port:Docker_port**

### 3. Check the status of current docker containers
`sudo docker ps`

### 4. Start the interactive command shell
`sudo docker exec -it mongodb bash`

### 5. Connect to the container instance
`mongo`

### 6. Basic Commands
- 
- 
- 

### 7. Return to the container terminal interface
`exit`

### 8. Close the connection with the Docker container
`exit`

---


## Neo4j

## 1. Check the current status of the Docker 
`sudo systemctl status docker`
- Status should be **active (running)**

### 2. Retrieve and start a Neo4j container
`sudo docker run -p 7474:7474 -p 7687:7687 --name my-neo4j -d neo4j`

- -p 7474:7474 **UI is placed on this port**
- -p 7687:7687 **Bolt? driver for connection to db**

### 3. Check the status of current docker containers
`sudo docker ps`

### 4. Start the interactive command shell
`sudo docker exec -it my-neo4j sh`

### 5. Connect to the container instance
`neo4j`

### 6. Basic Commands
- `CREATE (Alec:User {name: 'Alec Gut', age: 33});`
- `CREATE (Martian:Movie {title: 'The Martian', director: 'Christopher Nolan'});`
- `CREATE (Martian)-[:RATED {rating: 10}]->(Alec)`

### 7. Return to the container terminal interface
`exit`

### 8. Close the connection with the Docker container
`exit`

---

## Cassandra

## 1. Check the current status of the Docker 
`sudo systemctl status docker`
- Status should be **active (running)**

### 2. Retrieve and start container
- `sudo docker run -e DS_LICENSE=accept --name my-dse -d datastax/dse-server`
- `sudo docker run -e DS_LICENSE=accept --link my-dse --name my-studio -p 9091:9091 -d datastax/dse-studio`

### 3. Check the status of current docker containers
`sudo docker ps`

### 4. Start the interactive command shell
`docker exec -it some-cassandra bash`

### 5. Connect to the container instance
`sqlsh`

### 6. Basic Commands
- `CREATE KEYSPACE test_keyspace WITH replication = {'class': 'SimpleStrategy','replication_factor': '1'} AND durable_writes = 'true';`
- `DESCRIBE KEYSPACES`
- `create table employee_by_id (id int PRIMARY KEY, name text, position text);`


### 7. Return to the container terminal interface
`exit`

### 8. Close the connection with the Docker container
`exit`

---
## PostgreSQL

## 1. Check the current status of the Docker 
`sudo systemctl status docker`
- Status should be **active (running)**

### 2. Retrieve and start container
- `sudo docker run --name my-postgres -p 5432:5432 -e POSTGRES_PASSWORD=pswd -d postgres`

### 3. Check the status of current docker containers
`sudo docker ps`

### 4. Start the interactive command shell
`sudo docker exec -it my-postgres psql -U postgres`

### 5. Connect to the container instance
see previous step

### 6. Basic Commands
- `create database mytestdb;`

### 7. Return to the container terminal interface
`\q`

### 8. Close the connection with the Docker container
`exit`

---

## MySQL

## 1. Check the current status of the Docker 
`sudo systemctl status docker`
- Status should be **active (running)**

### 2. Retrieve and start container
- `sudo docker run --name my___sql -e MYSQL_ROOT_PASSWORD=pswd -p 3344:3344 -d mysql`

### 3. Check the status of current docker containers
`sudo docker ps`

### 4. Start the interactive command shell
`sudo docker exec -it my___sql bash`

### 5. Connect to the container instance
- `mysql -u root -p`
- `then type a root password`

### 6. Basic Commands
- `create database testdb;`
- `show databases;`

### 7. Return to the container terminal interface
`quit`

### 8. Close the connection with the Docker container
`exit`

---

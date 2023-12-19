# Spring MySQL demo

## REST API

CRUD = Create, Read, Update, Delete

BASE_URL = http://localhost:8080/api/
- **Create** POST: {BASE_URL}/{resource}
- **Read (one)** GET: {BASE_URL}/{resource}/{id}
- **Read (all)** GET: {BASE_URL}/{resource}
- **Update** PUT: {BASE_URL}/{resource}
- **Delete** Delete: {BASE_URL}/{resource}

### Exempel: Users

BASE_URL = http://localhost:8080/

- **Create** POST: {http://localhost:8080/users
- **Read (one)** GET: {http://localhost:8080/users/5
- **Read (all)** GET: {http://localhost:8080/users
- **Update** PUT: {http://localhost:8080/users/5
- **Delete** Delete: {http://localhost:8080/users/5

### Exempel: Cars

BASE_URL = http://localhost:8080/

- **Create** POST: {http://localhost:8080/cars
- **Read (one)** GET: {http://localhost:8080/cars/10
- **Read (all)** GET: {http://localhost:8080/cars
- **Update** PUT: {http://localhost:8080/cars/10
- **Delete** Delete: {http://localhost:8080/cars/10
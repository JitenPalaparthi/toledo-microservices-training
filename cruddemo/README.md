- Create a product
curl -X POST -H "Content-Type: application/json" -d '{"name":"Laptop","price":999.99}' http://springboot-demo.local/api/products



curl -X POST -H "Content-Type: application/json" -d '{"name":"Laptop","price":999.99}' http://127.0.0.1:60846/api/products


- GetAllProducts

curl http://localhost:8080/api/products

- Update A Product

curl -X PUT -H "Content-Type: application/json" -d '{"name":"MacBook","price":1299.99}' http://localhost:8080/api/products/1

- Delete A Product

curl -X DELETE http://localhost:8080/api/products/1



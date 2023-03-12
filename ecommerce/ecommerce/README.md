
# Weekly Test 4 -(19/02/2023)




## Framework and language

- Framework : Spring,SpringBoot
- Language : java (Version 11)

## Data flow

controller

- AddressController
- OrderController
- ProductController
- UserController

service

- getOrderByOrderId( ) -- This function will return all the details of an order.
- getUserByUserId( ) -- This function will return a user corresponding to it's userId
- getProducts( ) -- This function will fetch all the products from the database depending upon it's category.
- deleteProduct( ) -- This function will delete a product and all it's corresponding orders from the 'tbl_order' table.

Repository

- SQL code is written in the repository layer.
- Will come from service layer to repository layer and there it will say that user has asked for this request. Get us this request from the database.
- Whatever the user requests, it writes a query in SQL for the repository.

## Data structure used
- H2 database

## Project Summary
- Ecommerce application is REST API Application In this project we have created 4 models namely;User, Product, Address and Order. We have provided some endpoints and also in this section below we have given our API. Using this API we can perform the operations accordingly.

End points:
- /get-order-by-orderId
- /get-user-by-userid
- /get-products-by-category
- /deleteById/productId
- Here, while deleting a product by it's Id, we are required to delete it's corresponding order so that there is no vioaltion of data integrity.

       


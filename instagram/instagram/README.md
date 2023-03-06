<p>Instagram API
Frameworks and language
Framework : Spring,SpringBoot
Language : java 
</p>Data Flow
Controller
<p>The controller package has two classes, first UserController and second PostController
UserController :- User can do CURD operation in UserController
PostController :- When User is login then he can do CURD operation from the PostController
Service</p>
<p>The service package has two classes, first UserService and second PostService
UserService :- The logic of all the card operations of the user controller is written here.
PostService :- The logic of all the card operations of the post controller is written here.
</p>dao
<p>There are two interfaces in the dao layer which extend the JPARepository and inside it, we fetch the data from the database by sending all the sql commands.</p>
<p>Data Structure used in project
Here we are using hasMap and List data structure.
</p>

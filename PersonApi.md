# Person Api Project

## Overview

PersonApi is a project developed during the *Capgemini Fullstack Java and Angular bootcamp*. 
It's a REST API designed for managing people's data. 
Its primary functionalities include:

    Creating new person records with details such as name, age, and phone number.
    Retrieving a specific person's information by ID.
    Deleting an existing person by ID.
    Updating an existing person's details.
    Running the Project

### To start the application, execute the following command in your terminal:

Bash

>mvn spring-boot:run

**Use code with caution.**

## Using the API

Tool: Use an API client like Postman.

| Method | API Endpoints (URL) |
| ------ | ------------------ |
| Base URL | http://localhost:8080/api/v1/people/ |
| POST | http://localhost:8080/api/v1/people/ |

Request Body:
```sh
JSON
----
{
  "firstName": "Nome",
  "secondName": "Sobrenome",
  "cpf": "cpf",
  "birthDate": "Data de nascimento",
  "phones": [
    {
      "type": "COMMERCIAL",
      "number": "(11)99999994"
    }
  ]
}
----------------------
Use code with caution.
```
type for phones can be COMMERCIAL, MOBILE, or HOME.

**Handling the Object Person**

| Method | API Endpoint(URL) | Implementation  |
| ------ | ----------------- | --------------- |
| GET | http://localhost:8080/api/v1/people/{id} | Retrive a Person |
| DELETE | http://localhost:8080/api/v1/people/{id} | Delete a Person |
| PUT | http://localhost:8080/api/v1/people/{id} | Update a person's |

Request Body: Similar to the POST request body, but include the existing id to update.
        
### Example Response

```sh
JSON
----
{
  "id": 1,
  "firstName": "Felipe",
  "secondName": "Alves",
  "birthDate": "2002-10-28",
  "cpf": "",
  "phones": [
      {
          "id": null,
          "type": null,
          "number": null
      }
  ]
}
----------------------
Use code with caution.
```

Note:

    Replace placeholders like {id} with actual values.
    Adjust the database connection and entity properties to match your specific implementation.
    This Markdown provides a clear and concise guide to the Personapi project, making it easy for developers to understand and interact with the API.



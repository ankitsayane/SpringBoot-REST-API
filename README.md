# RESTful Web Services Implementation

## 1. Job Postings Management Service

### Description
A RESTful web service for managing job postings. Recruiters can post new jobs, update job details, and delete postings.

### Entity: JobPosting
- **Job Title**: The title of the job position.
- **Company Name**: The name of the company offering the job.
- **Location**: The location of the job.
- **Description**: Detailed description of the job.
- **Requirements**: Job requirements and qualifications.
- **Salary**: Salary offered for the job.
- **Posting Date**: The date the job was posted.

### Endpoints
1. **Posting New Job**
   - **Endpoint**: `POST /jobPostings`
   - **Request**: JSON payload containing job details.
   - **Response**: Confirmation of the created job posting.

2. **Update Job Posting**
   - **Endpoint**: `PUT /jobPostings/{jobId}`
   - **Request**: JSON payload with updated job details.
   - **Response**: Confirmation of the updated job posting.

3. **Delete Job Posting**
   - **Endpoint**: `DELETE /jobPostings/{jobId}`
   - **Request**: None.
   - **Response**: Confirmation of the deleted job posting.

4. **Get All Job Postings**
   - **Endpoint**: `GET /jobPostings`
   - **Request**: None.
   - **Response**: JSON array containing job details.


## 2. Hotel Room Reservation Service

### Description
A RESTful service for managing hotel room reservations. Users can reserve hotel rooms, view all available rooms, and cancel reservations.

### Entities
- **Room**
  - **Room ID**: Unique identifier for the room.
  - **Room Number**: The number assigned to the room.
  - **Type**: Room type (e.g., single, double, suite).
  - **Price**: Cost of the room.
  - **Availability**: Availability status of the room.
- **Reservation**
  - **Reservation ID**: Unique identifier for the reservation.
  - **Guest Name**: Name of the guest.
  - **Check-in Date**: Date of check-in.
  - **Check-out Date**: Date of check-out.
  - **Room ID**: Identifier of the reserved room.
  - **Total Price**: Total cost of the reservation.

### Endpoints
1. **Create Reservation**
   - **Endpoint**: `POST /reservations`
   - **Request**: JSON payload with reservation details.
   - **Response**: Confirmation of the created reservation.

2. **Get Available Rooms**
   - **Endpoint**: `GET /rooms?available=yes`
   - **Request**: None.
   - **Response**: JSON array with details of available rooms.

3. **Cancel Reservation**
   - **Endpoint**: `DELETE /reservations/{reservationId}`
   - **Request**: None.
   - **Response**: Confirmation of the canceled reservation.


## 3. Recipe Sharing Platform

### Description
A RESTful service for a recipe sharing platform where users can share, browse, update, and delete recipes.

### Entity: Recipe
- **Recipe ID**: Unique identifier for the recipe.
- **Title**: The title of the recipe.
- **Description**: Detailed description of the recipe.
- **Ingredients**: List of ingredients required.
- **Instructions**: Step-by-step instructions for preparation.
- **Difficulty Level**: Difficulty level of the recipe.
- **Cuisine Type**: Type of cuisine (e.g., Italian, Chinese).
- **Author**: User ID of the author.
- **Creation Date**: Date the recipe was created.

### Endpoints
1. **Get Recipe by ID**
   - **Endpoint**: `GET /recipes/{recipeId}`
   - **Request**: None.
   - **Response**: JSON representation of the recipe.

2. **Create Recipe**
   - **Endpoint**: `POST /recipes`
   - **Request**: JSON payload with recipe details.
   - **Response**: Confirmation of the created recipe.

3. **Update Recipe**
   - **Endpoint**: `PUT /recipes/{recipeId}`
   - **Request**: JSON payload with updated recipe details.
   - **Response**: Confirmation of the updated recipe.

4. **Delete Recipe**
   - **Endpoint**: `DELETE /recipes/{recipeId}`
   - **Request**: None.
   - **Response**: Confirmation of the deleted recipe.


## 4. Automobile Company Resource Management

### Description
A Spring Boot REST application providing CRUD operations for "Vehicle" and "User" resources in an automobile company.

### Entities
- **Vehicle**
  - **Id**: Unique identifier for each vehicle (auto-generated).
  - **Vname**: Vehicle name (e.g., Splendor, Amaze).
  - **Company**: Vehicle company (e.g., Hero, Honda).
  - **Vnumber**: Vehicle number (e.g., MH09AB1111).
  - **Vtype**: Vehicle type (e.g., bike, sedan).
  - **Uid**: User ID (foreign key).

- **User**
  - **Uid**: Unique identifier for each user.
  - **Uname**: User name.
  - **Email**: User email.
  - **Password**: User password.
  - **City**: User city.
  - **Contact_No**: User contact number.

### Endpoints
1. **Add New Vehicle**
   - **Endpoint**: `POST /vehicles`
   - **Request**: JSON payload with vehicle details.
   - **Response**: Confirmation of the created vehicle.

2. **Fetch All Vehicles for Given User**
   - **Endpoint**: `GET /vehicles?username={username}`
   - **Request**: None.
   - **Response**: JSON array with vehicle details for the specified user.

3. **Delete Vehicle Records for Given User**
   - **Endpoint**: `DELETE /vehicles?username={username}`
   - **Request**: None.
   - **Response**: Confirmation of the deleted vehicle records.

---

This README provides a comprehensive overview of the four RESTful services, including their purpose, entities, endpoints, and important notes for implementation.

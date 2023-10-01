# task

API Endpoints

GET /tasks: Get all tasks

GET /tasks/{id}: Get task by ID

POST /tasks: Create a new task

PUT /tasks/{id}: Update task by ID


Sample Requests

Get All Tasks

curl http://localhost:8080/tasks

Get Task by ID

curl http://localhost:8080/tasks/1

Create Task

curl -X POST -H "Content-Type: application/json" -d '{
  "title": "Task 1",
  "description": "This is the first task",
  "completed": false
}' http://localhost:8080/tasks

Update Task

curl -X PUT -H "Content-Type: application/json" -d '{
  "title": "Updated Task 1",
  "description": "This task has been updated",
  "completed": true
}' http://localhost:8080/tasks/1



Task Model: The Task model includes the following fields:

id (long)

title (String)

description (String)

completed (boolean)

createDate (Date)

completionDate (Date)

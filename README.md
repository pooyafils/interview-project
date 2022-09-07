# how code works
this application has a controller with the url `/checknumber` that takes 2 parameters `sum` and `numbers` which sends the respected 
parameter to the service and inside this service we check all numbers Composition to check which ones summation will be equal to the`sum` 
parameter and that add both numbers to the array and then to the hashmap and return it to the controller. exception that might be happened 
will be process by the controller advice that i created on the project. swagger will be available by `http://localhost:8080/swagger-ui/swagger-ui/index.html`

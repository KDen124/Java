
let employees;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://Lesson48ClassworkDBServer.ernestoporchett.repl.co";
  let route= "/employees"
  employees = $.getJSON(link+route).responseJSON;

  generateCards(employees);

  
}

function generateCards(employees){

  let output = document.getElementById("output");
  let build ="";

   
  for(let i=0; i<employees.length; i++){
    let employee = employees[i]
    build += `<div class="card" >`
    build += `<h3> Employee ID : ${employee.EmployeeId}</h3>`;
    build += `<div> First Name : ${employee.FirstName}</div>`;
    build += `<div> Last Name : ${employee.LastName}</div>`;
    build += `<p> City : ${employee.City}</p>`;
    build += `<hr>`;
    build += `</div>`;
  }

  output.innerHTML = build;
  

function filter(){
  let city = document.getElementById("city").value;
  console.log(city);

  let employeeList = []; //create a list of songs searched for
  
  for(let i=0; i<employee.length;i++){
    let employee = employee[i] //get each sog
    //make sure the list is no
    if( employee.City == city ) {
          //add to the new list
          employeeList.push(employee);
       }
    }
  console.log(`number found ${employeeList.length}`)
  generateCards(employeeList);
}

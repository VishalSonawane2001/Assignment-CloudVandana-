function addTask() {
    let taskInput = document.getElementById("taskInput");
    let dateInput = document.getElementById("dateInput");
    let timeInput = document.getElementById("timeInput");
    
    let taskText = taskInput.value.trim();
    let date = dateInput.value;
    let time = timeInput.value;
    
    if (taskText === "" || date === "" || time === "") return;
    
    let table = document.getElementById("taskList");
    let row = table.insertRow();
    let taskCell = row.insertCell(0);
    let dateCell = row.insertCell(1);
    let timeCell = row.insertCell(2);
    let actionCell = row.insertCell(3);

    taskCell.textContent = taskText;
    dateCell.textContent = date;
    timeCell.textContent = time;
    
    let removeButton = document.createElement("button");
    removeButton.textContent = "Remove";
    removeButton.onclick = function () {
        row.remove();
    };
    
    actionCell.appendChild(removeButton);
    taskInput.value = "";
    dateInput.value = "";
    timeInput.value = "";
}
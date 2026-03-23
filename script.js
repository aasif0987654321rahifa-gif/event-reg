form.addEventListener('submit', function(e) {
  e.preventDefault(); // stops page reload
  const name = document.getElementById('name').value;
  const email = document.getElementById('email').value;
  const phone = document.getElementById('phone').value;
  const event = document.getElementById('event').value;
  const mode = document.getElementById('mode').value;

  const newRow = table.insertRow();
  newRow.innerHTML = `<td>${name}</td><td>${email}</td><td>${phone}</td><td>${event}</td><td>${mode}</td>`;
  
  form.reset(); // clears the form after submission
});

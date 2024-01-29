//
//
//$(document).ready(function() {
//    cargarOfertas();
//});
//
//
//
//
//
//async function cargarOfertas(){
//
//    const request = await fetch('ofertarest', {
//      method: 'GET',
//      headers: {
//        'Accept': 'application/json',
//        'Content-Type': 'application/json'
//      }
//
//    });
//    const ofertas = await request.json();
//
//    console.log(ofertas);
//
//    
//}

// fetchScript.js

document.addEventListener('DOMContentLoaded', function () {
  const url = '/ofertarest'; // Reemplaza con la URL de tu controlador Spring Boot

  fetch(url)
    .then(response => {
      if (!response.ok) {
        throw new Error(`Error: ${response.status} - ${response.statusText}`);
      }
      return response.json();
    })
    .then(data => {
      console.log('Respuesta exitosa:', data);
      // Puedes realizar acciones adicionales con los datos recibidos aquí
    })
    .catch(error => {
      console.error('Error en la solicitud:', error);
    });
});
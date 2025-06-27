import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';

import NombreApellido from './components/NombreApellido.jsx'
import DatosPersonales from './components/DatosPersonales.jsx'
import Estudios from './components/Estudios.jsx'
import CursosRealizados from './components/CursosRealizados.jsx'
import HabilidadesBlandas from './components/HabilidadesBlandas.jsx'
import HabilidadesTecnicas from './components/HabilidadesTecnicas.jsx'
import Contacto from './components/Contacto.jsx'

function App() {
  return (
    <div className="App">
      <NombreApellido />
      <div className="d-flex justify-content-end align-items-start"> {/* Contenedor flex */}
    <img 
    src="/foto.png" 
    alt="Foto" 
    className="img-fluid rounded-circle" 
    style={{ 
      maxWidth: '700px', 
      height: '460px',  // Mantiene la altura de la imagen
      objectFit: 'cover', // Asegura que la imagen cubra el área sin distorsionarse
      position: 'relative', // Necesario para usar marginTop y marginLeft
      zIndex: 1, // Asegura que la imagen esté por encima de otros elementos
      marginBottom: '50px', // Espacio debajo de la imagen
      marginTop: '-560px',  // Sube la imagen 
      marginLeft: '5px',   // Espacio a la izquierda (opcional)
  }}
  />
  </div>
      <DatosPersonales />
      <Estudios />
      <CursosRealizados />
      <HabilidadesBlandas />
      <HabilidadesTecnicas />
{/* Contenedor padre para los logos (alineados a la derecha) */}
      <div className="logos-container d-flex justify-content-center gap-3 mb-5" >
        
        {/* Contenedores individuales para cada logo */}
        <div className="logo-box"
        style={{ 
      width: "120px",   // Ancho fijo del contenedor
      height: "80x",  // Alto fijo (igual que el ancho para cuadrados)
      objectFit: "contain", 
      border: "3px solid #000",
      borderRadius: "15px",
      backgroundColor: "#eeda22",
      justifyContent: "center",
      alignItems: "center",
      padding: "10px",  // Espacio interno
    }}>
          <img src="/logo_tecnologias_web.png" alt="Tecnologías Web" className="tech-logo" />
        </div>
        <div className="logo-box"
        style={{ 
      width: "120px",   // Ancho fijo del contenedor
      height: "120px",  // Alto fijo (igual que el ancho para cuadrados)
      border: "3px solid #000",
      borderRadius: "15px",
      backgroundColor: "#eeda22",
      justifyContent: "center",
      alignItems: "center",
      padding: "10px",  // Espacio interno
    }}>
          <img src="/SQL_Mongo_logo.png" alt="Bases de datos" className="tech-logo" />
        </div>
        <div className="logo-box"
        style={{ 
      width: "120px",   // Ancho fijo del contenedor
      height: "120px",  // Alto fijo (igual que el ancho para cuadrados)
      border: "3px solid #000",
      borderRadius: "15px",
      backgroundColor: "#eeda22",
      justifyContent: "center",
      alignItems: "center",
      padding: "10px",  // Espacio interno
    }}>
          <img src="/node_react_logo.png" alt="Node y React" className="tech-logo" />
        </div>
        <div className="logo-box"
        style={{ 
      width: "120px",   // Ancho fijo del contenedor
      height: "120px",  // Alto fijo (igual que el ancho para cuadrados)
      border: "3px solid #000",
      borderRadius: "15px",
      backgroundColor: "#eeda22",
      justifyContent: "center",
      alignItems: "center",
      padding: "10px",  // Espacio interno
    }}>
          <img src="/logo_boostrap.png" alt="Bootstrap" className="tech-logo" />
        </div>
        <div className="logo-box"
        style={{ 
      width: "120px",   // Ancho fijo del contenedor
      height: "120px",  // Alto fijo (igual que el ancho para cuadrados)
      border: "3px solid #000",
      borderRadius: "15px",
      backgroundColor: "#eeda22",
      justifyContent: "center",
      alignItems: "center",
      padding: "10px",  // Espacio interno
    }}>
          <img src="/Scrum_logo.jpeg" alt="Scrum" className="tech-logo" />
        </div>
      </div>

      <Contacto />
    </div>
  );
}

export default App;


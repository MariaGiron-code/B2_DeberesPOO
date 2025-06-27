function NombreApellido() {
  return (
    <div className="nombre-container p-4"> 
      <div className="text-center mb-4">
        {/* Nombre y título */}
        <h1 className="fw-bold mb-2">María Paula Girón Cedeño</h1>
        <h2 className="text-uppercase fs-4" style={{ letterSpacing: '3px' }}>Desarrolladora Fullstack Junior</h2>
      </div>

      {/* Descripción */}
      <div className="mb-4 p-3 bg-dark text-white rounded-3"> {/* Fondo negro para contraste */}
        <p className="mb-0">
          Apasionada por la programación y el diseño de sistemas eficientes, soy una desarrolladora 
          backend y frontend con mente analítica y visión creativa. Disfruto encontrar soluciones 
          elegantes a problemas complejos, y transformar ideas técnicas en herramientas funcionales, 
          robustas y atractivas.
        </p>
      </div>

      {/* Áreas de interés */}
      <div className="areas-interes p-3">
        <h3 className="fw-bold border-bottom border-3 border-black pb-2 mb-3">ÁREAS DE INTERÉS</h3>
        <ul className="list-unstyled">
          <li className="mb-2 d-flex align-items-center">
            <span className="me-2">•</span> Gestion de proyectos mediante metodologías ágiles
          </li>
          <li className="mb-2 d-flex align-items-center">
            <span className="me-2">•</span> Desarrollo de aplicaciones web y móviles
          </li>
          <li className="mb-2 d-flex align-items-center">
            <span className="me-2">•</span> Integración de bases de datos y servicios web
          </li>
          <li className="mb-2 d-flex align-items-center">
            <span className="me-2">•</span> Colaboración en equipos multidisciplinarios
          </li>
          <li className="d-flex align-items-center">
            <span className="me-2">•</span> Machine Learning
          </li>
        </ul>
      </div>
    </div>
  );
}

export default NombreApellido;
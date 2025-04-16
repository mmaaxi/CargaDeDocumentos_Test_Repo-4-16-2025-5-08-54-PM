Feature: Manejo de error en carga con conexión inestable
  Como usuario autenticado
  Quiero recibir un error al cargar un archivo con conexión inestable
  Para saber que debo intentar nuevamente.

  Scenario: Validar manejo de error en carga con conexión inestable
    Given El usuario está autenticado y en la página de carga de documentos
    When Se simula inestabilidad en la conexión durante la carga
    And Hace clic en 'Cargar'
    Then Se muestra el mensaje de error 'Error de conexión, intente nuevamente'
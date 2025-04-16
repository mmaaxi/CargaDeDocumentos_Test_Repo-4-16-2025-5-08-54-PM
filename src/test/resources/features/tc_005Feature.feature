Feature: Validar mensaje de error al intentar cargar sin seleccionar archivo

  Background:
    Given el usuario está autenticado y en la página de carga de documentos

  Scenario: Mostrar mensaje de error al cargar sin seleccionar archivo
    When el usuario no selecciona ningún archivo y hace clic en el botón 'Cargar'
    Then se muestra el mensaje de error 'No se ha seleccionado archivo'
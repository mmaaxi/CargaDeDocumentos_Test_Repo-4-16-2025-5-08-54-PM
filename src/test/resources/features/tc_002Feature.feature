Feature: Validar mensaje de error para formato no permitido

  Scenario: Usuario intenta cargar archivo con formato no permitido
    Given Usuario autenticado y en la página de carga de documentos
    When Seleccionar un archivo con formato no permitido
    And Hacer clic en el botón 'Cargar'
    Then Se muestra mensaje 'Formato de archivo no permitido'
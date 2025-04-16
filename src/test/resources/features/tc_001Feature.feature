Feature: Validar acceso a la funcionalidad de carga de documentos

  Scenario: Usuario puede cargar un archivo PDF
    Given Usuario autenticado y en la página de carga de documentos
    When Selecciona un archivo PDF válido
    And Hace clic en el botón 'Cargar'
    Then El sistema muestra mensaje de éxito y el documento se añade a la lista
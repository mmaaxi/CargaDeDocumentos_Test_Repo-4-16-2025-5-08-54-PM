Feature: Validar carga múltiple de documentos

  Scenario: Carga exitosa de múltiples documentos
    Given el usuario está autenticado y en la página de carga de documentos
    When selecciona varios archivos PDF válidos
    And hace clic en el botón 'Cargar'
    Then todos los documentos se cargan correctamente y aparecen en la lista
Feature: Validar comprobación de tamaño máximo del documento

  Scenario: Subir archivo que excede el tamaño máximo permitido
    Given El usuario está autenticado y en la página de carga de documentos
    When El usuario selecciona un archivo que excede el tamaño máximo permitido
    And El usuario hace clic en el botón 'Cargar'
    Then Se muestra un mensaje de error indicando que el archivo excede el tamaño máximo permitido
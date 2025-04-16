Feature: Validar funcionamiento del botón Cancelar en la carga de documentos

  Scenario: El usuario cancela la carga de un documento
    Given El usuario está autenticado y en proceso de carga con un archivo seleccionado
    When El usuario hace clic en el botón 'Cancelar'
    Then El formulario se reinicia y se descarta el archivo seleccionado
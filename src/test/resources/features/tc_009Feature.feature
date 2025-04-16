Feature: Validar registro en sistema tras carga exitosa de documento

  Scenario: Validar documento en listado y en el sistema tras carga exitosa
    Given Usuario autenticado y con un documento cargado exitosamente
    When Verificar la base de datos o registro de sistema
    Then El documento aparece en la lista de carga
    And El documento aparece registrado en el sistema
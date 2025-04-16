Feature: Validar registro de logs de actividad de carga de documentos

  Scenario: Registro y consulta de log de carga de documentos
    Given el usuario está autenticado y ha realizado una carga exitosa
    When el usuario consulta el log de actividades
    Then se muestra una entrada con los detalles de la carga
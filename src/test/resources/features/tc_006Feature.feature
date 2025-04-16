Feature: Visualización de vista previa del documento cargado

  Scenario: Validar visualización de vista previa del documento cargado
    Given el usuario ha iniciado sesión y navega a la sección de carga
    And la interfaz muestra la opción de vista previa
    When el usuario selecciona un archivo PDF válido
    Then el sistema muestra una vista previa del documento cargado
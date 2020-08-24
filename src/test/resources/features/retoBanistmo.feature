Feature: reto de automatización web banco Banistmo para ingreso a un proyecto de desarrollo en Banistmo

  Scenario: tarifas de cuentas de depositos desde busqueda
    Given el usuario ingresa a la pagina de Banistmo
    When se dirige al tarifario del banco
    And se da clic a la imagen de pdf para ver las tarifas cuenta deposito
    Then valida que el archivo de tarifas se abra en una nueva ventana

  @pdf
  Scenario: tarifas de cuentas de depositos desde tarifario
    Given el usuario ingresa a la pagina de Banistmo
    When se dirige al tarifario del banco
    And se da clic a la imagen de pdf para ver las tarifas cuenta deposito
    Then valida que se abre el archivo embebido
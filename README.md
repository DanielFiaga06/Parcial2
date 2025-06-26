# Parcial2
1. Estructura del Proyecto
   
![Estructura del proyecto](https://github.com/user-attachments/assets/a74e6567-647d-4985-aec6-ecb10b41b62f)


El proyecto está organizado en múltiples clases dentro de paquetes. Cada clase tiene una responsabilidad clara:

Paciente, Medico y Administrativo heredan de Usuario.

Clinica centraliza la lógica de manejo de datos.

Persistencia se encarga del guardado/cargado en archivos .txt.

FormularioPaciente, FormularioMedico, FormularioConsulta representan las interfaces gráficas para ingresar datos.

2. Clases Base

![Clase paciente](https://github.com/user-attachments/assets/2b488b53-7f6f-4df3-8dc3-616eb02fdd6a)

Define los atributos y métodos específicos para un paciente. Incluye id, nombre, usuario, contraseña y edad. Hereda de Usuario.

![Clase usuario](https://github.com/user-attachments/assets/2baf72d0-338c-4cc4-b198-753031fde908)

Esta es una clase abstracta base para pacientes, médicos y administrativos. Contiene usuario, contraseña, nombre completo con sus respectivos getters, método verificarContraseña() para validar los datos que el usuario digita y un método getTipo() para conseguir el tipo de dato que se ingresa. Con ello, esta información será utilizada más adelante.

![clase medico 1](https://github.com/user-attachments/assets/a1f58780-7bca-4dd1-9f02-1aa7ad2f805d)

![clase medico 2](https://github.com/user-attachments/assets/81464d82-c255-42c7-96b5-0ebdd463615c)

Define un médico con su especialidad y una lista de consultas agendadas. También hereda de Usuario. Para ello se usa extends y se llaman a todos los getters con toda la informacion del medico que se registró; esto con la idea de usar dicha información para poder agendar las consultas necesarias.

3. Lógica del Sistema

![clase clinica 1](https://github.com/user-attachments/assets/a561a98b-5eb9-44a6-b64a-6e682e0ab6db)

![clase clinica 2](https://github.com/user-attachments/assets/43a6f980-1fe9-4784-825c-8bc075d9faa2)

![clase clinica 3](https://github.com/user-attachments/assets/ae23d4c5-7357-4ac2-beaf-b66d87f61157)

![clase clinica 4](https://github.com/user-attachments/assets/7fedf1a4-9704-4b16-9552-c1180d52380c)

Es el controlador principal, maneja listas de pacientes, médicos y consultas. Tiene métodos para agregar elementos, buscar usuarios y guardar toda la información con guardarTodo(). Aquí se incluye el agregar y buscar pacientes y médicos, luego con el uso de listas se consiguen esos datos para implementar la opción de agregar y guardas las consultas realizadas, igualmente a través de una lista y por último se recogen todos los pacientes y médicos que hayan sido registrados hasta ese momento. Por consiguiente, se añade la opción de visualizar el historial por médico y por paciente con la información necesaria para revisar todos los reportes que ha hecho el médico y mostrar un diagnóstico certero y un tratamiento especial para el paciente según corresponda.

![clase persistencia 1](https://github.com/user-attachments/assets/2058d3d9-3ed4-4e58-918f-70bbee94ee8e)

![clase persistencia 2](https://github.com/user-attachments/assets/8fdca564-9392-4568-a735-d197820a754e)

![clase persistencia 3](https://github.com/user-attachments/assets/07e986db-19f0-468c-a82b-fa3e90b37a80)

![clase persistencia 4](https://github.com/user-attachments/assets/af4ec510-955a-4b15-bc2f-430b8ddd1733)

Por su parte, esta clase con métodos estáticos se encarga de guardar y cargar listas de objetos desde archivos .txt. Cada tipo (Paciente, Medico, Consulta) tiene su propio archivo. Allí se implementa el cargarpacientes() y guardarpacientes() que lo que hace es pegar una lista de datos en un archivo de texto verificando que efectivamente ese archivo si vaya a existir. Se hace exactamente la misma operación con los médicos y las consultas utilizando lectores que verifican que los datos hayan sido digitados de manera correcta y entendible para el sistema.

4. Interfaces Gráficas

![interfaz ventana 1](https://github.com/user-attachments/assets/01e99208-3d9d-4177-a9c8-2f780ef02f41)

![Interfaz ventana 2](https://github.com/user-attachments/assets/9883d652-b72a-4d71-ab83-2bbb33d6034d)

Es la interfaz principal que muestra los botones necesarios para registrar pacientes, médicos, consultas y salir. Está organizada con GridLayout. Muestra el menú con opciones para registrar pacientes, médicos y consultas con toda la información y datos requeridos.

![formulario paciente 1](https://github.com/user-attachments/assets/296dbece-c104-4efc-bbe8-2827789ef590)

![form paciente 2](https://github.com/user-attachments/assets/7bbbbab1-f847-4541-a592-b93471592c47)

Consta de un formulario de entrada de datos y cómo se enlaza con la clase Clinica. Permite ingresar datos específicos del tipo de usuario y guarda la información al presionar el botón "Guardar", se verifican todas las operaciones y en caso de presentarse la falta de algún dato específico, se realiza un llamado de atención indicando que es necesario revisar si todos los campos están correctamente diligenciados.

![form medico 1](https://github.com/user-attachments/assets/33297e5f-1bb8-43aa-b17c-4005e9ebdf13)

![form medico 2](https://github.com/user-attachments/assets/082c416a-856b-4ee5-a13e-935a76a60f27)

Consta de un formulario de entrada de datos y cómo se enlaza con la clase Clinica. Contiene las mismas funciones que el formulario anterior solamente que guarda la información correspondiente a los médicos en este caso. 

![form consulta 1](https://github.com/user-attachments/assets/0395e796-dd80-4d50-a5f3-bfeab74fc184)

![form consulta 2](https://github.com/user-attachments/assets/885b2839-eefc-4010-9ae5-717e67ab73a0)

Consta de un formulario de entrada de datos y cómo se enlaza con la clase Clinica. A diferencia de los anteriores, presenta un cambio, contiene un Combobox con pacientes y médicos, campos de texto, y lógica del botón Guardar. Gracias a esto, Permite seleccionar un paciente y un médico, ingresar síntomas, diagnóstico y tratamiento, y registrar una nueva consulta.

5. Funcionalidades Avanzadas

![hist paciente 1](https://github.com/user-attachments/assets/3103a6b0-3697-4ad4-b6e1-88c04c04f7a6)

![his paciente 2](https://github.com/user-attachments/assets/0df16b64-bb91-4bb0-9761-f01c9e84427e)

Filtra las consultas por ID de paciente. En este caso se implementó un método que recibe el usuario del paciente y retorna una lista con todas las consultas que ha tenido.

![his medico 1](https://github.com/user-attachments/assets/0211c8b5-78e4-4823-a176-ffd2ed093264)

![his medico 2](https://github.com/user-attachments/assets/3aab72a6-3259-4179-8b96-145280bbf413)

Similar al anterior pero por usuario de médico, filtrando las consultas por el usuario del médico que las atendió.

 6. Pruebas y Resultados

Para probar el sistema, se va a tratar como si fuera una situación real tratando de ser lo más preciso posible de lo que puede llegar a pasar y lo que se tendría que registrar en un caso habitual o común. Incluye logs de consola donde se muestra que los datos se guardan correctamente.

![prue 1](https://github.com/user-attachments/assets/f12998f2-08fe-4a47-8936-ced7180d4e2e)

![prue 2](https://github.com/user-attachments/assets/8e7a81ac-9c97-4a58-ad29-d2bb0fbbda62)

![prue 3](https://github.com/user-attachments/assets/b4972aca-57c7-41ef-8db8-91d1d67fbd00)

![prue 4](https://github.com/user-attachments/assets/b54d4e22-6180-4ce9-8d84-b0fc8cbd3cd8)

![prue 5](https://github.com/user-attachments/assets/ad3cd09f-6351-4052-b2b9-0a139077e69e)

![prue 6](https://github.com/user-attachments/assets/30c73680-47b2-4ed1-97af-87eb254da5a2)

![prue 7](https://github.com/user-attachments/assets/c4703b51-6c4c-4ea4-bd3a-09b7b87f0695)

![prue 8](https://github.com/user-attachments/assets/bac9be5e-ee46-46d9-b791-0cc266b369e9)





































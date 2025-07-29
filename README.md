📘 TallerHashMap
Programa Java para crear un diccionario interactivo usando HashMap y ArrayList, con un menú que permite agregar, mostrar, modificar, eliminar y salir.

🚀 Inicio
1. Clonar o descargar código
Asegúrate de tener Java instalado y luego guarda tu archivo TallerHashMap.java en una carpeta de proyecto.

2. Compilar
bash
Copy
Edit
javac TallerHashMap.java
3. Ejecutar
bash
Copy
Edit
java org.example.TallerHashMap
🧩 ¿Qué hace el programa?
📁 Estructura de datos
ArrayList<HashMap<Integer, String>> lista: colección de entradas del diccionario, donde cada HashMap representa un par ID → valor.

🔁 Menú con while
java
Copy
Edit
int opcion = 0;
while (opcion != 5) { ... }
Este bucle se repite hasta que el usuario elige la opción 5 (Salir).

📥 Leer opción y limpiar buffer
java
Copy
Edit
opcion = sc.nextInt();
sc.nextLine();
Después de leer un número, nextLine() elimina el salto de línea que queda en el buffer para que no interrumpa lecturas de texto.

🛠️ Opciones del menú (if / else if)
Agregar (1)
Pide ID y valor. Crea un HashMap, usa put(id, valor) y lo añade a la lista.
put añade o actualiza información en un HashMap según la clave. 
Stack Overflow

Mostrar (2)
Recorre cada entrada:

java
Copy
Edit
for (Integer clave : e.keySet()) { ... }
El método keySet() obtiene todas las claves del HashMap, y luego con e.get(clave) obtienes el valor asociado. 
Baeldung

Modificar (3)
Busca por ID con containsKey(idBusq) y, si existe, actualiza el valor con put(idBusq, nuevo).

Eliminar (4)
Recorre la lista con índice, busca una entrada con esa clave y la elimina con lista.remove(i).

Salir (5)
Rompe el bucle y termina el programa.

✅ Si la opción no es válida, muestra "Opción inválida."

🔄 Flujo general del programa
Entra al while.

Muestra menú y lee la opción.

Ejecuta la sección correspondiente del if.

Vuelve a mostrar el menú hasta que el usuario elige salir.

❓ Glosario de métodos importantes
Método	¿Qué hace?
sc.nextInt()	Lee un número entero
sc.nextLine()	Limpia buffer tras leer un entero
HashMap.put(k, v)	Agrega o actualiza el valor para la clave
HashMap.containsKey(k)	Verifica si existe la clave
HashMap.keySet()	Devuelve un conjunto con todas las claves 
Stack Overflow
+1
github.com
+1
HashMap.get(k)	Obtiene el valor asociado a la clave
ArrayList.add(...)	Añade un elemento a la lista
ArrayList.get(i)	Recupera el elemento en la posición i
ArrayList.remove(i)	Elimina el elemento en la posición i

✔️ Resumen con emojis
🏷️ ID y valor se almacenan como un HashMap<Integer, String>

📥 Agregar → put(...) + add(...)

🔍 Mostrar → usar keySet() + get(...)

✏️ Modificar → containsKey() + put(...)

🗑️ Eliminar → buscar y remove(...)

🚪 Salir → opción 5 sale del programa

🔁 Menú se repite con while (opcion != 5)

💡 Tips de mejora
Validar que no se agreguen IDs duplicados.

Usar entrySet() para imprimir clave y valor juntos (más eficiente).

Convertir el código a clases (Producto, ciclos más simples, etc.).


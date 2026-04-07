# Reto 002 - Criptaritmos con recursividad

## Autor
Dylan Naranjo

## Descripción
Este proyecto resuelve criptaritmos mediante recursividad utilizando backtracking.

Se busca asignar dígitos a letras de forma que la suma sea válida, cumpliendo:

- cada letra representa un dígito distinto
- no se permiten ceros a la izquierda
- se consideran los acarreos
- se valida la suma por columnas

---

## Problemas resueltos

- SEND + MORE = MONEY  
- FORTY + TEN + TEN = SIXTY  
- ODD + ODD = EVEN  

---

## Enfoque

Se implementa un algoritmo de **backtracking recursivo** que:

1. recorre la suma columna por columna (de derecha a izquierda)
2. asigna dígitos a letras no usadas
3. valida cada columna con el acarreo
4. aplica poda si una combinación no cumple
5. usa patrón hacer / deshacer

---

## Estructura del proyecto

```bash
entregas/naranjoDylan/
├── README.md
├── src/
│   ├── App.java
│   ├── Criptaritmo.java
│   ├── SolverCriptaritmo.java
│   └── ResultadoCriptaritmo.java
├── modelosUML/
│   ├── DiagramaClases.puml
│   └── DiagramaActividad.puml
├── images/
│   ├── DiagramaClases.png
│   └── DiagramaActividad.png
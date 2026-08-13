# 🚗 Ejercicio 3 — Simulación de un Vehículo

---

## 📝 Descripción

El sistema permite crear un vehículo con sus datos principales y simular su aceleración y desaceleración en tiempo de ejecución, controlando que la velocidad nunca descienda por debajo de $0\text{ km/h}$.

---

## 🚀 Funcionalidades y Requerimientos

### 📦 Clase `Vehiculo`

* **Atributos:**
  * Marca (String)
  * Modelo (String)
  * Velocidad actual (double)

* **Métodos:**
  * Acelerar(cantidad): Incrementa la velocidad actual según el valor indicado.
  * Frenar(cantidad): Disminuye la velocidad actual, asegurando que esta **nunca sea menor a 0**.
  * MostrarEstado(): Imprime en pantalla la marca, modelo y la velocidad actual del vehículo.

--

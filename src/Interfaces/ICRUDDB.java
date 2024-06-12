/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author plini
 */
public interface ICRUDDB<T> {
    public int Crear(T entidad);
    public T Get(String x);
    public T GetAllEstado(String x);
    public ArrayList<T> Get();
    public ArrayList<T> GetAll();
    public int Eliminar(String x);
    public int Modificar(T entidad);
}

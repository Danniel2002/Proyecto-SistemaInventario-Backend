package com.unbosque.sistemainventario.service.serviceApi;

import java.util.List;

import com.unbosque.sistemainventario.model.Producto;
import com.unbosque.sistemainventario.model.Reporte;

public interface ProductoService {
    
    List<Producto> getProductos();
    Producto getProductoById(Long id);
    Producto insertProducto(Producto producto);
    void updateProducto(Long id, Producto producto);
    void deleteProducto(Long id);
    Producto getProductoByNombre(String nombre);
}

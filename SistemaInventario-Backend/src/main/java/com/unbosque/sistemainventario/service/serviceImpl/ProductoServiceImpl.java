package com.unbosque.sistemainventario.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;import java.util.Optional;

import com.unbosque.sistemainventario.model.Producto;
import com.unbosque.sistemainventario.repository.ProductoRepository;
import com.unbosque.sistemainventario.service.serviceApi.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
   
    
    public ProductoRepository getProductoRepository() {
        return this.productoRepository;
    }

    public void setProductoRepository(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> getProductos() {
        List<Producto> producto = new ArrayList<>();
        productoRepository.findAll().forEach(producto::add);
        return producto;
    }

   
    
    @Override
    public Producto getProductoById(Long id) {
        Producto producto = productoRepository.findById(id).get();
        return producto;
    }

    @Override
    public Producto insertProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void updateProducto(Long id, Producto producto) {
        Producto upProducto = productoRepository.findById(id).get();
        if (producto.getNombre() != null) {
            upProducto.setNombre(producto.getNombre());   
        }
        if (producto.getPrecioCompra() != 0.0) {
            upProducto.setPrecioCompra(producto.getPrecioCompra());
        }
        if (producto.getPrecioVenta() != 0.0) {
            upProducto.setPrecioVenta(producto.getPrecioVenta());   
        }
        if (producto.getStock() != 0) {
            upProducto.setStock(producto.getStock());
        }
        productoRepository.save(upProducto);
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
        
    }
    @Override
    public Producto getProductoByNombre(String nombre) {
        Producto producto = productoRepository.findByNombre(nombre).get();
        return producto;
    }
    
}

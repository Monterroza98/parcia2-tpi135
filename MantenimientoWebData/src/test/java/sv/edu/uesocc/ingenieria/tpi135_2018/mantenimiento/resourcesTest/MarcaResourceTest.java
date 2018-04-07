/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.resourcesTest;

import java.util.List;
import javax.json.JsonArray;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Marca;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.resources.MarcaResource;

/**
 *
 * @author jose
 */
public class MarcaResourceTest {
    
    public MarcaResourceTest() {
    }
    
    
    @Test
    public void FindAllTestST(){
        ClientBuilder cd = ClientBuilder.newBuilder();
        Client c= cd.build();
        WebTarget t= c.target("http://localhost:8080/MantenimientoWebApp-1.0-SNAPSHOT.war/Marca");
         t.path("marca").request(MediaType.APPLICATION_JSON).get(JsonArray.class);
   
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class MarcaResource.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        MarcaResource instance = new MarcaResource();
        List<Marca> expResult = null;
        List<Marca> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class MarcaResource.
     */
    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        MarcaResource instance = new MarcaResource();
        List<Marca> expResult = null;
        List<Marca> result = instance.findRange(first, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByName method, of class MarcaResource.
     */
    @Test
    public void testFindByName() {
        System.out.println("findByName");
        
        String nombre = "";
        int first = 1;
        int pageSize = 100;
        MarcaResource instance = new MarcaResource();
        List<Marca> resultado = instance.findRange(first, pageSize);
        Response expResult = null;
        Response result = instance.findByName(nombre, first, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class MarcaResource.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        MarcaResource instance = new MarcaResource();
        Integer expResult = null;
        Integer result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarRangos method, of class MarcaResource.
     */
    @Test
    public void testValidarRangos() {
        System.out.println("validarRangos");
        int first = 0;
        int pageSize = 0;
        MarcaResource instance = new MarcaResource();
        boolean expResult = false;
        boolean result = instance.validarRangos(first, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class MarcaResource.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Marca registro = null;
        MarcaResource instance = new MarcaResource();
        Marca expResult = null;
        Marca result = instance.create(registro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class MarcaResource.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Marca registro = null;
        MarcaResource instance = new MarcaResource();
        Marca expResult = null;
        Marca result = instance.edit(registro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MarcaResource.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Marca registro = null;
        MarcaResource instance = new MarcaResource();
        Marca expResult = null;
        Marca result = instance.remove(registro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

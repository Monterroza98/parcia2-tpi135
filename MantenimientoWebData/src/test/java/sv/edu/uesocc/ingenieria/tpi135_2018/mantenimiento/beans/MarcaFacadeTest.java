/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.powermock.reflect.Whitebox;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Marca;

/**
 *
 * @author joker
 */
public class MarcaFacadeTest {
    
//    protected static EntityManagerFactory emf;
//    protected static EntityManager em;
    
    public MarcaFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
//        emf = Persistence.createEntityManagerFactory("mantenimientoTestPU");
//        em = emf.createEntityManager();
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
     * Test of create method, of class MarcaFacade.
     */
    @Test
    public void testCreate() throws Exception {
        Marca marca1= new Marca();
        marca1.setIdMarca(1);
        marca1.setNombre("HP");
        marca1.setActivo(true);
        marca1.setDescripcion("marca HP");
        
        MarcaFacade mf= new MarcaFacade();
//        Whitebox.setInternalState(mf, "em", em);
        
        mf.getEntityManager().getTransaction().begin();
        
        boolean test1 = mf.create(marca1);
        
        mf.getEntityManager().getTransaction().commit();
        
        assertTrue(test1);
    }

//    /**
//     * Test of remover method, of class MarcaFacade.
//     */
    @Test
    public void testRemover() throws Exception {
        System.out.println("remover");
        Marca entity = null;
        MarcaFacade instance = new MarcaFacade();
        Marca expResult = null;
        Marca result = null;
//        Marca result = instance.remover(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of crear method, of class MarcaFacade.
//     */
//    @Test
//    public void testCrear() throws Exception {
//        System.out.println("crear");
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        Marca expResult = null;
//        Marca result = instance.crear(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of edit method, of class MarcaFacade.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        System.out.println("edit");
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        boolean expResult = false;
//        boolean result = instance.edit(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editar method, of class MarcaFacade.
//     */
//    @Test
//    public void testEditar() throws Exception {
//        System.out.println("editar");
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        Marca expResult = null;
//        Marca result = instance.editar(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class MarcaFacade.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        boolean expResult = false;
//        boolean result = instance.remove(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of find method, of class MarcaFacade.
//     */
//    @Test
//    public void testFind() throws Exception {
//        System.out.println("find");
//        Object id = null;
//        MarcaFacade instance = new MarcaFacade();
//        Marca expResult = null;
//        Marca result = instance.find(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findAll method, of class MarcaFacade.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        MarcaFacade instance = new MarcaFacade();
//        List<Marca> expResult = null;
//        List<Marca> result = instance.findAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findRange method, of class MarcaFacade.
//     */
//    @Test
//    public void testFindRange() throws Exception {
//        System.out.println("findRange");
//        int first = 0;
//        int pageSize = 0;
//        MarcaFacade instance = new MarcaFacade();
//        List<Marca> expResult = null;
//        List<Marca> result = instance.findRange(first, pageSize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of count method, of class MarcaFacade.
//     */
//    @Test
//    public void testCount() throws Exception {
//        System.out.println("count");
//        MarcaFacade instance = new MarcaFacade();
//        int expResult = 0;
//        int result = instance.count();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByNombreLike method, of class MarcaFacade.
//     */
//    @Test
//    public void testFindByNombreLike() throws Exception {
//        System.out.println("findByNombreLike");
//        String nombre = "";
//        Integer first = null;
//        Integer pageSize = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        MarcaFacadeLocal instance = (MarcaFacadeLocal)container.getContext().lookup("java:global/classes/MarcaFacade");
//        List<Marca> expResult = null;
//        List<Marca> result = instance.findByNombreLike(nombre, first, pageSize);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

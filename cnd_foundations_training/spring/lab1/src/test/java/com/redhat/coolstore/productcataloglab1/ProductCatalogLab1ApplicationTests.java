package com.redhat.coolstore.productcataloglab1;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.redhat.coolstore.productcataloglab1.service.ProductCatalogService;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.springframework.test.context.ActiveProfiles;
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class ProductCatalogLab1ApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
    private ProductCatalogService productCatalogService;
	
	@Test
	public void testDefaultProductList() {
		String message = productCatalogService.sayHello();
		assertTrue(message!=null);
		assertEquals(message,"Hey Developer!");
	}
}

package io.github.kritin_puri_git.crypto;

import io.github.kritin_puri_git.crypto.facade.CryptoFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CryptoApplicationTests {

//	@Test
//	void contextLoads() {
//	}


    @Autowired
    private ApplicationContext applicationContext;

//    @Test
//    void cryptoBeansAreLoaded() {
//
//        CryptoFacade cryptoFacade =
//                applicationContext.getBean(CryptoFacade.class);
//
//        System.out.println(
//                "CryptoFacade bean = " + cryptoFacade
//        );
//    }

//    @Test
//    void cryptoBeansAreLoaded() {
//
//        assertTrue(applicationContext.containsBean("cryptoFacade"));
//
//        CryptoFacade cryptoFacade =
//                applicationContext.getBean(CryptoFacade.class);
//
//        assertNotNull(cryptoFacade);
//    }

}

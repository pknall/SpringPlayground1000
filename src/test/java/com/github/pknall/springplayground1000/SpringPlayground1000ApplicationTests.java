package com.github.pknall.springplayground1000;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringPlayground1000ApplicationTests {

    @Test
    void contextLoads() {
        // Even without any assertions or code of any kind, this empty test method will prompt the two annotations
        // to do their job and load the Spring application context.  If there are any problems in doing so,
        // the test fails.
    }

}

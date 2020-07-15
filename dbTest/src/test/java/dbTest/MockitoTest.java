package dbTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.hcl.dbTest.main.Trades;
import com.hcl.dbTest.service.ExecutionService;

public class MockitoTest  {

    @Mock
    ExecutionService service;


    @InjectMocks
    private ExecutionService service1 = new Trades();

    @Test
    void setMockOutput() {
    
       
    }
    
    
}

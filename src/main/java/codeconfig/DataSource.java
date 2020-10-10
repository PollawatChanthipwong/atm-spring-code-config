package codeconfig;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}

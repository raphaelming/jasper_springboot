package kr.co.infomind.report.Service;


import kr.co.infomind.report.Domain.Product;
import kr.co.infomind.report.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public List<Map<String, Object>> productFindAll() {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        for (Product product : productRepository.findAll()) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("ID", product.getId());
            item.put("NAME", product.getName());
            item.put("PRICE", product.getPrice());
            item.put("QUANTITY", product.getQuantity());
            item.put("CATEGORY_NAME", product.getCategoryName());
            result.add(item);
        }
        return result;
    }

    public Collection productTest() {
        Collection result = productRepository.findAll();
        return result;
    }
}

package demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/20/17 17:23
 * https://github.com/thu/JavaEE_Framework_1702A/
 *
 * pagination 分页\ [,pædʒɪ'neɪʃ\(ə\)n]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagination<T extends Serializable> implements Serializable {
    private List<T> list;
    private String statement;
    private int pageSize = Constant.PAGE_SIZE;
    private int totalRows;
    private int totalPages;
    private int currentPage;
}

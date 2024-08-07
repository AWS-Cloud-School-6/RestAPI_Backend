package AWS6.APITest.api.dto.response;

import lombok.Getter;

import java.util.List;

@Getter
public class ListResult<T> extends CommonResult {
    private List<T> list;

    public ListResult(List<T> list) {
        this.list = list;
    }
}
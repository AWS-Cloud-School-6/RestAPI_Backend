package AWS6.APITest.api.dto.response;

import lombok.Getter;

@Getter
public class SingleResult<T> extends CommonResult {
    private T data;

    public SingleResult(T data) {
        this.data = data;
    }
}
package AWS6.APITest.api.dto.response;

import lombok.Data;

@Data
public class CommonResult {
    private boolean success;
    private int code;
    private String msg;

}

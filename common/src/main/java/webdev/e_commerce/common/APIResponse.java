package webdev.e_commerce.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class APIResponse {


    public String status;

    public Object result;

    public int code;

    public String message;

    public List<String> errors;

}

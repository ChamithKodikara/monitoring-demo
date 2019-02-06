package com.helixz.monitoring.demo.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Chamith
 */
@Data
public class CustomerCreateRequest {

    @NotNull(message = "customer name empty")
    private String name;

    @NotNull(message = "customer email empty")
    private String email;

    private String address;

}

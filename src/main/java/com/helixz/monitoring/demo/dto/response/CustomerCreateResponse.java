package com.helixz.monitoring.demo.dto.response;

import lombok.Data;

/**
 * @author Chamith
 */
@Data
public class CustomerCreateResponse {

    private Long id;

    private String name;

    private String email;

    private String address;
}

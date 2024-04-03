package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author victorljli
 * @date 2023/08/29
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) { }

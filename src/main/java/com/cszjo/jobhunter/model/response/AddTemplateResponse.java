package com.cszjo.jobhunter.model.response;

import com.cszjo.jobhunter.serializer.BaseResponseSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Han on 2017/4/5.
 */
@Component(value = "addTemplateResponse")
@Scope("prototype")
@JsonSerialize(using = BaseResponseSerializer.class)
public class AddTemplateResponse extends BaseResponse {
}

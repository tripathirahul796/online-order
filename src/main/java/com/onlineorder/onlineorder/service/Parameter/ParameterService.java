package com.onlineorder.onlineorder.service.Parameter;

import java.util.List;

import com.onlineorder.onlineorder.entity.Parameter;

public interface ParameterService {
    List<Parameter> getParameter(Long parentId);
    String addParameter(Parameter param);
    String updateParameter(Long parentId);
    String deleteParameter(Long parentId);
 
}

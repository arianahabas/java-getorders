package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agent;

import java.util.List;

public interface AgentService {

  Agent save(Agent agent);

  Agent findAgentById(long id);

}

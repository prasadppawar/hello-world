package com.developer.model;

import java.util.List;

/**
 * A Graph can have multiple Nodes linked by Edges.
 * Each Edge has an associated weight. 
 *
 */
public class Graph {
	
  private final List<Node> nodes;
  private final List<Edge> edges;

  public Graph(List<Node> nodes, List<Edge> edges) {
    this.nodes = nodes;
    this.edges = edges;
  }

  public List<Node> getNodes() {
    return nodes;
  }

  public List<Edge> getEdges() {
    return edges;
  }
  
  
  
}
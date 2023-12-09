/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.apache.hugegraph.structure.traverser;

import java.util.Map;
import java.util.Set;

import org.apache.hugegraph.structure.graph.Edge;
import org.apache.hugegraph.structure.graph.Vertex;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeightedPaths {

    @JsonProperty
    private Map<Object, WeightedPath.Path> paths;
    @JsonProperty
    private Set<Vertex> vertices;
    @JsonProperty
    private Set<Edge> edges;
    @JsonProperty
    private Map<String, Object> measure;

    public Map<Object, WeightedPath.Path> paths() {
        return this.paths;
    }

    public Set<Vertex> vertices() {
        return this.vertices;
    }

    public Set<Edge> edges() {
        return this.edges;
    }

    public Map<String, Object> measure() {
        return this.measure;
    }
}

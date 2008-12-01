package org.apache.maven.archiva.scheduled.tasks;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * DataRefreshTask - task for discovering changes in the repository 
 * and updating all associated data. 
 *
 * @version $Id: DataRefreshTask.java 525176 2007-04-03 15:21:33Z joakime $
 */
public class DatabaseTask
    implements ArchivaTask
{
   
    String name;
    
    String queuePolicy;

    long maxExecutionTime;

    public long getMaxExecutionTime()
    {
        return maxExecutionTime;
    }

    public void setMaxExecutionTime( long maxExecutionTime )
    {
        this.maxExecutionTime = maxExecutionTime;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getQueuePolicy()
    {
        return queuePolicy;
    }

    public void setQueuePolicy( String queuePolicy )
    {
        this.queuePolicy = queuePolicy;
    }
}

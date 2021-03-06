/*
 * Copyright (c) 2017 SnappyData, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package org.apache.zeppelin.interpreter;


public class ParagraphState {
  boolean executeApproxQuery;
  long timeRequiredForApproxQuery;
  long timeRequiredForBaseQuery;

  boolean isCancelCalled = false;
  public boolean isCancelCalled() {
    return isCancelCalled;
  }

  public void setIsCancelCalled(boolean isCancelCalled) {
    this.isCancelCalled = isCancelCalled;
  }


  public boolean isExecuteApproxQuery() {
    return executeApproxQuery;
  }

  public void setExecuteApproxQuery(boolean executeApproxQuery) {
    this.executeApproxQuery = executeApproxQuery;
  }

  public long getTimeRequiredForApproxQuery() {
    return timeRequiredForApproxQuery;
  }

  public void setTimeRequiredForApproxQuery(long timeRequiredForApproxQuery) {
    this.timeRequiredForApproxQuery = timeRequiredForApproxQuery;
  }

  public long getTimeRequiredForBaseQuery() {
    return timeRequiredForBaseQuery;
  }

  public void setTimeRequiredForBaseQuery(long timeRequiredForBaseQuery) {
    this.timeRequiredForBaseQuery = timeRequiredForBaseQuery;
  }



}

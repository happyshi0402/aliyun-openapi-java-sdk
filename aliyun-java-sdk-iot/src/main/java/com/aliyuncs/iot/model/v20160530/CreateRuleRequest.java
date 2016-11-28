/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.model.v20160530;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateRuleRequest extends RpcAcsRequest<CreateRuleResponse> {
	
	public CreateRuleRequest() {
		super("Iot", "2016-05-30", "CreateRule");
	}

	private String select;

	private String shortTopic;

	private String where;

	private Long productKey;

	private String name;

	private String ruleDesc;

	public String getSelect() {
		return this.select;
	}

	public void setSelect(String select) {
		this.select = select;
		putQueryParameter("Select", select);
	}

	public String getShortTopic() {
		return this.shortTopic;
	}

	public void setShortTopic(String shortTopic) {
		this.shortTopic = shortTopic;
		putQueryParameter("ShortTopic", shortTopic);
	}

	public String getWhere() {
		return this.where;
	}

	public void setWhere(String where) {
		this.where = where;
		putQueryParameter("Where", where);
	}

	public Long getProductKey() {
		return this.productKey;
	}

	public void setProductKey(Long productKey) {
		this.productKey = productKey;
		putQueryParameter("ProductKey", productKey);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
		putQueryParameter("RuleDesc", ruleDesc);
	}

	@Override
	public Class<CreateRuleResponse> getResponseClass() {
		return CreateRuleResponse.class;
	}

}
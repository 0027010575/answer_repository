/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qiang.test.restfull.tomcat.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.qiang.test.restfull.tomcat.model.Child;

@RestController
@RequestMapping(value = "find")
public class SampleController {


    @RequestMapping(value = "/children/{id}", method = RequestMethod.GET)
	public Child helloWorld(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<JSONObject> res = restTemplate.postForEntity(fullstackIp, jsonObject, JSONObject.class);
		return new Child(id, "lilei", 5, "");
	}
}

package com.shanshui.smartcommunity.polling.client

import org.springframework.cloud.netflix.feign.FeignClient

/**
 * Created by I336253 on 12/27/2017.
 */
@FeignClient("polling")
public interface PollingClient {
//    @RequestMapping(value = 'order/{id}', method = RequestMethod.GET)
//    @ResponseBody
//    def getOrder(@PathVariable('id') Long id)
//
//    @RequestMapping(value = 'order', method = RequestMethod.POST)
//    @ResponseBody
//    def createOrder(@RequestBody Order order)
//
//    @RequestMapping(value = 'order/{id}/assignee/{uid}', method = RequestMethod.PUT)
//    @ResponseBody
//    def assignOrder(@PathVariable('id') Long id, @PathVariable('id') Long uid)
}
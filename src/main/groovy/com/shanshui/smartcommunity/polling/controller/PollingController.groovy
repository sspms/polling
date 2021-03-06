package com.shanshui.smartcommunity.polling.controller

import com.shanshui.smartcommunity.polling.client.PollingClient
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cache.annotation.EnableCaching
import org.springframework.web.bind.annotation.*

/**
 * Created by I336253 on 11/19/2017.
 */
@RestController
@RequestMapping('/api/v1/polling')
@EnableAutoConfiguration
@EnableCaching
class PollingController implements PollingClient {

//    @Autowired
//    PollingService propertyService
//
//    @RequestMapping(value = 'order/{id}', method = RequestMethod.GET)
//    @ResponseBody
//    def getOrder(@PathVariable('id') Long id) {
//        id ? propertyService.orderRepository.findOne(id) : null
//    }
//
//    @RequestMapping(value = 'order', method = RequestMethod.POST)
//    @ResponseBody
//    def createOrder(@RequestBody Order order) {
//        propertyService.orderRepository.save(order)
//    }
//
//    @RequestMapping(value = 'order/{id}/assignee/{uid}', method = RequestMethod.PUT)
//    @ResponseBody
//    def assignOrder(@PathVariable('id') Long id, @PathVariable('id') Long uid) {
//        id && uid ? propertyService.assignOrder(id, uid) : null
//    }

    public static void main(String[] args) {
        SpringApplication.run PollingController.class, args
    }
}

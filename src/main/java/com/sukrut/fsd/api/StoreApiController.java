package com.sukrut.fsd.api;

import com.sukrut.fsd.model.Store;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

@Controller
public class StoreApiController implements StoreApi {

    private static final Logger log = LoggerFactory.getLogger(StoreApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StoreApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addstore(@ApiParam(value = "Vendor will able to add stores depending upon the location" ,required=true )  @Valid @RequestBody Store body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Store>> getStoreDetailsByStoreId(@ApiParam(value = "id to search for store",required=true) @PathVariable("storeId") String storeId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Store>>(objectMapper.readValue("[ {  \"managerContact\" : \"managerContact\",  \"address\" : \"address\",  \"updatedBy\" : \"updatedBy\",  \"storeSeq\" : \"storeSeq\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"storeId\" : \"storeId\",  \"managerName\" : \"managerName\",  \"storePincode\" : \"storePincode\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"geoLocation\" : \"geoLocation\",  \"createdBy\" : \"createdBy\",  \"deletionMark\" : true,  \"storeLandline\" : \"storeLandline\",  \"storeName\" : \"storeName\",  \"storeArea\" : \"storeArea\"}, {  \"managerContact\" : \"managerContact\",  \"address\" : \"address\",  \"updatedBy\" : \"updatedBy\",  \"storeSeq\" : \"storeSeq\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"storeId\" : \"storeId\",  \"managerName\" : \"managerName\",  \"storePincode\" : \"storePincode\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"geoLocation\" : \"geoLocation\",  \"createdBy\" : \"createdBy\",  \"deletionMark\" : true,  \"storeLandline\" : \"storeLandline\",  \"storeName\" : \"storeName\",  \"storeArea\" : \"storeArea\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Store>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Store>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Store>> getStoreList() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Store>>(objectMapper.readValue("[ {  \"managerContact\" : \"managerContact\",  \"address\" : \"address\",  \"updatedBy\" : \"updatedBy\",  \"storeSeq\" : \"storeSeq\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"storeId\" : \"storeId\",  \"managerName\" : \"managerName\",  \"storePincode\" : \"storePincode\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"geoLocation\" : \"geoLocation\",  \"createdBy\" : \"createdBy\",  \"deletionMark\" : true,  \"storeLandline\" : \"storeLandline\",  \"storeName\" : \"storeName\",  \"storeArea\" : \"storeArea\"}, {  \"managerContact\" : \"managerContact\",  \"address\" : \"address\",  \"updatedBy\" : \"updatedBy\",  \"storeSeq\" : \"storeSeq\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"storeId\" : \"storeId\",  \"managerName\" : \"managerName\",  \"storePincode\" : \"storePincode\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"geoLocation\" : \"geoLocation\",  \"createdBy\" : \"createdBy\",  \"deletionMark\" : true,  \"storeLandline\" : \"storeLandline\",  \"storeName\" : \"storeName\",  \"storeArea\" : \"storeArea\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Store>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Store>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStore(@ApiParam(value = "Vendor will able to add stores depenpending upon the location" ,required=true )  @Valid @RequestBody Store body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

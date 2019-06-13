package com.sukrut.fsd.api;

import com.sukrut.fsd.model.Vendor;
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
public class VendorApiController implements VendorApi {

    private static final Logger log = LoggerFactory.getLogger(VendorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public VendorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> acceptVendor(@ApiParam(value = "Approved vendor is being sent" ,required=true )  @Valid @RequestBody Vendor body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteVendor(@ApiParam(value = "Vendor id to delete",required=true) @PathVariable("vendorId") String vendorId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Vendor> getVendor(@ApiParam(value = "id to search for vendor",required=true) @PathVariable("vendorId") String vendorId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Vendor>(objectMapper.readValue("{  \"vendorTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"login_id\" : \"login_id\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedBy\" : \"updatedBy\",  \"createdBy\" : \"createdBy\",  \"vendorComments\" : \"vendorComments\",  \"vendorStatus\" : \"vendorStatus\",  \"vendorId\" : \"vendorId\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"vendorName\" : \"vendorName\",  \"is_delete\" : true}", Vendor.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Vendor>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Vendor>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Vendor>> getVendorDetails(@NotNull @ApiParam(value = "ID of vendor to return", required = true) @Valid @RequestParam(value = "vendorKey", required = true) String vendorKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Vendor>>(objectMapper.readValue("[ {  \"vendorTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"login_id\" : \"login_id\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedBy\" : \"updatedBy\",  \"createdBy\" : \"createdBy\",  \"vendorComments\" : \"vendorComments\",  \"vendorStatus\" : \"vendorStatus\",  \"vendorId\" : \"vendorId\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"vendorName\" : \"vendorName\",  \"is_delete\" : true}, {  \"vendorTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"login_id\" : \"login_id\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedBy\" : \"updatedBy\",  \"createdBy\" : \"createdBy\",  \"vendorComments\" : \"vendorComments\",  \"vendorStatus\" : \"vendorStatus\",  \"vendorId\" : \"vendorId\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"vendorName\" : \"vendorName\",  \"is_delete\" : true} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Vendor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Vendor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Vendor>> getvendorList() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Vendor>>(objectMapper.readValue("[ {  \"vendorTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"login_id\" : \"login_id\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedBy\" : \"updatedBy\",  \"createdBy\" : \"createdBy\",  \"vendorComments\" : \"vendorComments\",  \"vendorStatus\" : \"vendorStatus\",  \"vendorId\" : \"vendorId\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"vendorName\" : \"vendorName\",  \"is_delete\" : true}, {  \"vendorTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"login_id\" : \"login_id\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedBy\" : \"updatedBy\",  \"createdBy\" : \"createdBy\",  \"vendorComments\" : \"vendorComments\",  \"vendorStatus\" : \"vendorStatus\",  \"vendorId\" : \"vendorId\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"vendorName\" : \"vendorName\",  \"is_delete\" : true} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Vendor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Vendor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rejectVendor(@ApiParam(value = "Rejected vendor is being sent" ,required=true )  @Valid @RequestBody Vendor body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

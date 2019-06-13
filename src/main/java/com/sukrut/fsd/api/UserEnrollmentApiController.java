package com.sukrut.fsd.api;

import com.sukrut.fsd.model.VendorsList;
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
public class UserEnrollmentApiController implements UserEnrollmentApi {

    private static final Logger log = LoggerFactory.getLogger(UserEnrollmentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserEnrollmentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<VendorsList>> getUserDetails(@NotNull @ApiParam(value = "details on UserID to return", required = true) @Valid @RequestParam(value = "UserID", required = true) String userID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<VendorsList>>(objectMapper.readValue("[ {  \"vendorLocationLatitude\" : \"vendorLocationLatitude\",  \"userLocation\" : \"userLocation\",  \"userMobileNumber\" : 0.8008281904610115,  \"vendorLocationLongitude\" : \"vendorLocationLongitude\",  \"userId\" : \"userId\",  \"vendorAddress\" : \"vendorAddress\",  \"vendorStoreName\" : \"vendorStoreName\",  \"vendorLocation\" : \"vendorLocation\"}, {  \"vendorLocationLatitude\" : \"vendorLocationLatitude\",  \"userLocation\" : \"userLocation\",  \"userMobileNumber\" : 0.8008281904610115,  \"vendorLocationLongitude\" : \"vendorLocationLongitude\",  \"userId\" : \"userId\",  \"vendorAddress\" : \"vendorAddress\",  \"vendorStoreName\" : \"vendorStoreName\",  \"vendorLocation\" : \"vendorLocation\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<VendorsList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<VendorsList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<VendorsList>> getVendorList(@NotNull @ApiParam(value = "ID of vendors to return", required = true) @Valid @RequestParam(value = "latitude", required = true) String latitude,@NotNull @ApiParam(value = "ID of vendors to return", required = true) @Valid @RequestParam(value = "longitude", required = true) String longitude) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<VendorsList>>(objectMapper.readValue("[ {  \"vendorLocationLatitude\" : \"vendorLocationLatitude\",  \"userLocation\" : \"userLocation\",  \"userMobileNumber\" : 0.8008281904610115,  \"vendorLocationLongitude\" : \"vendorLocationLongitude\",  \"userId\" : \"userId\",  \"vendorAddress\" : \"vendorAddress\",  \"vendorStoreName\" : \"vendorStoreName\",  \"vendorLocation\" : \"vendorLocation\"}, {  \"vendorLocationLatitude\" : \"vendorLocationLatitude\",  \"userLocation\" : \"userLocation\",  \"userMobileNumber\" : 0.8008281904610115,  \"vendorLocationLongitude\" : \"vendorLocationLongitude\",  \"userId\" : \"userId\",  \"vendorAddress\" : \"vendorAddress\",  \"vendorStoreName\" : \"vendorStoreName\",  \"vendorLocation\" : \"vendorLocation\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<VendorsList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<VendorsList>>(HttpStatus.NOT_IMPLEMENTED);
    }

}

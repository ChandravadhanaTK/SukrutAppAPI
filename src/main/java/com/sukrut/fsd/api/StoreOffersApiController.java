package com.sukrut.fsd.api;

import com.sukrut.fsd.model.Offers;
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
public class StoreOffersApiController implements StoreOffersApi {

    private static final Logger log = LoggerFactory.getLogger(StoreOffersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StoreOffersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Offers>> getofferByproductName(@ApiParam(value = "offers should be displayed" ,required=true )  @Valid @RequestBody Offers body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Offers>>(objectMapper.readValue("[ {  \"offerDesc\" : \"offerDesc\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedBy\" : \"updatedBy\",  \"offerPercentage\" : 0.80082819046101150206595775671303272247314453125,  \"createdBy\" : \"createdBy\",  \"deletionMark\" : true,  \"offerId\" : \"offerId\",  \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"productName\" : \"productName\",  \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"}, {  \"offerDesc\" : \"offerDesc\",  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedBy\" : \"updatedBy\",  \"offerPercentage\" : 0.80082819046101150206595775671303272247314453125,  \"createdBy\" : \"createdBy\",  \"deletionMark\" : true,  \"offerId\" : \"offerId\",  \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",  \"updatedDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"productName\" : \"productName\",  \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Offers>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Offers>>(HttpStatus.NOT_IMPLEMENTED);
    }

}

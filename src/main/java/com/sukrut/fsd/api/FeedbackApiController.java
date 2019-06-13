package com.sukrut.fsd.api;

import com.sukrut.fsd.model.Feedback;
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
public class FeedbackApiController implements FeedbackApi {

    private static final Logger log = LoggerFactory.getLogger(FeedbackApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FeedbackApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addOffers(@ApiParam(value = "Refer & Earn only for the contacts" ,required=true )  @Valid @RequestBody Feedback body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Feedback>> getComments() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Feedback>>(objectMapper.readValue("[ {  \"createdBy\" : \"createdBy\",  \"commentId\" : 0.80082819046101150206595775671303272247314453125,  \"commentDescription\" : \"commentDescription\"}, {  \"createdBy\" : \"createdBy\",  \"commentId\" : 0.80082819046101150206595775671303272247314453125,  \"commentDescription\" : \"commentDescription\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Feedback>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Feedback>>(HttpStatus.NOT_IMPLEMENTED);
    }

}

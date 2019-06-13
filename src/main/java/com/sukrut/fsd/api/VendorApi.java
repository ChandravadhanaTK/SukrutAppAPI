/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.sukrut.fsd.api;

import com.sukrut.fsd.model.Vendor;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

@Api(value = "vendor", description = "the vendor API")
public interface VendorApi {

    @ApiOperation(value = "Accepts the vendor", nickname = "acceptVendor", notes = "Sends the approved response", tags={ "vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Vendor not found"),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/vendor/accept",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> acceptVendor(@ApiParam(value = "Approved vendor is being sent" ,required=true )  @Valid @RequestBody Vendor body);


    @ApiOperation(value = "Deletes a vendor", nickname = "deleteVendor", notes = "Deltes the vendor", tags={ "vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Vendor not found") })
    @RequestMapping(value = "/vendor/delete/{vendorId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteVendor(@ApiParam(value = "Vendor id to delete",required=true) @PathVariable("vendorId") String vendorId);


    @ApiOperation(value = "get vendor by id", nickname = "getVendor", notes = "Returns the particular vendor", response = Vendor.class, tags={ "vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Vendor.class) })
    @RequestMapping(value = "/vendor/{vendorId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Vendor> getVendor(@ApiParam(value = "id to search for vendor",required=true) @PathVariable("vendorId") String vendorId);


    @ApiOperation(value = "finds the vendor details.", nickname = "getVendorDetails", notes = "retrieves all the vendor details including the documents they submitted.", response = Vendor.class, responseContainer = "List", tags={ "vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Vendor.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Vendor not found") })
    @RequestMapping(value = "/vendor/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Vendor>> getVendorDetails(@NotNull @ApiParam(value = "ID of vendor to return", required = true) @Valid @RequestParam(value = "vendorKey", required = true) String vendorKey);


    @ApiOperation(value = "Get vendor list", nickname = "getvendorList", notes = "Returns the list of all vendors", response = Vendor.class, responseContainer = "List", tags={ "vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Vendor.class, responseContainer = "List") })
    @RequestMapping(value = "/vendor/vendorlist",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Vendor>> getvendorList();


    @ApiOperation(value = "Rejects the vendor", nickname = "rejectVendor", notes = "Sends the rejected response", tags={ "vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Vendor not found"),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/vendor/reject",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> rejectVendor(@ApiParam(value = "Rejected vendor is being sent" ,required=true )  @Valid @RequestBody Vendor body);

}

package io.swagger.api;

import io.swagger.model.MeterReading;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-03T16:56:55.966Z")

@Controller
public class MeterApiController implements MeterApi {

    private static final Logger log = LoggerFactory.getLogger(MeterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MeterApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createMeterReading(@ApiParam(value = "Unique ID of the Meter",required=true) @PathVariable("meterID") String meterID,@ApiParam(value = "Profile Id",required=true) @PathVariable("profile") String profile,@ApiParam(value = "Month of the Year",required=true, allowableValues = "JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC") @PathVariable("month") String month,@NotNull @ApiParam(value = "The MeterReading for the given meterID, profile and month", required = true) @Valid @RequestParam(value = "meterReading", required = true) Float meterReading) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteMeterReading(@ApiParam(value = "Unique ID of the Meter",required=true) @PathVariable("meterID") String meterID,@ApiParam(value = "Profile Id",required=true) @PathVariable("profile") String profile,@ApiParam(value = "Month of the Year",required=true, allowableValues = "JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC") @PathVariable("month") String month) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MeterReading> getMeterReading(@ApiParam(value = "Unique ID of the Meter",required=true) @PathVariable("meterID") String meterID,@ApiParam(value = "Profile Id",required=true) @PathVariable("profile") String profile,@ApiParam(value = "Month of the Year",required=true, allowableValues = "JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC") @PathVariable("month") String month) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MeterReading>(objectMapper.readValue("{  \"month\" : \"month\",  \"meterID\" : \"meterID\",  \"profile\" : \"profile\",  \"value\" : 0.8008282}", MeterReading.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MeterReading>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MeterReading>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MeterReading> updateMeterReading(@ApiParam(value = "Unique ID of the Meter",required=true) @PathVariable("meterID") String meterID,@ApiParam(value = "Profile Id",required=true) @PathVariable("profile") String profile,@ApiParam(value = "Month of the Year",required=true, allowableValues = "JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC") @PathVariable("month") String month,@NotNull @ApiParam(value = "The MeterReading for the given meterID, profile and month", required = true) @Valid @RequestParam(value = "meterReading", required = true) Float meterReading) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MeterReading>(objectMapper.readValue("{  \"month\" : \"month\",  \"meterID\" : \"meterID\",  \"profile\" : \"profile\",  \"value\" : 0.8008282}", MeterReading.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MeterReading>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MeterReading>(HttpStatus.NOT_IMPLEMENTED);
    }

}

package io.swagger.api;

import io.swagger.model.Fraction;
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
public class FractionApiController implements FractionApi {

    private static final Logger log = LoggerFactory.getLogger(FractionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FractionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Fraction> createFraction(@ApiParam(value = "Profile Id",required=true) @PathVariable("profile") String profile,@ApiParam(value = "Month of the Year",required=true, allowableValues = "JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC") @PathVariable("month") String month,@NotNull @ApiParam(value = "Distribution of the Consumption among months in a year. Maximum possible value is 1.", required = true) @Valid @RequestParam(value = "fraction", required = true) Float fraction) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Fraction>(objectMapper.readValue("{  \"month\" : \"month\",  \"profile\" : \"profile\",  \"value\" : 0.8008282}", Fraction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Fraction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Fraction>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteFraction(@ApiParam(value = "Profile Id",required=true) @PathVariable("profile") String profile,@ApiParam(value = "Month of the Year",required=true, allowableValues = "JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC") @PathVariable("month") String month) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Fraction> getFraction(@ApiParam(value = "Profile Id",required=true) @PathVariable("profile") String profile,@ApiParam(value = "Month of the Year",required=true, allowableValues = "JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC") @PathVariable("month") String month) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Fraction>(objectMapper.readValue("{  \"month\" : \"month\",  \"profile\" : \"profile\",  \"value\" : 0.8008282}", Fraction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Fraction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Fraction>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Fraction> updateFraction(@ApiParam(value = "Profile Id",required=true) @PathVariable("profile") String profile,@ApiParam(value = "Month of the Year",required=true, allowableValues = "JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC") @PathVariable("month") String month,@NotNull @ApiParam(value = "Distribution of the Consumption among months in a year. Maximum possible value is 1.", required = true) @Valid @RequestParam(value = "fraction", required = true) Float fraction) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Fraction>(objectMapper.readValue("{  \"month\" : \"month\",  \"profile\" : \"profile\",  \"value\" : 0.8008282}", Fraction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Fraction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Fraction>(HttpStatus.NOT_IMPLEMENTED);
    }

}

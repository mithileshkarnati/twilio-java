/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.resource.api.v2010.account.incomingphonenumber;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.rest.Twilio;
import com.twilio.rest.converter.DateConverter;
import com.twilio.rest.converter.Promoter;
import com.twilio.rest.exception.TwilioException;
import com.twilio.rest.http.HttpMethod;
import com.twilio.rest.http.Request;
import com.twilio.rest.http.Response;
import com.twilio.rest.http.TwilioRestClient;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class LocalTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          TwilioRestClient.Domains.API,
                                          "/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/Local.json",
                                          "AC123");
            
            request.addQueryParam("PageSize", "50");
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};
        
        try {
            Local.read("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").execute();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/Local.json?PageSize=1&Page=0\",\"incoming_phone_numbers\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address_requirements\": \"none\",\"api_version\": \"2010-04-01\",\"beta\": null,\"capabilities\": {\"mms\": true,\"sms\": false,\"voice\": true},\"date_created\": \"Thu, 30 Jul 2015 23:19:04 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 23:19:04 +0000\",\"friendly_name\": \"(808) 925-5327\",\"phone_number\": \"+18089255327\",\"sid\": \"PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sms_application_sid\": \"\",\"sms_fallback_method\": \"POST\",\"sms_fallback_url\": \"\",\"sms_method\": \"POST\",\"sms_url\": \"\",\"status_callback\": \"\",\"status_callback_method\": \"POST\",\"trunk_sid\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"voice_application_sid\": \"\",\"voice_caller_id_lookup\": false,\"voice_fallback_method\": \"POST\",\"voice_fallback_url\": null,\"voice_method\": \"POST\",\"voice_url\": null}],\"last_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/Local.json?PageSize=1&Page=2\",\"next_page_uri\": null,\"num_pages\": 3,\"page\": 0,\"page_size\": 1,\"previous_page_uri\": null,\"start\": 0,\"total\": 3,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/Local.json?PageSize=1\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};
        
        assertNotNull(Local.read("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").execute());
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/Local.json?PageSize=1&Page=0\",\"incoming_phone_numbers\": [],\"last_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/Local.json?PageSize=1&Page=2\",\"next_page_uri\": null,\"num_pages\": 3,\"page\": 0,\"page_size\": 1,\"previous_page_uri\": null,\"start\": 0,\"total\": 3,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/Local.json?PageSize=1\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};
        
        assertNotNull(Local.read("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").execute());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          TwilioRestClient.Domains.API,
                                          "/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/Local.json",
                                          "AC123");
            request.addPostParam("PhoneNumber", serialize(new com.twilio.rest.type.PhoneNumber("+987654321")));
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};
        
        try {
            Local.create("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", new com.twilio.rest.type.PhoneNumber("+987654321")).execute();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address_requirements\": \"none\",\"api_version\": \"2010-04-01\",\"beta\": false,\"capabilities\": {\"mms\": true,\"sms\": false,\"voice\": true},\"date_created\": \"Thu, 30 Jul 2015 23:19:04 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 23:19:04 +0000\",\"friendly_name\": \"(808) 925-5327\",\"phone_number\": \"+18089255327\",\"sid\": \"PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sms_application_sid\": \"\",\"sms_fallback_method\": \"POST\",\"sms_fallback_url\": \"\",\"sms_method\": \"POST\",\"sms_url\": \"\",\"status_callback\": \"\",\"status_callback_method\": \"POST\",\"trunk_sid\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/IncomingPhoneNumbers/PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"voice_application_sid\": \"\",\"voice_caller_id_lookup\": false,\"voice_fallback_method\": \"POST\",\"voice_fallback_url\": null,\"voice_method\": \"POST\",\"voice_url\": null}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};
        
        Local.create("ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", new com.twilio.rest.type.PhoneNumber("+987654321")).execute();
    }
}
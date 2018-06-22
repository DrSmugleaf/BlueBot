/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.drsmugleaf.eve.esi.api;

import com.github.drsmugleaf.eve.esi.ApiException;
import com.github.drsmugleaf.eve.esi.model.BadGateway;
import com.github.drsmugleaf.eve.esi.model.BadRequest;
import com.github.drsmugleaf.eve.esi.model.Forbidden;
import com.github.drsmugleaf.eve.esi.model.GetAlliancesAllianceIdContacts200Ok;
import com.github.drsmugleaf.eve.esi.model.GetAlliancesAllianceIdContactsLabels200Ok;
import com.github.drsmugleaf.eve.esi.model.GetCharactersCharacterIdContacts200Ok;
import com.github.drsmugleaf.eve.esi.model.GetCharactersCharacterIdContactsLabels200Ok;
import com.github.drsmugleaf.eve.esi.model.GetCorporationsCorporationIdContacts200Ok;
import com.github.drsmugleaf.eve.esi.model.GetCorporationsCorporationIdContactsLabels200Ok;
import com.github.drsmugleaf.eve.esi.model.InternalServerError;
import com.github.drsmugleaf.eve.esi.model.ServiceUnavailable;
import com.github.drsmugleaf.eve.esi.model.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Ignore
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Delete contacts
     *
     * Bulk delete contacts  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.deleteCharactersCharacterIdContacts(characterId, contactIds, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get alliance contacts
     *
     * Return contacts of an alliance  --- Alternate route: &#x60;/legacy/alliances/{alliance_id}/contacts/&#x60;  Alternate route: &#x60;/v1/alliances/{alliance_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds  --- [This route has an available update](https://esi.evetech.net/diff/latest/dev/#GET-/alliances/{alliance_id}/contacts/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdContactsTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetAlliancesAllianceIdContacts200Ok> response = api.getAlliancesAllianceIdContacts(allianceId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get alliance contact labels
     *
     * Return custom labels for an alliance&#39;s contacts  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/alliances/{alliance_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/alliances/{alliance_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdContactsLabelsTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetAlliancesAllianceIdContactsLabels200Ok> response = api.getAlliancesAllianceIdContactsLabels(allianceId, datasource, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get contacts
     *
     * Return contacts of a character  --- Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds  --- [This route has an available update](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/contacts/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdContacts200Ok> response = api.getCharactersCharacterIdContacts(characterId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get contact labels
     *
     * Return custom labels for a character&#39;s contacts  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContactsLabelsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdContactsLabels200Ok> response = api.getCharactersCharacterIdContactsLabels(characterId, datasource, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation contacts
     *
     * Return contacts of a corporation  --- Alternate route: &#x60;/legacy/corporations/{corporation_id}/contacts/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds  --- [This route has an available update](https://esi.evetech.net/diff/latest/dev/#GET-/corporations/{corporation_id}/contacts/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdContactsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdContacts200Ok> response = api.getCorporationsCorporationIdContacts(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation contact labels
     *
     * Return custom labels for a corporation&#39;s contacts  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdContactsLabelsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdContactsLabels200Ok> response = api.getCorporationsCorporationIdContactsLabels(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Add contacts
     *
     * Bulk add contacts with same settings  --- Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;   --- [This route has an available update](https://esi.evetech.net/diff/latest/dev/#POST-/characters/{character_id}/contacts/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        Float standing = null;
        String datasource = null;
        Long labelId = null;
        String token = null;
        String userAgent = null;
        Boolean watched = null;
        String xUserAgent = null;
        List<Integer> response = api.postCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Edit contacts
     *
     * Bulk edit contacts with same settings  --- Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;   --- [This route has an available update](https://esi.evetech.net/diff/latest/dev/#PUT-/characters/{character_id}/contacts/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        Float standing = null;
        String datasource = null;
        Long labelId = null;
        String token = null;
        String userAgent = null;
        Boolean watched = null;
        String xUserAgent = null;
        api.putCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent);

        // TODO: test validations
    }
    
}
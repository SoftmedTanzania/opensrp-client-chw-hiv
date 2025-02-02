package org.smartregister.chw.hiv.domain

import org.smartregister.chw.hiv.util.DBConstants
import org.smartregister.commonregistry.CommonPersonObjectClient
import java.io.Serializable
import java.util.*


/**
 * This class wraps [client] into a new entity class used to pass data between activities,
 * it implements [Serializable]
 */
data class HivMemberObject(val client: CommonPersonObjectClient?) : Serializable {

    var firstName: String? = client?.columnmaps?.get(DBConstants.Key.FIRST_NAME) ?: ""
    var middleName: String? = client?.columnmaps?.get(DBConstants.Key.MIDDLE_NAME) ?: ""
    var lastName: String? = client?.columnmaps?.get(DBConstants.Key.LAST_NAME) ?: ""
    var address: String? = client?.columnmaps?.get(DBConstants.Key.VILLAGE_TOWN) ?: ""
    var gender: String? = client?.columnmaps?.get(DBConstants.Key.GENDER) ?: ""
    var uniqueId: String? = client?.columnmaps?.get(DBConstants.Key.UNIQUE_ID)
    var age: String? = client?.columnmaps?.get(DBConstants.Key.DOB) ?: ""
    var relationalid: String? = client?.columnmaps?.get(DBConstants.Key.RELATIONAL_ID)
    var baseEntityId: String? = client?.columnmaps?.get(DBConstants.Key.BASE_ENTITY_ID)
    var relationalId: String? = client?.columnmaps?.get(DBConstants.Key.RELATIONAL_ID)
    var primaryCareGiver: String? = client?.columnmaps?.get(DBConstants.Key.PRIMARY_CARE_GIVER)
    var primaryCareGiverPhoneNumber: String? = client?.columnmaps?.get(DBConstants.Key.PRIMARY_CARE_GIVER_PHONE_NUMBER)
    var familyHead: String? = client?.columnmaps?.get(DBConstants.Key.FAMILY_HEAD)
    var familyBaseEntityId: String? = client?.columnmaps?.get(DBConstants.Key.RELATIONAL_ID)
    var familyName: String? = client?.columnmaps?.get(DBConstants.Key.FAMILY_NAME)
    var phoneNumber: String? = client?.columnmaps?.get(DBConstants.Key.PHONE_NUMBER)
    var familyHeadPhoneNumber: String? = client?.columnmaps?.get(DBConstants.Key.FAMILY_HEAD_PHONE_NUMBER)
    var otherPhoneNumber: String? = client?.columnmaps?.get(DBConstants.Key.OTHER_PHONE_NUMBER)
    var ctcNumber: String? = client?.columnmaps?.get(DBConstants.Key.CTC_NUMBER)
    var cbhsNumber: String? = client?.columnmaps?.get(DBConstants.Key.CBHS_NUMBER)
    var tbNumber: String? = client?.columnmaps?.get(DBConstants.Key.TB_NUMBER)
    var matNumber: String? = client?.columnmaps?.get(DBConstants.Key.MAT_NUMBER)
    var rchNumber: String? = client?.columnmaps?.get(DBConstants.Key.RCH_NUMBER)
    var clientHivStatusDuringRegistration: String? = client?.columnmaps?.get(DBConstants.Key.CLIENT_HIV_STATUS_DURING_REGISTRATION)
    var clientHivStatusAfterTesting: String? = client?.columnmaps?.get(DBConstants.Key.CLIENT_HIV_STATUS_AFTER_TESTING)
    var hivRegistrationDate: Date? = null
    var hivCommunityReferralDate: Date? = null
    var lastFacilityVisitDate: Date? = null
    var familyMemberEntityType: String? = client?.columnmaps?.get(DBConstants.Key.FAMILY_MEMBER_ENTITY_TYPE)
    var reasonsForIssuingCommunityFollowupReferral: String? = client?.columnmaps?.get(DBConstants.Key.REASONS_FOR_ISSUING_COMMUNITY_REFERRAL)
    var comment: String? = client?.columnmaps?.get(DBConstants.Key.COMMENTS)
    var clientFollowupStatus: String? = client?.columnmaps?.get(DBConstants.Key.CLIENT_FOLLOWUP_STATUS)
    var isClosed: Boolean? = client?.columnmaps?.get(DBConstants.Key.IS_CLOSED) == "1"
    var communityReferralFormId: String? = client?.columnmaps?.get(DBConstants.Key.COMMUNITY_REFERRAL_FORM_ID)
}
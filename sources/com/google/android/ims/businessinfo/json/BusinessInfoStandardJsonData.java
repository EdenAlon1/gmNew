package com.google.android.ims.businessinfo.json;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.ims.businessinfo.json.BusinessInfoJsonData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.ctvb;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.dkty;
import defpackage.evlh;
import defpackage.evlj;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoStandardJsonData extends BusinessInfoJsonData {
    private static final String COLOR_LABEL = "Colour";
    private static final String COLOR_MEDIA_CONTENT = "Other";
    private static final String LOGO_URL_LABEL = "Icon";
    private static final String LOGO_URL_MEDIA_CONTENT = "Logo";
    private static final String TEL_ENTRY_TEL_TYPE = "Work";
    private static final String URI_ENTRY_EMAIL_LABEL = "Email";
    private static final String URI_ENTRY_SERVICE_ID = "ServiceID";
    private static final String URI_ENTRY_SMS_LABEL = "SMS";
    private static final String URI_ENTRY_TYPE_X_GOOGLE_SHORT_CODE = "XGoogleShortCode";
    private static final String WEB_ENTRY_TERMS_AND_CONDITIONS_LABEL = "TCPage";
    private static final String WEB_ENTRY_WEBSITE_LABEL = "Website";

    @evlh
    @evlj(a = "org-description")
    String description;

    @evlh
    @evlj(a = "name")
    NameData nameData;
    static final diyy<Boolean> explicitlySetDefaultRbmColor = diyv.b("explicitly_set_default_rbm_color");
    public static final Pattern SIX_DIGIT_HEX_COLOR_PATTERN = Pattern.compile("^#([0-9A-Fa-f]{6})$");

    /* compiled from: PG */
    private static class NameData {

        @evlh
        @evlj(a = "name-entry")
        private NameEntryData nameEntryData;

        /* compiled from: PG */
        private static class NameEntryData {

            @evlh
            @evlj(a = "display-name")
            private String displayName;

            private NameEntryData() {
            }
        }

        private NameData() {
        }
    }

    private static void addTelephoneEntryProperty(BusinessInfoData.Builder builder, BusinessInfoJsonData.TelephoneData telephoneData, ctvb ctvbVar) {
        if (!Objects.equals(telephoneData.getTelephoneType(), TEL_ENTRY_TEL_TYPE)) {
            dkty.q("Cannot parse standard tel entry, invalid tel-type: %s", telephoneData);
            return;
        }
        String telephoneString = telephoneData.getTelephoneString();
        if (TextUtils.isEmpty(telephoneString)) {
            dkty.q("Cannot parse standard tel entry, missing tel number: %s", telephoneData);
        } else {
            builder.setPrimaryPhoneNumber(telephoneString, formatPhoneNumberForHeader(telephoneString, ctvbVar), telephoneData.getCustomLabel());
        }
    }

    private static void addUriEntryProperty(BusinessInfoData.Builder builder, BusinessInfoJsonData.UriEntryData uriEntryData) {
        String label = uriEntryData.getLabel();
        String uri = uriEntryData.getUri();
        String type = uriEntryData.getType();
        if (TextUtils.isEmpty(label) || TextUtils.isEmpty(uri)) {
            dkty.q("Cannot parse standard uri entry, missing properties: %s", uriEntryData);
            return;
        }
        if (Objects.equals(label, URI_ENTRY_EMAIL_LABEL)) {
            builder.setPrimaryEmailAddress(uri, uri.replaceFirst("mailto:", ""), uriEntryData.getCustomLabel());
            return;
        }
        if (Objects.equals(label, URI_ENTRY_SMS_LABEL)) {
            builder.setSmsNumber(uri, label, uriEntryData.getCustomLabel());
        } else if (Objects.equals(type, URI_ENTRY_TYPE_X_GOOGLE_SHORT_CODE)) {
            builder.setShortCode(removeSmsPrefix(uri), label, uriEntryData.getCustomLabel());
        } else {
            if (Objects.equals(label, URI_ENTRY_SERVICE_ID)) {
                return;
            }
            dkty.q("Cannot parse standard uri entry, unknown type: %s", uriEntryData);
        }
    }

    private static void addWebEntryProperty(BusinessInfoData.Builder builder, BusinessInfoJsonData.WebEntryData webEntryData) {
        String label = webEntryData.getLabel();
        String url = webEntryData.getUrl();
        if (TextUtils.isEmpty(label) || TextUtils.isEmpty(url)) {
            dkty.q("Cannot parse standard web entry, missing properties: %s", webEntryData);
            return;
        }
        if (label.equals(WEB_ENTRY_TERMS_AND_CONDITIONS_LABEL)) {
            String customLabel = webEntryData.getCustomLabel();
            if (customLabel != null) {
                label = customLabel;
            }
            builder.setTermsAndConditionsUrl(url, label, null);
            return;
        }
        if (label.equals(WEB_ENTRY_WEBSITE_LABEL)) {
            builder.setPrimaryWebsite(url, url.replaceFirst("^(https?://)", ""), webEntryData.getCustomLabel());
        } else {
            dkty.q("Cannot parse standard web entry, invalid type: %s", webEntryData);
        }
    }

    public static int getVerificationStatus(String str) {
        int verifiedBotPlatform = BusinessInfoData.getVerifiedBotPlatform(str);
        if (verifiedBotPlatform == 1 || verifiedBotPlatform == 2) {
            dkty.c("Marking business %s as verified from platform %s.", dkty.b(str), dkty.b(Integer.valueOf(verifiedBotPlatform)));
            return 2;
        }
        dkty.c("Marking business %s as unverified from platform %s.", dkty.b(str), dkty.b(Integer.valueOf(verifiedBotPlatform)));
        return 1;
    }

    public String getColor() {
        for (MediaEntryJsonData mediaEntryJsonData : getMediaEntries()) {
            if (Objects.equals(mediaEntryJsonData.getLabel(), COLOR_LABEL) && Objects.equals(mediaEntryJsonData.getMediaContent(), COLOR_MEDIA_CONTENT)) {
                String content = mediaEntryJsonData.getContent();
                return SIX_DIGIT_HEX_COLOR_PATTERN.matcher(content).matches() ? content : new String(Base64.decode(content, 0), StandardCharsets.UTF_8);
            }
        }
        return ((Boolean) explicitlySetDefaultRbmColor.a()).booleanValue() ? String.format("#%06X", 3622735) : "";
    }

    public String getDescription() {
        return this.description;
    }

    public String getLogoUrl() {
        for (MediaEntryJsonData mediaEntryJsonData : getMediaEntries()) {
            if (Objects.equals(mediaEntryJsonData.getLabel(), LOGO_URL_LABEL) && Objects.equals(mediaEntryJsonData.getMediaContent(), LOGO_URL_MEDIA_CONTENT)) {
                return mediaEntryJsonData.getUrl();
            }
        }
        return null;
    }

    public String getName() {
        NameData nameData = this.nameData;
        if (nameData == null || nameData.nameEntryData == null) {
            return null;
        }
        return this.nameData.nameEntryData.displayName;
    }

    public void parseJsonToBuilder(BusinessInfoData.Builder builder, String str, ctvb ctvbVar) {
        BusinessInfoData.Builder name = builder.setName(getName());
        name.setLogoImageRemoteUrl(getLogoUrl());
        name.setDescription(getDescription());
        name.setColor(getColor());
        name.setVerificationStatus(getVerificationStatus(str));
        Iterator<BusinessInfoJsonData.UriEntryData> it = getUriEntries().iterator();
        while (it.hasNext()) {
            addUriEntryProperty(builder, it.next());
        }
        BusinessInfoJsonData.TelephoneData telephoneData = getTelephoneData();
        if (telephoneData != null) {
            addTelephoneEntryProperty(builder, telephoneData, ctvbVar);
        }
        Iterator<BusinessInfoJsonData.WebEntryData> it2 = getWebEntries().iterator();
        while (it2.hasNext()) {
            addWebEntryProperty(builder, it2.next());
        }
    }
}

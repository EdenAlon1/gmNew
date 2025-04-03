package com.google.android.ims.businessinfo.json;

import com.google.android.ims.businessinfo.json.BusinessInfoJsonData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.ctvb;
import defpackage.dkty;
import defpackage.emxe;
import defpackage.evlh;
import defpackage.evlj;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoJson {
    private static final String SIP_URI = "SIP-URI";
    private static final String SIP_URI_PREFIX = "sip:";

    @evlh
    @evlj(a = "colour")
    String colour;

    @evlh
    @evlj(a = "custom-pcc")
    BusinessInfoCustomJsonData customPccData;

    @evlh
    @evlj(a = "pcc")
    StandardData pccData;

    /* compiled from: PG */
    static class StandardData {

        @evlh
        @evlj(a = "org-details")
        BusinessInfoStandardJsonData standardData;

        @evlh
        @evlj(a = "pcc-type")
        String type;

        StandardData() {
        }
    }

    public BusinessInfoData buildBusinessInfoData(String str, ctvb ctvbVar) {
        if (str == null || BusinessInfoJson$$ExternalSyntheticBackport0.m(str)) {
            str = emxe.b(getBotId());
        }
        dkty.k("Building business info data object for %s", str);
        BusinessInfoData.Builder builder = BusinessInfoData.builder(str);
        if (parseJsonToBuilder(builder, str, ctvbVar)) {
            return builder.build();
        }
        return null;
    }

    public String getBotId() {
        BusinessInfoStandardJsonData businessInfoStandardJsonData;
        String uri;
        StandardData standardData = this.pccData;
        if (standardData == null || (businessInfoStandardJsonData = standardData.standardData) == null) {
            return null;
        }
        for (BusinessInfoJsonData.UriEntryData uriEntryData : businessInfoStandardJsonData.getUriEntries()) {
            if (Objects.equals(uriEntryData.getType(), SIP_URI) && (uri = uriEntryData.getUri()) != null) {
                return uri.replaceFirst(SIP_URI_PREFIX, "");
            }
        }
        return null;
    }

    public String getColour() {
        return this.colour;
    }

    public String getName() {
        StandardData standardData = this.pccData;
        standardData.getClass();
        return standardData.standardData.getName();
    }

    public boolean parseJsonToBuilder(BusinessInfoData.Builder builder, String str, ctvb ctvbVar) {
        BusinessInfoStandardJsonData businessInfoStandardJsonData;
        StandardData standardData = this.pccData;
        if (standardData == null || (businessInfoStandardJsonData = standardData.standardData) == null) {
            dkty.q("Could not create business info data object from invalid json: %s", dkty.a(standardData));
            return false;
        }
        businessInfoStandardJsonData.parseJsonToBuilder(builder, str, ctvbVar);
        BusinessInfoCustomJsonData businessInfoCustomJsonData = this.customPccData;
        if (businessInfoCustomJsonData != null) {
            businessInfoCustomJsonData.parseJsonToBuilder(builder, ctvbVar);
        }
        return true;
    }
}

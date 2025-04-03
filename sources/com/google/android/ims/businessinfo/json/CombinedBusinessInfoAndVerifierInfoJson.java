package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.ctvb;
import defpackage.dkty;
import defpackage.emxe;
import defpackage.evlh;
import defpackage.evlj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CombinedBusinessInfoAndVerifierInfoJson {

    @evlh
    @evlj(a = "botinfo")
    private BusinessInfoJson botInfo;

    @evlh
    @evlj(a = "bot-verification")
    private BusinessVerifierInfoJsonData botVerifierInfo;

    public BusinessInfoData buildBusinessInfoData(String str, ctvb ctvbVar) {
        BusinessVerifierInfoJsonData businessVerifierInfoJsonData;
        if (str == null || CombinedBusinessInfoAndVerifierInfoJson$$ExternalSyntheticBackport0.m(str)) {
            str = emxe.b(getBotId());
        }
        dkty.k("Building business info data object with verifier info for %s", str);
        BusinessInfoData.Builder builder = BusinessInfoData.builder(str);
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson == null) {
            dkty.q("Could not create business info data object from invalid json: %s", null);
            return null;
        }
        if (businessInfoJson.parseJsonToBuilder(builder, str, ctvbVar) && ((businessVerifierInfoJsonData = this.botVerifierInfo) == null || businessVerifierInfoJsonData.parseJsonToBuilder(builder, str))) {
            return builder.build();
        }
        return null;
    }

    public String getBotId() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getBotId();
        }
        return null;
    }

    public String getColour() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getColour();
        }
        return null;
    }

    public String getName() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getName();
        }
        return null;
    }

    public boolean getVerified() {
        BusinessVerifierInfoJsonData businessVerifierInfoJsonData = this.botVerifierInfo;
        if (businessVerifierInfoJsonData != null) {
            return businessVerifierInfoJsonData.getVerified();
        }
        return false;
    }
}

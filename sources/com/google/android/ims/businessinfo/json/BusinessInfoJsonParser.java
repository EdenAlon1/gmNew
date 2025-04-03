package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.ctvb;
import defpackage.dkty;
import defpackage.evkn;
import defpackage.evko;
import defpackage.evlb;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoJsonParser {
    private static final evkn marshaller;

    static {
        evko evkoVar = new evko();
        evkoVar.b();
        marshaller = evkoVar.a();
    }

    private BusinessInfoJsonParser() {
    }

    public static BusinessInfoData legacyParse(String str, Reader reader, ctvb ctvbVar) {
        dkty.k("Attempting to parse json for %s...", dkty.a(str));
        try {
            BusinessInfoJson businessInfoJson = (BusinessInfoJson) marshaller.g(reader, BusinessInfoJson.class);
            dkty.k("Done parsing json for %s.", dkty.a(str));
            if (businessInfoJson != null) {
                return businessInfoJson.buildBusinessInfoData(str, ctvbVar);
            }
            dkty.g("Received null json object from parsing rbmBotId %s", dkty.a(str));
            return null;
        } catch (evlb unused) {
            dkty.g("Unable to parse business info for rbmBotId %s due to invalid JSON", dkty.a(str));
            return null;
        }
    }

    public static BusinessInfoData parse(String str, Reader reader, ctvb ctvbVar) {
        dkty.k("Attempting to parse json for %s...", dkty.a(str));
        try {
            CombinedBusinessInfoAndVerifierInfoJson combinedBusinessInfoAndVerifierInfoJson = (CombinedBusinessInfoAndVerifierInfoJson) marshaller.g(reader, CombinedBusinessInfoAndVerifierInfoJson.class);
            dkty.k("Done parsing json for %s.", dkty.a(str));
            if (combinedBusinessInfoAndVerifierInfoJson != null) {
                return combinedBusinessInfoAndVerifierInfoJson.buildBusinessInfoData(str, ctvbVar);
            }
            dkty.g("Received null json object from parsing rbmBotId %s", dkty.a(str));
            return null;
        } catch (evlb unused) {
            dkty.g("Unable to parse business info for rbmBotId %s due to invalid JSON", dkty.a(str));
            return null;
        }
    }
}

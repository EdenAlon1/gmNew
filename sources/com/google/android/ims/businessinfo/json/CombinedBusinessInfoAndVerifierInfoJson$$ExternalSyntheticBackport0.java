package com.google.android.ims.businessinfo.json;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class CombinedBusinessInfoAndVerifierInfoJson$$ExternalSyntheticBackport0 {
    public static /* synthetic */ boolean m(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }
}

package org.chromium.url;

import java.net.IDN;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class IDNStringUtil {
    private static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}

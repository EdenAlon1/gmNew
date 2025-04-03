package org.chromium.base;

import defpackage.a;
import defpackage.fidw;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class LocaleUtils {
    private LocaleUtils() {
    }

    public static String a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 3365) {
            if (str.equals("in")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3374) {
            if (str.equals("iw")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 3391) {
            if (str.equals("ji")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == 3405) {
            if (str.equals("jw")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 3704) {
            if (hashCode == 102533 && str.equals("gom")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("tl")) {
                c = 5;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? str : "fil" : "jv" : "yi" : "he" : "id" : "kok";
    }

    public static String b(Locale locale) {
        String a = a(locale.getLanguage());
        String country = locale.getCountry();
        return (a.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) ? "nn-NO" : country.isEmpty() ? a : a.w(country, a, "-");
    }

    public static String getDefaultCountryCode() {
        fidw a = fidw.a();
        return a.c() ? a.b() : Locale.getDefault().getCountry();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDefaultLocaleListString() {
        /*
            android.os.LocaleList r0 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m116m$1()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        La:
            int r3 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r0)
            if (r2 >= r3) goto L3d
            java.util.Locale r3 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r0, r2)
            java.lang.String r4 = r3.getLanguage()
            java.lang.String r5 = a(r4)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L33
            java.util.Locale$Builder r4 = new java.util.Locale$Builder
            r4.<init>()
            java.util.Locale$Builder r3 = r4.setLocale(r3)
            java.util.Locale$Builder r3 = r3.setLanguage(r5)
            java.util.Locale r3 = r3.build()
        L33:
            java.lang.String r3 = b(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L3d:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.LocaleUtils.getDefaultLocaleListString():java.lang.String");
    }

    public static String getDefaultLocaleString() {
        return b(Locale.getDefault());
    }
}

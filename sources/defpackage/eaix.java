package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eaix {
    public static final eaix a = b("Content-Encoding");
    public static final eaix b;
    public static final eaix c;
    public static final eaix d;

    static {
        b(fhpi.a);
        b = b("X-DFE-Device-Id");
        c = b("X-DFE-Debug-Overrides");
        d = b("X-Server-Token");
    }

    public static eaix b(String str) {
        emxf.f(emvk.a.h(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new eair(str.toLowerCase(Locale.US));
    }

    public abstract String a();
}

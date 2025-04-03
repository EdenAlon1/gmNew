package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crjn {
    public static String a(String str) {
        return b(true, str);
    }

    public static String b(boolean z, String str) {
        if (!z || str == null || str.length() <= 4) {
            return str;
        }
        cskc cskcVar = cpdg.a;
        return aoqw.h(str) ? str.substring(0, 4) : str.substring(str.length() - 4);
    }
}

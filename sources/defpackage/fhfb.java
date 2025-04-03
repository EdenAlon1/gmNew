package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhfb {
    public static final int a(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (ffpc.L(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }
}

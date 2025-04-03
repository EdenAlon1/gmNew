package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhop {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("--") ? str.substring(2) : str.startsWith("-") ? str.substring(1) : str;
    }
}

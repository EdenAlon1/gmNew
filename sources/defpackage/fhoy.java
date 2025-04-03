package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhoy {
    public static boolean a(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}

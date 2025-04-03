package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evrt {
    private final String a;

    public evrt(String str) {
        this.a = str.concat("_");
    }

    public final String a(Object obj) {
        String obj2 = obj.toString();
        boolean z = false;
        if (obj2 != null && obj2.length() != 0) {
            int length = obj2.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                int codePointAt = obj2.codePointAt(i);
                if (!Character.isLetterOrDigit(codePointAt)) {
                    break;
                }
                i += Character.charCount(codePointAt);
            }
        }
        emxf.f(z, "Invalid key: %s", obj2);
        return this.a.concat(String.valueOf(String.valueOf(obj)));
    }
}

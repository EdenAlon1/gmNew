package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dimb {
    FULL("full"),
    PARTIAL("partial"),
    DELETED("deleted"),
    NONE("none");

    public final String e;

    dimb(String str) {
        this.e = str;
    }

    public static dimb a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (dimb dimbVar : values()) {
            if (dimbVar.e.equals(lowerCase)) {
                return dimbVar;
            }
        }
        return NONE;
    }
}

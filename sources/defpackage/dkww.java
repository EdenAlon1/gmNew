package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dkww {
    OPEN("open"),
    CLOSED("closed");

    public final String c;

    dkww(String str) {
        this.c = str;
    }

    public static dkww a(String str) {
        dkww[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].c.equalsIgnoreCase(str)) {
                return values[i];
            }
        }
        return null;
    }
}

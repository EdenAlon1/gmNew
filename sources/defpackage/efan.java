package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efan {
    private static final eexh a = new eexh("debug.properties.can_override");
    private final String b;
    private final String c;

    public efan(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        if (!eexk.a(a)) {
            return this.c;
        }
        String a2 = efbb.a(this.b, this.c);
        if (a2 == null || a2.length() != 91) {
            return a2;
        }
        String str = this.b;
        StringBuilder sb = new StringBuilder(a2);
        int i = 2;
        while (true) {
            String a3 = efbb.a(str + i, "");
            sb.append(a3);
            if (a3.length() != 91) {
                return sb.toString();
            }
            i++;
        }
    }
}

package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ditz {
    public static final ditz a = new ditz(0, -1, 0, false, 0);
    public final int b;
    public final long c;
    public final boolean d;
    public final int e;
    private final int f;

    public ditz(int i, long j, int i2, boolean z, int i3) {
        this.b = i;
        this.c = j;
        this.f = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean a(dity dityVar) {
        return dityVar.b(this.f);
    }

    public final String toString() {
        String sb;
        int i = this.b;
        String str = i != 1 ? i != 2 ? "STATE_UNKNOWN" : "STATE_IMS_CONTACT" : "STATE_NON_IMS_CONTACT";
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(this.c);
        int i2 = this.f;
        dity dityVar = dity.HTTP_FT;
        if (i2 == 0) {
            sb = "[ ]";
        } else {
            StringBuilder sb2 = new StringBuilder("[ ");
            for (dity dityVar2 : dity.values()) {
                if (dityVar2.b(i2)) {
                    sb2.append(dityVar2.toString());
                    sb2.append(' ');
                }
            }
            sb2.append(']');
            sb = sb2.toString();
        }
        return String.format(locale, "Status: %s, last activity: %d, capabilities: %s", str, valueOf, sb);
    }
}

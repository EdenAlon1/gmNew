package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgmg {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static dglq a(emxc emxcVar) {
        int i = 2;
        if (emxcVar.g()) {
            emxc b = b((ewoj) emxcVar.c());
            if (b.g()) {
                ewof b2 = ewof.b(((ewoi) b.c()).d);
                if (b2 == null) {
                    b2 = ewof.UNKNOWN;
                }
                int ordinal = b2.ordinal();
                i = ordinal != 1 ? ordinal != 2 ? 3 : 4 : 1;
            }
        }
        return new dglo(i);
    }

    public static emxc b(ewoj ewojVar) {
        if ((ewojVar.b & 1) != 0) {
            try {
                return emxc.j((ewoi) eyfy.parseFrom(ewoi.a, ewojVar.c, eyfc.a()));
            } catch (eygu unused) {
            }
        }
        return emux.a;
    }
}

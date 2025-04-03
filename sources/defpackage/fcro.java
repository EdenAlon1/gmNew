package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcro implements evbk {
    private final ecda b = ecda.a(fcsj.a, new ecda("CreateShortLinks"));
    private final enip c = enip.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? fcsj.y.A : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}

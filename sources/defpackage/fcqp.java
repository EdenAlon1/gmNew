package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcqp implements evbk {
    private final ecda b = ecda.a(fcqz.a, new ecda("RegisterSilent"));
    private final enip c = new enpx("https://www.googleapis.com/auth/numberer");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? fcqz.G.I : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}

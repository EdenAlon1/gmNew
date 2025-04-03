package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etbn implements evbk {
    private final ecda b = ecda.a(etdq.a, new ecda("GetPayloadPart"));
    private final enip c = new enpx("https://www.googleapis.com/auth/carrier-message-store");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? etdq.ae.ag : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}

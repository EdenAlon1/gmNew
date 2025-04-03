package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpo implements evbk {
    private final ecda b = ecda.a(fcpt.a, new ecda("ReceiveMessagesExpress"));
    private final enip c = enip.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? fcpt.o.q : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}

package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewtl implements evbk {
    private final ecda b = ecda.a(ewum.a, new ecda("GetMessagesProfileAccessToken"));
    private final enip c = enip.r("https://www.googleapis.com/auth/peopleapi.readonly", "https://www.googleapis.com/auth/peopleapi.readwrite");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? ewum.ac.ae : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}

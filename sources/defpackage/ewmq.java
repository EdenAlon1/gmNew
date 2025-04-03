package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewmq implements evbk {
    private final ecda b = ecda.a(ewmr.a, new ecda("GetProfilePhotoArtHomeSuggestions"));
    private final enip c = enpd.a;

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? ewmr.o.q : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}

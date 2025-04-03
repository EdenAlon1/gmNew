package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eshc implements evbk {
    private final ecda b = ecda.a(eshe.a, new ecda("SmarterReplies"));
    private final enip c = new enpx("https://www.googleapis.com/auth/mdi.aratea");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? eshe.e.g : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}

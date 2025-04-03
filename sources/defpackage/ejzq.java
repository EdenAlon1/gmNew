package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzq implements eewt {
    private final elhc a;
    private final ffbr b;
    private final ffbr c;

    public ejzq(elhc elhcVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = elhcVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.eewt
    public final void a(eewp eewpVar) {
        Iterator it = ((Set) this.b.b()).iterator();
        while (it.hasNext()) {
            eewpVar.i(this.a.a((eewm) it.next()));
        }
        Iterator it2 = ((Set) ((fbbb) this.c).a).iterator();
        while (it2.hasNext()) {
            eewpVar.g(new elgy(this.a, (eewl) it2.next()));
        }
    }
}

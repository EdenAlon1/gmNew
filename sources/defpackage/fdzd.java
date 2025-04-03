package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdzd extends fecs {
    protected fdzd() {
    }

    public abstract fecs a();

    @Override // defpackage.fecs
    public final void b(fecw fecwVar) {
        fecs a = a();
        fecwVar.getClass();
        ((feva) a).f.add(fecwVar);
    }

    public final void c(fdxe fdxeVar) {
        fecs a = a();
        fdxeVar.getClass();
        HashMap hashMap = ((feva) a).d.a;
        fedb w = fdxeVar.w();
        hashMap.put(w.a.a, w);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", a());
        return b.toString();
    }
}

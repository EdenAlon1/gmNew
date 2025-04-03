package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekmy implements ekna {
    public final ea a;
    public final eknb b;

    public ekmy(ea eaVar, eknb eknbVar) {
        this.a = eaVar;
        this.b = eknbVar;
    }

    @Override // defpackage.ekna
    public final void a(ekmz ekmzVar) {
        eg G = this.a.G();
        G.getClass();
        ComponentCallbacks2 componentCallbacks2 = ekmzVar.b;
        G.registerComponentCallbacks(componentCallbacks2);
        this.b.a(G, ekmzVar);
        this.a.P().c(new ekmx(this, G, ekmzVar, componentCallbacks2));
    }
}

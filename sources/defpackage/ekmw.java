package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekmw implements ekna {
    public final eg a;
    public final eknb b;

    public ekmw(eg egVar, eknb eknbVar) {
        this.a = egVar;
        this.b = eknbVar;
    }

    @Override // defpackage.ekna
    public final void a(ekmz ekmzVar) {
        eg egVar = this.a;
        ComponentCallbacks2 componentCallbacks2 = ekmzVar.b;
        egVar.registerComponentCallbacks(componentCallbacks2);
        this.b.a(this.a, ekmzVar);
        this.a.P().c(new ekmv(this, ekmzVar, componentCallbacks2));
    }
}

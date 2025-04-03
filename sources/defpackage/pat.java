package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pat extends pas {
    final /* synthetic */ cmh a;
    final /* synthetic */ pau b;

    public pat(pau pauVar, cmh cmhVar) {
        this.b = pauVar;
        this.a = cmhVar;
    }

    @Override // defpackage.pas, defpackage.pak
    public final void b(par parVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(parVar);
        parVar.I(this);
    }
}

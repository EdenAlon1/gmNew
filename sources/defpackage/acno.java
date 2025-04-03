package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acno extends abo {
    final /* synthetic */ acnp a;
    final /* synthetic */ Activity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acno(acnp acnpVar, Activity activity) {
        super(true);
        this.a = acnpVar;
        this.d = activity;
    }

    @Override // defpackage.abo
    public final void b() {
        acnp acnpVar = this.a;
        axol.k(acnpVar.d, null, new acnn(acnpVar, null), 3);
        h(false);
        ((abe) this.d).gE().d();
    }
}

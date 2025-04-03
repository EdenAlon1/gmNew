package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dq extends dx {
    final /* synthetic */ ea a;

    public dq(ea eaVar) {
        this.a = eaVar;
    }

    @Override // defpackage.dx
    public final void a() {
        this.a.ad.a();
        lmc.c(this.a);
        Bundle bundle = this.a.h;
        this.a.ad.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}

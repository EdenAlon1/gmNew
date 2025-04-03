package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejyu {
    public ejys a;

    public ejyu(ejys ejysVar) {
        this.a = ejysVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.concurrent.Future] */
    final void a() {
        Object ejxgVar;
        efbd.c();
        ejys ejysVar = this.a;
        ejysVar.getClass();
        emxf.m(ejysVar.a().g(), "LocalSubscriptionState detected an atomicity failure. Previous pendingResult was already cleared. If this Exception is ever thrown, it is a major bug, and should be reported to TikTok as a P1 along with the Sponge or Listnr error report. Please file at go/tiktok/bug.");
        try {
            ejxgVar = new ejxh(erqt.q(ejysVar.a().c()));
        } catch (ExecutionException e) {
            ejxgVar = new ejxg(e.getCause());
        }
        this.a = new ejxf(ejysVar.b(), emux.a, emxc.j(ejxgVar), ejysVar.d());
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnz implements bjt {
    final /* synthetic */ bnr a;
    final /* synthetic */ boc b;

    public bnz(boc bocVar, bnr bnrVar) {
        this.b = bocVar;
        this.a = bnrVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        int i = this.a.f;
        if (i == 2) {
            if (th instanceof CancellationException) {
                avw.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            i = 2;
        }
        avw.g("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(boh.a(i)), th);
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        awy awyVar = (awy) obj;
        ksw.h(awyVar);
        try {
            this.b.a.b(awyVar);
        } catch (awm e) {
            avw.d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
        }
    }
}

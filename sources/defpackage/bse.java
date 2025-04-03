package defpackage;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bse implements bjt {
    final /* synthetic */ buj a;
    final /* synthetic */ btb b;

    public bse(btb btbVar, buj bujVar) {
        this.b = btbVar;
        this.a = bujVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        Objects.toString(th);
        avw.a("Recorder", "Error in ReadyToReleaseFuture: ".concat(th.toString()));
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bxz bxzVar;
        bxz bxzVar2 = (bxz) obj;
        Objects.toString(bxzVar2);
        avw.a("Recorder", "VideoEncoder can be released: ".concat(String.valueOf(bxzVar2)));
        if (bxzVar2 == null) {
            return;
        }
        ScheduledFuture scheduledFuture = this.b.T;
        if (scheduledFuture != null && scheduledFuture.cancel(false) && (bxzVar = this.b.D) != null && bxzVar == bxzVar2) {
            btb.k(bxzVar);
        }
        btb btbVar = this.b;
        btbVar.W = this.a;
        btbVar.o(null);
        this.b.G();
    }
}

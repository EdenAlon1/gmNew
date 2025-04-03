package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awbp implements awat {
    public final cqqp a;
    public final crfh b;
    private final ffsk c;
    private ffss d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final awcr f = awcr.a;

    public awbp(ffsk ffskVar, cqqp cqqpVar, crfh crfhVar) {
        this.c = ffskVar;
        this.a = cqqpVar;
        this.b = crfhVar;
    }

    @Override // defpackage.awat
    public final awcr a() {
        return this.f;
    }

    @Override // defpackage.awat
    public final Object b(ffgu ffguVar) {
        if (this.e.get()) {
            return ffcu.a;
        }
        ffss ffssVar = this.d;
        if (ffssVar == null) {
            ffkj.c("asyncTask");
            ffssVar = null;
        }
        ffssVar.t(new CancellationException("UploadConnectionPrewarmStep cancelled"));
        this.e.set(true);
        return ffcu.a;
    }

    @Override // defpackage.awat
    public final Object e(ffgu ffguVar) {
        return ffcu.a;
    }

    @Override // defpackage.awat
    public final Object f(awai awaiVar, awbj awbjVar, ffgu ffguVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        ffss b = ffra.b(this.c, ekxi.a(ffheVar), ffsmVar, new awbo(null, this, awaiVar));
        this.d = b;
        if (b == null) {
            ffkj.c("asyncTask");
        }
        return awbjVar;
    }

    @Override // defpackage.awat
    public final boolean h() {
        return this.e.get();
    }

    @Override // defpackage.awat
    public final /* synthetic */ boolean i() {
        return false;
    }
}

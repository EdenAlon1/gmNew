package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffwn extends ffqq implements ffwm {
    public final ffwm b;

    public ffwn(ffhd ffhdVar, ffwm ffwmVar) {
        super(ffhdVar, true);
        this.b = ffwmVar;
    }

    @Override // defpackage.ffxg
    public final fgis C() {
        return this.b.C();
    }

    @Override // defpackage.ffuq
    public final void L(Throwable th) {
        ffwm ffwmVar = this.b;
        CancellationException V = ffuq.V(this, th);
        ffwmVar.t(V);
        P(V);
    }

    @Override // defpackage.ffxi
    public final Object a(Object obj, ffgu ffguVar) {
        return this.b.a(obj, ffguVar);
    }

    @Override // defpackage.ffxi
    public final Object b(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.ffxi
    public final void d(ffji ffjiVar) {
        throw null;
    }

    @Override // defpackage.ffxi
    public final boolean e(Throwable th) {
        return this.b.e(th);
    }

    @Override // defpackage.ffxi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.ffxg
    public final Object i(ffgu ffguVar) {
        throw null;
    }

    @Override // defpackage.ffxg
    public final Object j(ffgu ffguVar) {
        throw null;
    }

    @Override // defpackage.ffxg
    public final Object m() {
        return this.b.m();
    }

    @Override // defpackage.ffxg
    public final ffwo r() {
        return this.b.r();
    }

    @Override // defpackage.ffuq, defpackage.ffud
    public final void t(CancellationException cancellationException) {
        if (x()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new ffue(g(), null, this);
        }
        L(cancellationException);
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjr implements ffss {
    private final /* synthetic */ ffrp a;

    public fgjr(ffrp ffrpVar) {
        this.a = ffrpVar;
    }

    @Override // defpackage.ffss
    public final Object c(ffgu ffguVar) {
        return ((ffuq) this.a).B(ffguVar);
    }

    @Override // defpackage.ffss
    public final Object d() {
        return ((ffuq) this.a).D();
    }

    @Override // defpackage.ffss
    public final fgis f() {
        throw null;
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffgz.a(this.a, r, ffjmVar);
    }

    @Override // defpackage.ffha, defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) ffgz.b(this.a, ffhbVar);
    }

    @Override // defpackage.ffha
    public final ffhb<?> getKey() {
        return ffud.c;
    }

    @Override // defpackage.ffud
    public final ffte hZ(ffji ffjiVar) {
        return this.a.hZ(ffjiVar);
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        return ffgz.c(this.a, ffhbVar);
    }

    @Override // defpackage.ffud
    public final Object o(ffgu ffguVar) {
        return this.a.o(ffguVar);
    }

    @Override // defpackage.ffud
    public final CancellationException p() {
        return this.a.p();
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return ffgz.d(this.a, ffhdVar);
    }

    @Override // defpackage.ffud
    public final ffrm q(ffro ffroVar) {
        return this.a.q(ffroVar);
    }

    @Override // defpackage.ffud
    public final ffte s(boolean z, boolean z2, ffji ffjiVar) {
        return this.a.s(z, z2, ffjiVar);
    }

    @Override // defpackage.ffud
    public final void t(CancellationException cancellationException) {
        this.a.t(cancellationException);
    }

    @Override // defpackage.ffud
    public final boolean v() {
        return this.a.v();
    }

    @Override // defpackage.ffud
    public final boolean x() {
        return this.a.x();
    }

    @Override // defpackage.ffud
    public final boolean y() {
        return this.a.y();
    }

    @Override // defpackage.ffud
    public final boolean z() {
        return this.a.z();
    }
}

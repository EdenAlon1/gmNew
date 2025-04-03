package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jch implements hhh {
    public final Choreographer a;
    private final jcc b;

    public jch(Choreographer choreographer, jcc jccVar) {
        this.a = choreographer;
        this.b = jccVar;
    }

    @Override // defpackage.hhh
    public final Object a(ffji ffjiVar, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        jcg jcgVar = new jcg(ffrhVar, ffjiVar);
        jcc jccVar = this.b;
        if (ffkj.e(jccVar.c, this.a)) {
            synchronized (jccVar.e) {
                jccVar.f.add(jcgVar);
                if (!jccVar.h) {
                    jccVar.h = true;
                    jccVar.c.postFrameCallback(jccVar.i);
                }
            }
            ffrhVar.d(new jce(jccVar, jcgVar));
        } else {
            this.a.postFrameCallback(jcgVar);
            ffrhVar.d(new jcf(this, jcgVar));
        }
        return ffrhVar.m();
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffgz.a(this, r, ffjmVar);
    }

    @Override // defpackage.ffha, defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) ffgz.b(this, ffhbVar);
    }

    @Override // defpackage.ffha
    public final /* synthetic */ ffhb getKey() {
        return hhh.e;
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        return ffgz.c(this, ffhbVar);
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return ffgz.d(this, ffhdVar);
    }
}

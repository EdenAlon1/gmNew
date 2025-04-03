package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hua implements hmr, ffha {
    public static final hty a = new hty();
    public final hfm b;

    public hua(hfm hfmVar) {
        this.b = hfmVar;
    }

    @Override // defpackage.hmr
    public final List a() {
        return this.b.S();
    }

    public final void b(Throwable th, Object obj) {
        htw.a(th, new htz(this, obj));
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
    public final ffhb<?> getKey() {
        return a;
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

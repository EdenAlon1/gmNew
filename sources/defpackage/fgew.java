package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgew implements ffhd {
    public final Throwable a;
    private final /* synthetic */ ffhd b;

    public fgew(Throwable th, ffhd ffhdVar) {
        this.b = ffhdVar;
        this.a = th;
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) this.b.fold(r, ffjmVar);
    }

    @Override // defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) this.b.get(ffhbVar);
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        return this.b.minusKey(ffhbVar);
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return this.b.plus(ffhdVar);
    }
}

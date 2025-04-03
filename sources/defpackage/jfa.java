package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfa implements hvl {
    private final hjx a = new hhw(1.0f);

    @Override // defpackage.hvl
    public final float a() {
        return this.a.c();
    }

    public final void b(float f) {
        this.a.i(f);
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
        return hvl.b;
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

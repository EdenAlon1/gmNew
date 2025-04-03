package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffgo implements ffha {
    private final ffhb<?> key;

    public ffgo(ffhb<?> ffhbVar) {
        ffhbVar.getClass();
        this.key = ffhbVar;
    }

    @Override // defpackage.ffhd
    public <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffgz.a(this, r, ffjmVar);
    }

    @Override // defpackage.ffha, defpackage.ffhd
    public <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) ffgz.b(this, ffhbVar);
    }

    @Override // defpackage.ffha
    public ffhb<?> getKey() {
        return this.key;
    }

    @Override // defpackage.ffhd
    public ffhd minusKey(ffhb<?> ffhbVar) {
        return ffgz.c(this, ffhbVar);
    }

    @Override // defpackage.ffhd
    public ffhd plus(ffhd ffhdVar) {
        return ffgz.d(this, ffhdVar);
    }
}

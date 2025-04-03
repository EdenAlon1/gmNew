package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewm implements ffvh<fdyn> {
    public static final fewl a = new fewl();
    private final fdyn b;

    public fewm(fdyn fdynVar) {
        this.b = fdynVar;
    }

    @Override // defpackage.ffvh
    public final /* bridge */ /* synthetic */ Object a(ffhd ffhdVar) {
        ffhdVar.getClass();
        fdyn a2 = this.b.a();
        a2.getClass();
        return a2;
    }

    @Override // defpackage.ffvh
    public final /* bridge */ /* synthetic */ void b(ffhd ffhdVar, Object obj) {
        fdyn fdynVar = (fdyn) obj;
        ffhdVar.getClass();
        fdynVar.getClass();
        this.b.f(fdynVar);
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
    public final ffhb<fewm> getKey() {
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

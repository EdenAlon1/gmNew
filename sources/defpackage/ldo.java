package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldo implements ffha {
    private final ldo a;
    private final lcc b;

    public ldo(ldo ldoVar, lcc lccVar) {
        this.a = ldoVar;
        this.b = lccVar;
    }

    public final void a(lap lapVar) {
        if (this.b == lapVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        ldo ldoVar = this.a;
        if (ldoVar != null) {
            ldoVar.a(lapVar);
        }
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
        return ldn.a;
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

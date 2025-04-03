package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pvu implements pvx {
    public final pwl a;

    public pvu(pwl pwlVar) {
        this.a = pwlVar;
    }

    @Override // defpackage.pvx
    public final ffxx a(poj pojVar) {
        pojVar.getClass();
        return new ffxn(new pvt(this, null));
    }

    @Override // defpackage.pvx
    public final boolean c(pyj pyjVar) {
        return b(pyjVar) && e(this.a.b());
    }

    protected abstract int d();

    protected boolean e(Object obj) {
        throw null;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgn implements hjk {
    private final ffji a;
    private hgo b;

    public hgn(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.hjk
    public final void h() {
        hgo hgoVar = this.b;
        if (hgoVar != null) {
            hgoVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.hjk
    public final void i() {
        this.b = (hgo) this.a.invoke(hgs.a);
    }

    @Override // defpackage.hjk
    public final void g() {
    }
}

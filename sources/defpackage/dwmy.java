package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmy extends dwmz {
    protected final dwna a;
    protected final Runnable b = new dwmx(this);

    public dwmy(dwna dwnaVar) {
        this.a = dwnaVar;
    }

    @Override // defpackage.dwmz
    public final void a(int i) {
        this.a.g(this.b);
    }

    @Override // defpackage.dwmz
    public final void b() {
        this.a.f(this.b);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzus extends dzvu {
    private engw a;
    private emxc b = emux.a;

    @Override // defpackage.dzvu
    public final dzvv a() {
        if (this.a != null) {
            return new dzut(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: components");
    }

    @Override // defpackage.dzvu
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null components");
        }
        this.a = engwVar;
    }

    @Override // defpackage.dzvu
    public final void c(int i) {
        this.b = emxc.j(Integer.valueOf(i));
    }
}

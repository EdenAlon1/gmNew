package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgy implements awq {
    private final awq a;

    public bgy(awq awqVar) {
        ksw.b(true, "Timeout must be non-negative.");
        this.a = awqVar;
    }

    @Override // defpackage.awq
    public final awp a(bcu bcuVar) {
        awp a = this.a.a(bcuVar);
        return bcuVar.b >= 6000 - a.d ? awp.a : a;
    }

    @Override // defpackage.awq
    public final void b() {
    }
}

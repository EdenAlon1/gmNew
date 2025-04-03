package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipb extends iqj {
    private final iuv a;

    public ipb(iuv iuvVar) {
        this.a = iuvVar;
    }

    @Override // defpackage.iqj
    public final int a() {
        return this.a.w();
    }

    @Override // defpackage.iqj
    public final ioc b() {
        iuv iuvVar = this.a;
        ioc J = iuvVar.k ? null : iuvVar.J();
        if (J == null) {
            iuvVar.L().y.f();
        }
        return J;
    }

    @Override // defpackage.iqj
    public final kah c() {
        return this.a.q();
    }
}

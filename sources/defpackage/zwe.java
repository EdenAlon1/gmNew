package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwe implements xik {
    public boolean a;
    public final fgdj b;
    private final ffsk c;
    private final fgcm d;
    private ffud e;

    public zwe(ffsk ffskVar) {
        ffskVar.getClass();
        this.c = ffskVar;
        fgcm a = fgdm.a(false);
        this.d = a;
        this.b = a;
    }

    @Override // defpackage.xik
    public final void a(xhu xhuVar) {
        if (xhuVar.g != null) {
            return;
        }
        c();
    }

    public final void b() {
        this.a = false;
        this.d.f(false);
        ffud ffudVar = this.e;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.e = null;
    }

    public final void c() {
        this.a = true;
    }

    public final void d() {
        this.d.f(true);
        ffud ffudVar = this.e;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.e = axol.k(this.c, null, new zwd(this, null), 3);
    }
}

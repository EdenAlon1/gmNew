package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djhb extends dkji {
    final /* synthetic */ djhc a;
    private final String b;
    private final dkkj c;

    public djhb(djhc djhcVar, String str, dkkj dkkjVar) {
        this.a = djhcVar;
        this.b = str;
        this.c = dkkjVar;
    }

    private final void d() {
        synchronized (this.a.b) {
            if (((dkkj) this.a.c.get(this.b)) == this.c) {
                dkty.c("removing session: %s", dktx.PHONE_NUMBER.c(this.b));
                this.a.c.remove(this.b);
            }
            this.c.aU(this);
        }
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void e() {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void f() {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void g(dkqs dkqsVar) {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void h(int i, String str) {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void k() {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void l(dkqs dkqsVar) {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void m() {
        d();
    }
}

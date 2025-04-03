package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnm extends cpdo {
    public final ffbr a;
    private final errl b;

    public cmnm(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("RcsProvisioningStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return elfo.f(new Runnable() { // from class: cmnl
            @Override // java.lang.Runnable
            public final void run() {
                ((ckaj) cmnm.this.a.b()).f();
            }
        }, this.b);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}

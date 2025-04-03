package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cftq extends cpdo {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final errl d;

    public cftq(ffbr ffbrVar, errl errlVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.d = errlVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("BroadcastProvisioningInfoStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return elfo.f(new Runnable() { // from class: cftp
            @Override // java.lang.Runnable
            public final void run() {
                cftq cftqVar = cftq.this;
                cftqVar.b.b();
                ((cfuw) cftqVar.c.b()).a();
                ((ckds) cftqVar.a.b()).t();
            }
        }, this.d);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}

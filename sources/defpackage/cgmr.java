package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgmr extends cpdo {
    public static final cskc a = cskc.g("BugleMDD", "MddBackgroundStartupTask");
    public final ffbr b;
    public final ffbr c;
    public final errl d;
    public final ffbr e;
    private final errl f;

    public cgmr(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, ffbr ffbrVar3) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = errlVar;
        this.d = errlVar2;
        this.e = ffbrVar3;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("MddBackgroundStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return elfo.f(new Runnable() { // from class: cgmp
            @Override // java.lang.Runnable
            public final void run() {
                if (!((Boolean) ctjd.Q.e()).booleanValue() && !((Boolean) ctjd.P.e()).booleanValue()) {
                    cgmr.a.m("MDD Lib is not enabled, skipping reading config and job scheduling.");
                    return;
                }
                cgmr cgmrVar = cgmr.this;
                dwub dwubVar = (dwub) cgmrVar.b.b();
                dwxh d = dwxi.d();
                d.b(true);
                d.c(((Boolean) ctjd.bk.e()).booleanValue());
                d.d(false);
                dwxi a2 = d.a();
                dwxh d2 = dwxi.d();
                d2.b(true);
                d2.c(((Boolean) ctjd.bk.e()).booleanValue());
                d2.d(false);
                dwxi a3 = d2.a();
                dwxh d3 = dwxi.d();
                d3.b(true);
                d3.c(false);
                d3.d(false);
                elfr.l(dwubVar.j(emxc.j(enhk.n("MDD.CELLULAR.CHARGING.PERIODIC.TASK", a2, "MDD.WIFI.CHARGING.PERIODIC.TASK", a3, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", d3.a()))), new cgmq(cgmrVar), erpp.a);
            }
        }, this.f);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}

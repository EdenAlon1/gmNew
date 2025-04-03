package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cmqh extends ceut {
    public static final cskc a = cskc.g("Bugle", "UnregisterGoogleRcsCallWorkItemHandler");
    private final errl b;
    private final ffbr c;
    private final chco d;

    public cmqh(errl errlVar, ffbr ffbrVar, chco chcoVar) {
        this.b = errlVar;
        this.c = ffbrVar;
        this.d = chcoVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WAKELOCK);
        l.c(5);
        l.g(5000L);
        l.f(poa.EXPONENTIAL);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UnregisterGoogleRcsCallWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cmqd.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        cmqd cmqdVar = (cmqd) eyhsVar;
        if (cmqdVar.c == 0 || cmqdVar.d.isEmpty()) {
            a.r("[SR]: Bad call to UnregisterGoogleRcsCall, ignoring.");
            return elfo.e(ceyt.k());
        }
        final String g = this.d.g(cmqdVar.c);
        if (TextUtils.isEmpty(g)) {
            csjb e = a.e();
            e.I("[SR]: Failed to get phoneNumber for subId, will retry.");
            e.m(cmqdVar.c);
            e.r();
            return elfo.e(ceyt.m());
        }
        csjb a2 = a.a();
        a2.I("[SR]: Calling UnregisterGoogleRcsRPC.");
        a2.k(g);
        a2.r();
        return ((chep) this.c.b()).a(new chzh(g)).h(new emwl() { // from class: cmqf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb c = cmqh.a.c();
                c.I("[SR]: Successfully called UnregisterGoogleRcsRPC.");
                c.k(g);
                c.r();
                return ceyt.i();
            }
        }, this.b).e(Throwable.class, new emwl() { // from class: cmqg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                boolean d = chfh.d(th);
                csjb e2 = cmqh.a.e();
                e2.I("[SR]: UnregisterGoogleRcs RPC failed.");
                e2.k(g);
                e2.s(th);
                return d ? ceyt.m() : ceyt.k();
            }
        }, this.b);
    }
}

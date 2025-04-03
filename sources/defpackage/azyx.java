package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azyx extends cpdo {
    static final cfva a = cfvl.f(cfvl.b, "janitor_job_min_interval_millis", TimeUnit.MILLISECONDS.convert(7, TimeUnit.DAYS));
    public final ffbr b;
    public final azyl c;
    public final dlpw d;

    public azyx(ffbr ffbrVar, azyl azylVar, dlpw dlpwVar) {
        this.b = ffbrVar;
        this.c = azylVar;
        this.d = dlpwVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("JanitorJobStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return ((comc) this.c.a.get()).h().h(new emwl() { // from class: azyj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((cbfv) obj).c);
            }
        }, erpp.a).h(new emwl() { // from class: azyw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                long longValue = ((Long) azyx.a.e()).longValue();
                azyx azyxVar = azyx.this;
                final long epochMilli = azyxVar.d.f().toEpochMilli();
                if (l != null && l.longValue() != 0 && epochMilli < l.longValue() + longValue) {
                    return null;
                }
                ((comc) azyxVar.c.a.get()).j(new emwl() { // from class: azyf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cbfu cbfuVar = (cbfu) ((cbfv) obj2).toBuilder();
                        cbfuVar.copyOnWrite();
                        cbfv cbfvVar = (cbfv) cbfuVar.instance;
                        cbfvVar.b |= 1;
                        cbfvVar.c = epochMilli;
                        return (cbfv) cbfuVar.build();
                    }
                }).h(new emwl() { // from class: azyg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, erpp.a);
                ((cevh) ((cesd) azyxVar.b.b()).a.b()).f("run_analyze");
                ((cevh) ((cesd) azyxVar.b.b()).a.b()).a(ceyr.g("run_analyze", cetw.a));
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}

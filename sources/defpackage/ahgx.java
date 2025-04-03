package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgx implements csza {
    public static final cfva a = cfvl.h(cfvl.b, "super_sort_survey_site_id", "");
    public static final cfva b = cfvl.c(cfvl.b, "super_sort_frequency", 0.01d);
    public static final cfva c = cfvl.e(cfvl.b, "super_sort_trigger_days_since", 3);
    public final errl d;
    public final ffbr e;
    private final ffbr f;

    public ahgx(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.d = errlVar;
        this.f = ffbrVar;
        this.e = ffbrVar2;
    }

    @Override // defpackage.csza
    public final double a() {
        return ((Double) b.e()).doubleValue();
    }

    @Override // defpackage.csza
    public final elfl b() {
        return !aewg.h() ? elfo.e(false) : ((afar) this.f.b()).b().i(new eroh() { // from class: ahgw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(false);
                }
                final ahgx ahgxVar = ahgx.this;
                return ((ahik) ahgxVar.e.b()).b().i(new eroh() { // from class: ahgv
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return (aewg.h() && ((cxkc) obj2).c()) ? ((ahik) ahgx.this.e.b()).m(((Integer) ahgx.c.e()).intValue()) : elfo.e(false);
                    }
                }, ahgxVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.cszb
    public final eovb c() {
        return eovb.ORGANIZE_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.csza
    public final String d() {
        return (String) a.e();
    }
}

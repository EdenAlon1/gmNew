package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdwy extends ceut {
    public static final cskc a = cskc.g("BugleCms", "CmsBackFillBnrStateForFiMdWorkHandler");
    static final cfup b = cfvl.e(cfvl.b, "cms_back_fill_bnr_state_for_fi_md_max_attempts", 10);
    public final axkm c;
    public final akzt d;
    private final errl e;
    private final cbwj f;

    public cdwy(axkm axkmVar, errl errlVar, akzt akztVar, cbwj cbwjVar) {
        this.c = axkmVar;
        this.e = errlVar;
        this.d = akztVar;
        this.f = cbwjVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(((Integer) b.e()).intValue());
        l.b(cevc.WAKELOCK);
        l.f(poa.LINEAR);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsBackFillBnrStateForFiMdWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final int i = ((cetk) ceuwVar.a()).c;
        return this.f.b("CmsBackFillBnrStateForFiMdWorkHandler#processPendingWorkItemAsync", new Runnable() { // from class: cdwv
            /* JADX WARN: Type inference failed for: r2v2, types: [comc, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                cdwy cdwyVar = cdwy.this;
                try {
                    boolean ak = cdwyVar.c.ak();
                    axkm axkmVar = cdwyVar.c;
                    efbd.b();
                    boolean z = ((axez) axkmVar.e.get().l()).q;
                    if (ak && !z) {
                        cdwy.a.m("Performing back fill for the user");
                        cdwyVar.c.Z(true);
                        cdwyVar.c.S(axeu.ENABLED);
                        cdwyVar.d.c("Bugle.Cms.Backfill.Success.Counts");
                        return;
                    }
                    cdwy.a.m("Skip back fill for the user");
                } catch (eygu e) {
                    throw new IllegalStateException(e);
                }
            }
        }).h(new emwl() { // from class: cdww
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cdwy.a;
                return ceyt.i();
            }
        }, this.e).e(Throwable.class, new emwl() { // from class: cdwx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (i < ((Integer) cdwy.b.e()).intValue()) {
                    return ceyt.m();
                }
                cdwy cdwyVar = cdwy.this;
                cdwy.a.s("Exceeds max retry count, will not retry anymore", th);
                cdwyVar.d.c("Bugle.Cms.Backfill.Failure.Counts");
                return ceyt.k();
            }
        }, this.e);
    }
}

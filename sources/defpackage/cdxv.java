package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdxv {
    public static final entd a = entd.c("BugleCms");
    static final cfup b = cfvl.e(cfvl.b, "cms_set_feature_enabled_step_max_attempt", 50);
    private final crtz c;

    public cdxv(crtz crtzVar) {
        this.c = crtzVar;
    }

    public final elfl a(int i, final cdxp cdxpVar) {
        if (i > ((Integer) b.e()).intValue()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetFeatureEnabledOnServerStep", "doWork", 46, "CmsSetFeatureEnabledOnServerStep.java")).q("Set feature enabled reached max retry");
            return elfo.d(new cshb(csgx.NO_RETRY));
        }
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cdii.E, Integer.valueOf(i));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetFeatureEnabledOnServerStep", "doWork", 54, "CmsSetFeatureEnabledOnServerStep.java")).q("Doing status update on the server");
        return this.c.i().h(new emwl() { // from class: cdxu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) cdxv.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetFeatureEnabledOnServerStep", "doWork", 60, "CmsSetFeatureEnabledOnServerStep.java")).q("MultiDevice status updated on the server");
                cdxn cdxnVar = (cdxn) cdxp.this.toBuilder();
                cdxnVar.copyOnWrite();
                cdxp cdxpVar2 = (cdxp) cdxnVar.instance;
                cdxpVar2.d = 2;
                cdxpVar2.b |= 4;
                return (cdxp) cdxnVar.build();
            }
        }, erpp.a);
    }
}

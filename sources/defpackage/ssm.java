package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssm {
    private static final enru c = enru.c("com/google/android/apps/messaging/banner/eligibility/BannerEligibilityImpl");
    public final fgcm a = fgdm.a(ffem.a);
    public boolean b;

    public final void a(String str, ssn ssnVar) {
        ssnVar.getClass();
        ((enrr) c.h().h("com/google/android/apps/messaging/banner/eligibility/BannerEligibilityImpl", "setIneligible", 23, "BannerEligibilityImpl.kt")).D("Setting banner %s to ineligible because of %s", str, ssnVar);
        Map m = ffew.m((Map) this.a.c());
        m.put(str, ssnVar);
        this.a.f(ffew.l(m));
    }
}

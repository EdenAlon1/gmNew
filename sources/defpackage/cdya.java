package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdya implements cdwq {
    public static final entd a = entd.c("BugleCms");
    public final crue b;
    public final axkm c;
    private final errl d;
    private final errl e;

    /* compiled from: PG */
    public interface a {
        cdxv ck();
    }

    public cdya(errl errlVar, crue crueVar, axkm axkmVar, errl errlVar2) {
        this.d = errlVar;
        this.b = crueVar;
        this.c = axkmVar;
        this.e = errlVar2;
    }

    @Override // defpackage.cdws
    public final /* synthetic */ int a(Object obj) {
        return ((cdxp) obj).c;
    }

    @Override // defpackage.cdwq
    public final /* bridge */ /* synthetic */ elfl c(ceuw ceuwVar, Object obj, Object obj2) {
        final cdxp cdxpVar = (cdxp) obj2;
        return ((a) obj).ck().a(((cetk) ceuwVar.a()).c, cdxp.a).i(new eroh() { // from class: cdxx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj3) {
                return cdya.this.c.z(true);
            }
        }, this.e).h(new emwl() { // from class: cdxy
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                cdya.this.b.b();
                cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
                int i = cdxpVar.c;
                cdvwVar.copyOnWrite();
                cdvx cdvxVar = (cdvx) cdvwVar.instance;
                cdvxVar.b |= 1;
                cdvxVar.c = i;
                if (csgj.a()) {
                    csgm csgmVar = csgm.CMS_FEATURE_MULTI_DEVICE;
                    cdvwVar.copyOnWrite();
                    cdvx cdvxVar2 = (cdvx) cdvwVar.instance;
                    cdvxVar2.d = csgmVar.d;
                    cdvxVar2.b |= 2;
                }
                return ceyt.j(engw.r(ccan.a((cdvx) cdvwVar.build())));
            }
        }, this.d).e(fedn.class, new emwl() { // from class: cdxz
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                ((ensz) ((ensz) ((ensz) cdya.a.j()).g((fedn) obj3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetFeatureEnabledOnServerWorkItemProcessor", "processCmsWorkItemAsync", 87, "CmsSetFeatureEnabledOnServerWorkItemProcessor.java")).q("CMS Server failed when setting feature_enabled_status");
                return ceyt.m();
            }
        }, this.e);
    }
}

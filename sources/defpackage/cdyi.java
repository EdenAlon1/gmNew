package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdyi implements cdwq {
    public static final entd a = entd.c("BugleCms");
    public final errl b;
    public final cfyt c;
    public final asjt d;
    private final axkm e;

    /* compiled from: PG */
    public interface a {
        crtz eU();
    }

    public cdyi(axkm axkmVar, cfyt cfytVar, asjt asjtVar, errl errlVar) {
        this.e = axkmVar;
        this.c = cfytVar;
        this.d = asjtVar;
        this.b = errlVar;
    }

    @Override // defpackage.cdws
    public final /* synthetic */ int a(Object obj) {
        return ((cdvx) obj).c;
    }

    @Override // defpackage.cdwq
    public final /* bridge */ /* synthetic */ elfl c(ceuw ceuwVar, Object obj, Object obj2) {
        final a aVar = (a) obj;
        return this.e.n.a().i(new eroh() { // from class: cdyf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj3) {
                if (!((Boolean) obj3).booleanValue()) {
                    ((ensz) ((ensz) cdyi.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetInitialSyncStatusOnServerWorkItemProcessor", "processCmsWorkItemAsync", 76, "CmsSetInitialSyncStatusOnServerWorkItemProcessor.java")).q("Update InitialSyncStatus not performed because no cms feature is enabled on this device");
                    return elfo.e(ceyt.i());
                }
                return aVar.eU().g().h(new emwl() { // from class: cdyd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj4) {
                        entd entdVar = cdyi.a;
                        return ceyt.i();
                    }
                }, erpp.a).e(baan.class, new emwl() { // from class: cdye
                    @Override // defpackage.emwl
                    public final Object apply(Object obj4) {
                        ((ensz) ((ensz) cdyi.a.n().g((baan) obj4)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetInitialSyncStatusOnServerWorkItemProcessor", "setInitialSyncStatusOnServer", 124, "CmsSetInitialSyncStatusOnServerWorkItemProcessor.java")).q("Linked account removed when update InitialSyncStatus");
                        return ceyt.k();
                    }
                }, cdyi.this.b);
            }
        }, this.b).e(fedn.class, new emwl() { // from class: cdyg
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                fedn fednVar = (fedn) obj3;
                if (cshg.a(fednVar.a)) {
                    return ceyt.m();
                }
                cdyi cdyiVar = cdyi.this;
                ((ensz) ((ensz) ((ensz) cdyi.a.j()).g(fednVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetInitialSyncStatusOnServerWorkItemProcessor", "processCmsWorkItemAsync", '[', "CmsSetInitialSyncStatusOnServerWorkItemProcessor.java")).q("Unable to update InitialSyncStatus");
                if (cdyiVar.d.a()) {
                    crze.c("Uncaught exception", fednVar);
                } else {
                    axnw.h(cdyiVar.c.b(fednVar));
                }
                return ceyt.k();
            }
        }, this.b).e(Exception.class, new emwl() { // from class: cdyh
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                Exception exc = (Exception) obj3;
                cdyi cdyiVar = cdyi.this;
                if (cdyiVar.d.a()) {
                    crze.b("Uncaught exception", exc);
                } else {
                    axnw.h(cdyiVar.c.b(exc));
                }
                return ceyt.m();
            }
        }, this.b);
    }
}

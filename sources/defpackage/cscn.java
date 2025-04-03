package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cscn {
    public static final entd a = entd.c("BugleCmsPrimaryDevice");
    public final cins b;
    public final crue c;
    public final eisx d;
    public final axkm e;
    public final errl f;

    public cscn(cins cinsVar, crue crueVar, axkm axkmVar, eisx eisxVar, errl errlVar) {
        this.b = cinsVar;
        this.c = crueVar;
        this.e = axkmVar;
        this.d = eisxVar;
        this.f = errlVar;
    }

    public final elfl a(final int i) {
        return this.e.k().i(new eroh() { // from class: cscm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl d;
                final cscn cscnVar = cscn.this;
                final axez axezVar = (axez) obj;
                if (csgj.a()) {
                    axkl axklVar = cscnVar.e.n;
                    if (!axkl.g(axezVar)) {
                        ((ensz) ((ensz) cscn.a.h()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceEnforcement", "disableCmsFeature", 64, "CmsPrimaryDeviceEnforcement.java")).q("CMS feature is already off");
                        return elfo.e(true);
                    }
                    ((ensz) ((ensz) cscn.a.h()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceEnforcement", "disableBackupAndRestore", 113, "CmsPrimaryDeviceEnforcement.java")).q("Turning off CMS feature to enforce primary device");
                    d = cscnVar.c.c(cscnVar.d, 2);
                } else {
                    if (!axezVar.e) {
                        ((ensz) ((ensz) cscn.a.h()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceEnforcement", "disableCmsFeature", 74, "CmsPrimaryDeviceEnforcement.java")).q("MultiDevice is already off");
                        return elfo.e(true);
                    }
                    ((ensz) ((ensz) cscn.a.h()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceEnforcement", "disableMultiDevice", 105, "CmsPrimaryDeviceEnforcement.java")).q("Turning off MultiDevice to enforce primary device");
                    d = cscnVar.c.d(cscnVar.d, 2, 2);
                }
                final int i2 = i;
                return d.h(new emwl() { // from class: cscl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cscn cscnVar2 = cscn.this;
                        csfz csfzVar = csfz.MULTI_DEVICE;
                        if (csgj.a()) {
                            axeu b = axeu.b(axezVar.l);
                            if (b == null) {
                                b = axeu.UNSPECIFIED_STATUS;
                            }
                            axkl axklVar2 = cscnVar2.e.n;
                            csfzVar = axkl.f(b) ? csfz.MULTI_DEVICE : csfz.BACKUP_AND_RESTORE;
                        }
                        cscnVar2.b.L(csfzVar, i2);
                        return true;
                    }
                }, cscnVar.f);
            }
        }, this.f);
    }
}

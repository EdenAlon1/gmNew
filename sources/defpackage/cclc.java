package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cclc implements ccla {
    public static final entd a = entd.c("BugleCms");
    public final ffbr b;
    private final bzgd c;
    private final chep d;
    private final crzd e;

    public cclc(ffbr ffbrVar, bzgd bzgdVar, chep chepVar, crzd crzdVar) {
        this.b = ffbrVar;
        this.c = bzgdVar;
        this.d = chepVar;
        this.e = crzdVar;
    }

    public final void a() {
        for (fcek fcekVar : this.c.o()) {
            try {
                elfl.g(this.d.a(new chyo(this.e.d(fcekVar), fcekVar))).e(RuntimeException.class, new emwl() { // from class: cclb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((ensz) ((ensz) ((ensz) cclc.a.i()).g((RuntimeException) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "updateCloudStoreBackupKeys", 92, "CmsKeyManagerImpl.java")).q("Failed to set backup key");
                        return false;
                    }
                }, erpp.a);
            } catch (GeneralSecurityException e) {
                ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "updateCloudStoreBackupKeys", 'a', "CmsKeyManagerImpl.java")).q("Failed to set backup key");
            }
        }
    }
}

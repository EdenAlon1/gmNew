package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvoc implements dvft {
    private static final entd a = entd.c("GnpSdk");
    private final dvmv b;

    public dvoc(dvmv dvmvVar) {
        this.b = dvmvVar;
    }

    @Override // defpackage.dvft
    public final long a() {
        return 30000L;
    }

    @Override // defpackage.dvft
    public final long b() {
        return fdnu.a.get().b();
    }

    @Override // defpackage.dvft
    public final ListenableFuture c() {
        ((ensz) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageCleanupJob", "executeJob", 28, "StorageCleanupJob.java")).q("Executing StorageCleanupJob");
        dvor dvorVar = (dvor) this.b;
        long epochMilli = dvorVar.e.f().minusMillis(fdnu.a.get().a()).toEpochMilli();
        ((ensz) dvor.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 53, "StorageUtilitiesImpl.java")).t("Storage cleanup started. Deleting events before %s", Instant.ofEpochMilli(epochMilli));
        eakf.a(dvorVar.b.a(epochMilli), new emxs() { // from class: dvom
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ((ensz) dvor.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 58, "StorageUtilitiesImpl.java")).t("Deleted %d Clearcut events", (Integer) obj);
            }
        }, null);
        eakf.a(dvorVar.c.a(epochMilli), new emxs() { // from class: dvon
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ((ensz) dvor.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 62, "StorageUtilitiesImpl.java")).t("Deleted %d Visual Element events", (Integer) obj);
            }
        }, null);
        List a2 = dvorVar.d.a();
        eakf.a(dvorVar.c.b(a2), new emxs() { // from class: dvoo
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ((ensz) dvor.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 71, "StorageUtilitiesImpl.java")).t("Deleted %d Visual Elements events for accounts not on device", (Integer) obj);
            }
        }, null);
        eakf.a(dvorVar.b.b(a2), new emxs() { // from class: dvop
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ((ensz) dvor.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 78, "StorageUtilitiesImpl.java")).t("Deleted %d Clearcut events for accounts not on device", (Integer) obj);
            }
        }, null);
        ArrayList arrayList = new ArrayList(1);
        enqu listIterator = ((enpx) dvorVar.f).listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(((dvvh) listIterator.next()).c());
        }
        erqt.a(arrayList).a(new Callable() { // from class: dvoq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((ensz) dvor.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 91, "StorageUtilitiesImpl.java")).q("Cleaned up all plugins");
                return null;
            }
        }, erpp.a);
        return erqt.i(null);
    }

    @Override // defpackage.dvft
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dvft
    public final boolean e() {
        return false;
    }

    @Override // defpackage.dvft
    public final int f() {
        return 1;
    }

    @Override // defpackage.dvft
    public final int g() {
        return 2;
    }
}

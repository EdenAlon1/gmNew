package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvpq implements dvft {
    public static final entd a = entd.c("GnpSdk");
    public final Context b;
    public final dvpl c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final errl h;

    public dvpq(ffbr ffbrVar, Context context, dvpl dvplVar, errl errlVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.f = ffbrVar;
        this.b = context;
        this.c = dvplVar;
        this.h = errlVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.g = ffbrVar4;
    }

    @Override // defpackage.dvft
    public final long a() {
        return ((Long) this.e.b()).longValue();
    }

    @Override // defpackage.dvft
    public final long b() {
        return ((Long) this.d.b()).longValue();
    }

    @Override // defpackage.dvft
    public final ListenableFuture c() {
        entd entdVar = a;
        ((ensz) entdVar.o().h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/PeriodicSyncJob", "executeJob", 62, "PeriodicSyncJob.java")).q("Executing PeriodicSyncJob");
        if (((Boolean) this.f.b()).booleanValue()) {
            return erny.g(this.h.submit(new Callable() { // from class: dvpo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    try {
                        dhoz.a(dvpq.this.b);
                        return true;
                    } catch (dfqc | dfqd e) {
                        ((ensz) ((ensz) ((ensz) dvpq.a.i()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/PeriodicSyncJob", "executeJob", 'M', "PeriodicSyncJob.java")).q("Failed to install security provider, GrowthKit sync can't run.");
                        return false;
                    }
                }
            }), eldl.d(new eroh() { // from class: dvpp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return erqt.i(null);
                    }
                    dvpq dvpqVar = dvpq.this;
                    ((ensz) dvpq.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/PeriodicSyncJob", "executeJob", 90, "PeriodicSyncJob.java")).q("PeriodicSyncJob triggering a sync for all accounts");
                    return dvpqVar.c.a(10);
                }
            }), erpp.a);
        }
        ((ensz) entdVar.o().h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/PeriodicSyncJob", "executeJob", 65, "PeriodicSyncJob.java")).q("GrowthKit is disabled, aborting PeriodicSyncJob");
        return erqt.i(null);
    }

    @Override // defpackage.dvft
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dvft
    public final boolean e() {
        return ((Boolean) this.g.b()).booleanValue();
    }

    @Override // defpackage.dvft
    public final int f() {
        return 2;
    }

    @Override // defpackage.dvft
    public final int g() {
        return 1;
    }
}

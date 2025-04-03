package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvpn implements dvft {
    public static final entd a = entd.c("GnpSdk");
    public final Context b;
    public final dvpl c;
    public final dlpw d;
    private final ffbr e;
    private final errl f;
    private final fazb g;
    private final ffbr h;

    public dvpn(ffbr ffbrVar, Context context, dvpl dvplVar, errl errlVar, fazb fazbVar, dlpw dlpwVar, ffbr ffbrVar2) {
        this.e = ffbrVar;
        this.b = context;
        this.c = dvplVar;
        this.f = errlVar;
        this.g = fazbVar;
        this.d = dlpwVar;
        this.h = ffbrVar2;
    }

    @Override // defpackage.dvft
    public final long a() {
        return ((Long) this.h.b()).longValue();
    }

    @Override // defpackage.dvft
    public final long b() {
        return 0L;
    }

    @Override // defpackage.dvft
    public final ListenableFuture c() {
        entd entdVar = a;
        ((ensz) entdVar.o().h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/OneoffSyncJob", "executeJob", 62, "OneoffSyncJob.java")).q("Executing OneoffSyncJob");
        if (((Boolean) this.e.b()).booleanValue()) {
            return erny.g((ListenableFuture) this.g.b(), new eroh() { // from class: dvpm
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    long j = ((SharedPreferences) obj).getLong("LAST_SYNC_TIME", 0L);
                    dvpn dvpnVar = dvpn.this;
                    long epochMilli = dvpnVar.d.f().toEpochMilli();
                    long a2 = fdoq.a.get().a();
                    if (j != 0 && epochMilli - j < a2) {
                        ((ensz) dvpn.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/OneoffSyncJob", "executeJob", 79, "OneoffSyncJob.java")).J("Skipping sync on startup. now=%d, last sync=%d, sync at most=%d", Long.valueOf(epochMilli), Long.valueOf(j), Long.valueOf(a2));
                        return erqt.i(null);
                    }
                    try {
                        dhoz.a(dvpnVar.b);
                        ((ensz) dvpn.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/OneoffSyncJob", "executeJob", 94, "OneoffSyncJob.java")).q("OneoffSyncJob triggering a sync for all accounts");
                        return dvpnVar.c.a(11);
                    } catch (dfqc | dfqd e) {
                        ((ensz) ((ensz) ((ensz) dvpn.a.i()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/OneoffSyncJob", "executeJob", 'Y', "OneoffSyncJob.java")).q("Failed to install security provider, GrowthKit sync can't run.");
                        return erqt.i(null);
                    }
                }
            }, this.f);
        }
        ((ensz) entdVar.o().h("com/google/android/libraries/internal/growth/growthkit/internal/sync/impl/OneoffSyncJob", "executeJob", 65, "OneoffSyncJob.java")).q("GrowthKit is disabled, aborting OneoffSyncJob");
        return erqt.i(null);
    }

    @Override // defpackage.dvft
    public final boolean d() {
        return false;
    }

    @Override // defpackage.dvft
    public final boolean e() {
        return true;
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

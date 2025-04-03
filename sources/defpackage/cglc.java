package defpackage;

import android.util.Pair;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cglc extends ceut implements dyiy {
    public final cskc a = cskc.g("Lighter", "LighterIncrementalSyncHandler");
    public final ffbr b;
    public final ffbr c;
    public final amtn d;
    public final ecrj e;
    private final ffbr f;
    private final errl g;

    public cglc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, amtn amtnVar, ecrj ecrjVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = ffbrVar3;
        this.g = errlVar;
        this.d = amtnVar;
        this.e = ecrjVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("LighterIncrementalSyncHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cgle.a.getParserForType();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cgle cgleVar = (cgle) eyhsVar;
        int i = cgleVar.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            this.a.r("Cannot sync without gaia_email and sync_end_timestamp");
            return elfo.e(ceyt.i());
        }
        final elfl a = ((cgjp) this.f.b()).a(cgleVar.c);
        final elfl b = ((cgkv) this.c.b()).b();
        return elfo.k(a, b).a(new Callable() { // from class: cglb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dzja dzjaVar;
                long j;
                dyiz f;
                Optional optional = (Optional) erqt.q(a);
                long longValue = ((Long) erqt.q(b)).longValue();
                boolean isEmpty = optional.isEmpty();
                cglc cglcVar = cglc.this;
                cgle cgleVar2 = cgleVar;
                if (isEmpty) {
                    cglcVar.a.r("Incremental sync not started because the account is not registered in Lighter");
                    return ceyt.i();
                }
                ecri d = cglcVar.e.d();
                boolean z = true;
                try {
                    ((cgkv) cglcVar.c.b()).d(true);
                    dzjaVar = (dzja) optional.get();
                    j = cgleVar2.d;
                    cglcVar.a.m("Start incremental sync");
                    f = ((dygx) cglcVar.b.b()).f();
                    dzhl c = dypj.c(dzjaVar);
                    c.f(711);
                    ((dypj) f).c.b(c.a());
                } catch (RuntimeException unused) {
                    cglcVar.a.r("Sync interrupted because of exception");
                }
                if (longValue < 0 || j < 0 || j < longValue) {
                    dyhr.f(dypj.a, "Return immediately because input parameters are invalid");
                    dyyt dyytVar = ((dypj) f).c;
                    dzhl c2 = dypj.c(dzjaVar);
                    c2.f(712);
                    dyytVar.b(c2.a());
                    throw new IllegalArgumentException();
                }
                engw z2 = ((dypj) f).b.b(dzjaVar).z(longValue, j);
                engw y = ((dypj) f).b.b(dzjaVar).y(longValue, j);
                int i2 = 0;
                int i3 = 0;
                while (i2 < z2.size() && i3 < y.size()) {
                    if (((dzpk) z2.get(i2)).d() < ((Long) ((Pair) y.get(i3)).second).longValue()) {
                        ((dypj) f).b(dzjaVar, cglcVar, (dzpk) z2.get(i2));
                        i2++;
                    } else {
                        ((dypj) f).a(dzjaVar, cglcVar, (Pair) y.get(i3));
                        i3++;
                    }
                }
                while (i2 < z2.size()) {
                    ((dypj) f).b(dzjaVar, cglcVar, (dzpk) z2.get(i2));
                    i2++;
                }
                while (i3 < y.size()) {
                    ((dypj) f).a(dzjaVar, cglcVar, (Pair) y.get(i3));
                    i3++;
                }
                cglcVar.a.m(a.f(i2 + i3, "Sync completed: ", " conversations are synced"));
                z = false;
                ((cgkv) cglcVar.c.b()).d(false);
                cglcVar.e.f(d, new ecda("IncrementalSyncExecutionTime"), null, z ? ecrh.ERROR : ecrh.SUCCESS);
                return ceyt.i();
            }
        }, this.g);
    }
}

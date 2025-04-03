package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akwo implements akxg, echu, ecow {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public akwo(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = ffbrVar;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar2;
    }

    @Override // defpackage.ecow
    public final emxc a() {
        return emxc.j(b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffbr, defpackage.ffbq
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final fgmh b() {
        fgmc fgmcVar;
        fgmg fgmgVar = (fgmg) fgmh.a.createBuilder();
        eyfw eyfwVar = fglu.b;
        ensk e = a.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider", "buildMetricExtension", 106, "BuglePrimesMetricExtensionProvider.java")).q("Building primes metric with custom extension for all sims.");
        fglr fglrVar = (fglr) fglu.a.createBuilder();
        if (((ctud) this.c.b()).r() && ((ctud) this.c.b()).l()) {
            for (ctwi ctwiVar : ((ctwb) this.d.b()).m()) {
                String u = ctwiVar.u();
                String q = ctwiVar.q();
                fgmb fgmbVar = (fgmb) fgmc.a.createBuilder();
                if (u == null) {
                    u = "UNKNOWN";
                }
                fgmbVar.copyOnWrite();
                fgmc fgmcVar2 = (fgmc) fgmbVar.instance;
                fgmcVar2.b |= 1;
                fgmcVar2.c = u;
                if (q == null) {
                    q = "UNKNOWN";
                }
                fgmbVar.copyOnWrite();
                fgmc fgmcVar3 = (fgmc) fgmbVar.instance;
                fgmcVar3.b |= 2;
                fgmcVar3.d = q;
                int a2 = ctwiVar.a();
                Optional i = ((cort) this.b.b()).i(a2);
                if (i.isEmpty()) {
                    ensk j = a.j();
                    j.Y(ente.a, "Bugle");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(csux.t, Integer.valueOf(a2));
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider", "buildSimInfo", 138, "BuglePrimesMetricExtensionProvider.java")).q("No subscription info to log for Primes crash metrics");
                    fgmcVar = (fgmc) fgmbVar.build();
                } else {
                    cosz coszVar = (cosz) i.get();
                    eqwf eqwfVar = ((djrv) this.e.b()).b(coszVar.c).a;
                    String str = coszVar.k;
                    fgmbVar.copyOnWrite();
                    fgmc fgmcVar4 = (fgmc) fgmbVar.instance;
                    str.getClass();
                    fgmcVar4.b |= 8;
                    fgmcVar4.f = str;
                    String str2 = coszVar.l;
                    fgmbVar.copyOnWrite();
                    fgmc fgmcVar5 = (fgmc) fgmbVar.instance;
                    str2.getClass();
                    fgmcVar5.b |= 16;
                    fgmcVar5.g = str2;
                    int i2 = true == coszVar.o ? 2 : 1;
                    fgmbVar.copyOnWrite();
                    fgmc fgmcVar6 = (fgmc) fgmbVar.instance;
                    fgmcVar6.e = i2 - 1;
                    fgmcVar6.b |= 4;
                    fgmbVar.copyOnWrite();
                    fgmc fgmcVar7 = (fgmc) fgmbVar.instance;
                    fgmcVar7.h = eqwfVar.N;
                    fgmcVar7.b |= 32;
                    fgmcVar = (fgmc) fgmbVar.build();
                }
                fglrVar.copyOnWrite();
                fglu fgluVar = (fglu) fglrVar.instance;
                fgmcVar.getClass();
                eygr eygrVar = fgluVar.j;
                if (!eygrVar.c()) {
                    fgluVar.j = eyfy.mutableCopy(eygrVar);
                }
                fgluVar.j.add(fgmcVar);
            }
        }
        fgmgVar.e(eyfwVar, (fglu) fglrVar.build());
        return (fgmh) fgmgVar.build();
    }

    @Override // defpackage.echu
    public final fgmh d() {
        return b();
    }
}

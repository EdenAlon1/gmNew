package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dego implements cvhr {
    public final comc a;
    public final cqoh b;
    private final ffbr c;
    private final ffsk d;

    public dego(ffbr ffbrVar, comc comcVar, ffsk ffskVar, ffsk ffskVar2, cqoh cqohVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        cqohVar.getClass();
        this.c = ffbrVar;
        this.a = comcVar;
        this.d = ffskVar;
        this.b = cqohVar;
    }

    @Override // defpackage.cvhr
    public final elfl a() {
        elfl c;
        ekzz f = eleg.f("PairedWatchNodeDataServiceImpl#markDeviceOnline");
        try {
            c = axol.c(this.d, ffhe.a, ffsm.a, new degn(this, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.cvhr
    public final boolean b() {
        ekzz f = eleg.f("PairedWatchNodeDataServiceImpl#isRecentlyOnlineSync");
        try {
            boolean c = c((degi) this.a.l());
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    public final boolean c(degi degiVar) {
        if ((degiVar.b & 1) != 0) {
            Object b = this.c.b();
            b.getClass();
            Duration ofDays = Duration.ofDays(((Number) b).longValue());
            eyja eyjaVar = degiVar.c;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            eyjaVar.getClass();
            if (ofDays.compareTo(Duration.between(eykn.d(eyjaVar), this.b.f())) > 0) {
                return true;
            }
        }
        return false;
    }
}

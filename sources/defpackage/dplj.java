package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dplj implements dplw {
    private final ffjn a;
    private final ffji b;
    private final ffji c;
    private final dplc d;
    private final Duration e;
    private final ffji f;

    public dplj() {
        this(null, null, null, null, null, 63);
    }

    @Override // defpackage.dplw
    public final Duration a() {
        return this.e;
    }

    @Override // defpackage.dplw
    public final ffji b() {
        return this.b;
    }

    @Override // defpackage.dplw
    public final ffji c() {
        return this.f;
    }

    @Override // defpackage.dplw
    public final ffjn d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dplj)) {
            return false;
        }
        dplj dpljVar = (dplj) obj;
        return ffkj.e(this.a, dpljVar.a) && ffkj.e(this.b, dpljVar.b) && ffkj.e(this.c, dpljVar.c) && ffkj.e(this.d, dpljVar.d) && ffkj.e(this.e, dpljVar.e) && ffkj.e(this.f, dpljVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Closed(bind=" + this.a + ", onCancel=" + this.b + ", onSwitchCamera=" + this.c + ", recordingActions=" + this.d + ", maxRecordingDuration=" + this.e + ", onLifecycleOnPause=" + this.f + ")";
    }

    public /* synthetic */ dplj(ffjn ffjnVar, ffji ffjiVar, ffji ffjiVar2, dplc dplcVar, ffji ffjiVar3, int i) {
        ffjnVar = (i & 1) != 0 ? new dplf(null) : ffjnVar;
        ffjiVar = (i & 2) != 0 ? new dplg(null) : ffjiVar;
        ffjiVar2 = (i & 4) != 0 ? new ffji() { // from class: dple
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((lkr) obj).getClass();
                return ffcu.a;
            }
        } : ffjiVar2;
        dplcVar = (i & 8) != 0 ? new dplh() : dplcVar;
        Duration g = (i & 16) != 0 ? ernk.g(3) : null;
        ffjiVar3 = (i & 32) != 0 ? new dpli(null) : ffjiVar3;
        ffjnVar.getClass();
        ffjiVar.getClass();
        ffjiVar2.getClass();
        dplcVar.getClass();
        g.getClass();
        ffjiVar3.getClass();
        this.a = ffjnVar;
        this.b = ffjiVar;
        this.c = ffjiVar2;
        this.d = dplcVar;
        this.e = g;
        this.f = ffjiVar3;
    }
}

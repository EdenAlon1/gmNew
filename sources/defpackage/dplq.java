package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dplq implements dplw {
    public final ffji a;
    public final dplc b;
    public final Integer c;
    private final ffjn d;
    private final ffji e;
    private final Duration f;
    private final ffji g;

    public dplq() {
        this(null, null, null, null, null, null, 127);
    }

    @Override // defpackage.dplw
    public final Duration a() {
        return this.f;
    }

    @Override // defpackage.dplw
    public final ffji b() {
        return this.e;
    }

    @Override // defpackage.dplw
    public final ffji c() {
        return this.g;
    }

    @Override // defpackage.dplw
    public final ffjn d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dplq)) {
            return false;
        }
        dplq dplqVar = (dplq) obj;
        return ffkj.e(this.d, dplqVar.d) && ffkj.e(this.e, dplqVar.e) && ffkj.e(this.a, dplqVar.a) && ffkj.e(this.b, dplqVar.b) && ffkj.e(this.f, dplqVar.f) && ffkj.e(this.g, dplqVar.g) && ffkj.e(this.c, dplqVar.c);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        Integer num = this.c;
        return (hashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PreRecording(bind=" + this.d + ", onCancel=" + this.e + ", onSwitchCamera=" + this.a + ", recordingActions=" + this.b + ", maxRecordingDuration=" + this.f + ", onLifecycleOnPause=" + this.g + ", countdownValue=" + this.c + ")";
    }

    public /* synthetic */ dplq(ffjn ffjnVar, ffji ffjiVar, ffji ffjiVar2, dplc dplcVar, ffji ffjiVar3, Integer num, int i) {
        ffjnVar = (i & 1) != 0 ? new dplm(null) : ffjnVar;
        ffjiVar = (i & 2) != 0 ? new dpln(null) : ffjiVar;
        ffjiVar2 = (i & 4) != 0 ? new ffji() { // from class: dpll
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((lkr) obj).getClass();
                return ffcu.a;
            }
        } : ffjiVar2;
        dplcVar = (i & 8) != 0 ? new dplo() : dplcVar;
        Duration g = (i & 16) != 0 ? ernk.g(3) : null;
        ffjiVar3 = (i & 32) != 0 ? new dplp(null) : ffjiVar3;
        num = (i & 64) != 0 ? null : num;
        ffjnVar.getClass();
        ffjiVar.getClass();
        ffjiVar2.getClass();
        dplcVar.getClass();
        g.getClass();
        ffjiVar3.getClass();
        this.d = ffjnVar;
        this.e = ffjiVar;
        this.a = ffjiVar2;
        this.b = dplcVar;
        this.f = g;
        this.g = ffjiVar3;
        this.c = num;
    }
}

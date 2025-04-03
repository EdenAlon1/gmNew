package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dplv implements dplw {
    private final ffjn a;
    private final ffji b;
    private final dplc c;
    private final Duration d;
    private final ffji e;

    public dplv(ffjn ffjnVar, ffji ffjiVar, dplc dplcVar, Duration duration, ffji ffjiVar2) {
        this.a = ffjnVar;
        this.b = ffjiVar;
        this.c = dplcVar;
        this.d = duration;
        this.e = ffjiVar2;
    }

    @Override // defpackage.dplw
    public final Duration a() {
        return this.d;
    }

    @Override // defpackage.dplw
    public final ffji b() {
        return this.b;
    }

    @Override // defpackage.dplw
    public final ffji c() {
        return this.e;
    }

    @Override // defpackage.dplw
    public final ffjn d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dplv)) {
            return false;
        }
        dplv dplvVar = (dplv) obj;
        return ffkj.e(this.a, dplvVar.a) && ffkj.e(this.b, dplvVar.b) && ffkj.e(this.c, dplvVar.c) && ffkj.e(this.d, dplvVar.d) && ffkj.e(this.e, dplvVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Recording(bind=" + this.a + ", onCancel=" + this.b + ", recordingActions=" + this.c + ", maxRecordingDuration=" + this.d + ", onLifecycleOnPause=" + this.e + ")";
    }

    public dplv() {
        this(new dplr(null), new dpls(null), new dplt(), ernk.g(3), new dplu(null));
    }
}

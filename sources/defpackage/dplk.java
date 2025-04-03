package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dplk implements dplw {
    public final dplc a;
    public final drni b;
    public final boolean c;
    private final ffjn d;
    private final ffji e;
    private final Duration f;
    private final ffji g;

    public dplk(ffjn ffjnVar, ffji ffjiVar, dplc dplcVar, Duration duration, ffji ffjiVar2, drni drniVar, boolean z) {
        this.d = ffjnVar;
        this.e = ffjiVar;
        this.a = dplcVar;
        this.f = duration;
        this.g = ffjiVar2;
        this.b = drniVar;
        this.c = z;
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
        if (!(obj instanceof dplk)) {
            return false;
        }
        dplk dplkVar = (dplk) obj;
        return ffkj.e(this.d, dplkVar.d) && ffkj.e(this.e, dplkVar.e) && ffkj.e(this.a, dplkVar.a) && ffkj.e(this.f, dplkVar.f) && ffkj.e(this.g, dplkVar.g) && ffkj.e(this.b, dplkVar.b) && this.c == dplkVar.c;
    }

    public final int hashCode() {
        return (((((((((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "Playback(bind=" + this.d + ", onCancel=" + this.e + ", recordingActions=" + this.a + ", maxRecordingDuration=" + this.f + ", onLifecycleOnPause=" + this.g + ", capturedMedia=" + this.b + ", enablePopupCameraPlaybackBottomMarginFix=" + this.c + ")";
    }
}

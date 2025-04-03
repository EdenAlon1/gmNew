package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqo {
    public final drqm a;
    public final Duration b;
    public final atl c;
    public final Duration d;
    public final int e;
    public final dpvy f;
    public final dpqn g;

    public /* synthetic */ dpqo(drqm drqmVar, atl atlVar, Duration duration, int i, dpvy dpvyVar, dpqn dpqnVar, int i2) {
        Duration g = (i2 & 2) != 0 ? ernk.g(30) : null;
        atlVar = (i2 & 4) != 0 ? atl.b : atlVar;
        duration = (i2 & 8) != 0 ? ernk.g(3) : duration;
        i = (i2 & 16) != 0 ? 20 : i;
        dpvyVar = (i2 & 32) != 0 ? null : dpvyVar;
        g.getClass();
        atlVar.getClass();
        duration.getClass();
        this.a = drqmVar;
        this.b = g;
        this.c = atlVar;
        this.d = duration;
        this.e = i;
        this.f = dpvyVar;
        this.g = dpqnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpqo)) {
            return false;
        }
        dpqo dpqoVar = (dpqo) obj;
        return ffkj.e(this.a, dpqoVar.a) && ffkj.e(this.b, dpqoVar.b) && ffkj.e(this.c, dpqoVar.c) && ffkj.e(this.d, dpqoVar.d) && this.e == dpqoVar.e && ffkj.e(this.f, dpqoVar.f) && ffkj.e(this.g, dpqoVar.g);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        dpvy dpvyVar = this.f;
        return (((((hashCode * 31) + this.e) * 31) + (dpvyVar == null ? 0 : dpvyVar.hashCode())) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "CameraManagerConfiguration(outputFileProvider=" + this.a + ", maxVideoRecordingDuration=" + this.b + ", cameraSelector=" + this.c + ", maxGifRecordingDuration=" + this.d + ", gifRecordingQuality=" + this.e + ", cameraEffectsConfiguration=" + this.f + ", flags=" + this.g + ")";
    }
}

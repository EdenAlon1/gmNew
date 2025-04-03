package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfo {
    public final int a;
    public final int b;
    public final Duration c;
    public final Duration d;
    public final ffji e;
    private final int f;

    public dpfo() {
        this(0, 0, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpfo)) {
            return false;
        }
        dpfo dpfoVar = (dpfo) obj;
        if (this.a != dpfoVar.a || this.b != dpfoVar.b) {
            return false;
        }
        int i = dpfoVar.f;
        return ffkj.e(this.c, dpfoVar.c) && ffkj.e(this.d, dpfoVar.d) && ffkj.e(this.e, dpfoVar.e);
    }

    public final int hashCode() {
        int hashCode = (((this.a * 31) + this.b) * 961) + this.c.hashCode();
        Duration duration = this.d;
        return (((hashCode * 31) + (duration == null ? 0 : duration.hashCode())) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MicrophoneAudioSourceConfiguration(sampleRate=" + this.a + ", channelCount=" + this.b + ", outputBufferCapacity=0, outputTimeout=" + this.c + ", maxDuration=" + this.d + ", onMaxDurationReached=" + this.e + ")";
    }

    public /* synthetic */ dpfo(int i, int i2, Duration duration, ffji ffjiVar, int i3) {
        Duration g = (i3 & 8) != 0 ? ernk.g(1) : null;
        duration = (i3 & 16) != 0 ? null : duration;
        ffjiVar = (i3 & 32) != 0 ? new dpfn(null) : ffjiVar;
        int i4 = i2 | (((i3 & 2) != 0 ? 0 : 1) ^ 1);
        i = 1 == (i3 & 1) ? 44100 : i;
        g.getClass();
        ffjiVar.getClass();
        this.a = i;
        this.b = i4;
        this.f = 0;
        this.c = g;
        this.d = duration;
        this.e = ffjiVar;
    }
}

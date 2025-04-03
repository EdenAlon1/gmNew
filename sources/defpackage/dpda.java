package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpda {
    public final fgcq a;
    public final int b;
    public final int c;
    public final Duration d;

    public dpda(fgcq fgcqVar, int i, int i2, Duration duration) {
        this.a = fgcqVar;
        this.b = i;
        this.c = i2;
        this.d = duration;
        if (ffkj.e(duration, Duration.ZERO)) {
            throw new IllegalArgumentException("Cannot process window duration of 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpda)) {
            return false;
        }
        dpda dpdaVar = (dpda) obj;
        return ffkj.e(this.a, dpdaVar.a) && this.b == dpdaVar.b && this.c == dpdaVar.c && ffkj.e(this.d, dpdaVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AudioLevelProcessorConfiguration(inputFlow=" + this.a + ", sampleRate=" + this.b + ", channelCount=" + this.c + ", windowDuration=" + this.d + ")";
    }
}

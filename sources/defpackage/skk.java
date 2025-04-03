package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skk {
    public final int a;
    public final int b;
    public final Duration c;
    public final String d;

    public skk(int i, int i2, Duration duration, String str) {
        this.a = i;
        this.b = i2;
        this.c = duration;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skk)) {
            return false;
        }
        skk skkVar = (skk) obj;
        return this.a == skkVar.a && this.b == skkVar.b && ffkj.e(this.c, skkVar.c) && ffkj.e(this.d, skkVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AudioInfo(samplingRateHz=" + this.a + ", channelCount=" + this.b + ", audioDuration=" + this.c + ", codec=" + this.d + ")";
    }
}

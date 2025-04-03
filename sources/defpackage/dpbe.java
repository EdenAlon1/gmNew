package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbe {
    public final Uri a;
    public final eepm b;
    public final int c;
    public final int e;
    public final Integer f;
    public final int d = 1;
    private final int g = 2;

    public dpbe(Uri uri, eepm eepmVar, int i, int i2, Integer num) {
        this.a = uri;
        this.b = eepmVar;
        this.c = i;
        this.e = i2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpbe)) {
            return false;
        }
        dpbe dpbeVar = (dpbe) obj;
        if (!ffkj.e(this.a, dpbeVar.a) || !ffkj.e(this.b, dpbeVar.b) || this.c != dpbeVar.c) {
            return false;
        }
        int i = dpbeVar.d;
        int i2 = dpbeVar.g;
        return this.e == dpbeVar.e && ffkj.e(this.f, dpbeVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.f;
        return (((((((((hashCode * 31) + this.c) * 31) + 1) * 31) + 2) * 31) + this.e) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AmrEncoderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", sampleRate=" + this.c + ", channelCount=1, pcmEncoding=2, bitRate=" + this.e + ", maxFileSize=" + this.f + ")";
    }
}

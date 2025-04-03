package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbv {
    public final Uri a;
    public final eepm b;
    public final int c;
    public final int e;
    public final Integer f;
    public final int d = 1;
    private final int g = 2;
    private final int h = 2;

    public dpbv(Uri uri, eepm eepmVar, int i, int i2, Integer num) {
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
        if (!(obj instanceof dpbv)) {
            return false;
        }
        dpbv dpbvVar = (dpbv) obj;
        if (!ffkj.e(this.a, dpbvVar.a) || !ffkj.e(this.b, dpbvVar.b) || this.c != dpbvVar.c) {
            return false;
        }
        int i = dpbvVar.d;
        int i2 = dpbvVar.g;
        if (this.e != dpbvVar.e) {
            return false;
        }
        int i3 = dpbvVar.h;
        return ffkj.e(this.f, dpbvVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.f;
        return (((((((((((hashCode * 31) + this.c) * 31) + 1) * 31) + 2) * 31) + this.e) * 31) + 2) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Mpeg4EncoderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", sampleRate=" + this.c + ", channelCount=1, pcmEncoding=2, bitRate=" + this.e + ", aacProfile=2, maxFileSize=" + this.f + ")";
    }
}

package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpeb {
    public final Uri a;
    public final eepm b;
    public final drjx c;
    public final int d;
    public final int e;
    public final Duration f;
    public final ffjm g;
    public final Integer h;
    public final ffjm i;
    public final ffjn j;
    public final ywa k;
    private final int l = 1;

    public dpeb(Uri uri, eepm eepmVar, drjx drjxVar, int i, int i2, ywa ywaVar, Duration duration, ffjm ffjmVar, Integer num, ffjm ffjmVar2, ffjn ffjnVar) {
        this.a = uri;
        this.b = eepmVar;
        this.c = drjxVar;
        this.d = i;
        this.e = i2;
        this.k = ywaVar;
        this.f = duration;
        this.g = ffjmVar;
        this.h = num;
        this.i = ffjmVar2;
        this.j = ffjnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpeb)) {
            return false;
        }
        dpeb dpebVar = (dpeb) obj;
        if (!ffkj.e(this.a, dpebVar.a) || !ffkj.e(this.b, dpebVar.b) || !ffkj.e(this.c, dpebVar.c) || this.d != dpebVar.d) {
            return false;
        }
        int i = dpebVar.l;
        return this.e == dpebVar.e && ffkj.e(this.k, dpebVar.k) && ffkj.e(this.f, dpebVar.f) && ffkj.e(this.g, dpebVar.g) && ffkj.e(this.h, dpebVar.h) && ffkj.e(this.i, dpebVar.i) && ffkj.e(this.j, dpebVar.j);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ywa ywaVar = this.k;
        int hashCode2 = ((((((((hashCode * 31) + this.d) * 31) + 1) * 31) + this.e) * 31) + (ywaVar == null ? 0 : ywaVar.hashCode())) * 31;
        Duration duration = this.f;
        int hashCode3 = (((hashCode2 + (duration == null ? 0 : duration.hashCode())) * 31) + this.g.hashCode()) * 31;
        Integer num = this.h;
        return ((((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "AudioRecorderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", format=" + this.c + ", sampleRate=" + this.d + ", channelCount=1, bitRate=" + this.e + ", recorderEffectFactory=" + this.k + ", maxDuration=" + this.f + ", onMaxDurationReached=" + this.g + ", maxFileSize=" + this.h + ", onMaxFileSizeReached=" + this.i + ", onError=" + this.j + ")";
    }
}

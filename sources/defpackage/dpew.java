package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpew {
    public final Uri a;
    public final eepm b;
    public final fgcq c;
    public final drjx d;
    public final int e;
    public final int f = 1;
    public final int g;
    public final Integer h;
    public final ffji i;
    public final ffjm j;

    public dpew(Uri uri, eepm eepmVar, fgcq fgcqVar, drjx drjxVar, int i, int i2, Integer num, ffji ffjiVar, ffjm ffjmVar) {
        this.a = uri;
        this.b = eepmVar;
        this.c = fgcqVar;
        this.d = drjxVar;
        this.e = i;
        this.g = i2;
        this.h = num;
        this.i = ffjiVar;
        this.j = ffjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpew)) {
            return false;
        }
        dpew dpewVar = (dpew) obj;
        if (!ffkj.e(this.a, dpewVar.a) || !ffkj.e(this.b, dpewVar.b) || !ffkj.e(this.c, dpewVar.c) || !ffkj.e(this.d, dpewVar.d) || this.e != dpewVar.e) {
            return false;
        }
        int i = dpewVar.f;
        return this.g == dpewVar.g && ffkj.e(this.h, dpewVar.h) && ffkj.e(this.i, dpewVar.i) && ffkj.e(this.j, dpewVar.j);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Integer num = this.h;
        return (((((((((((hashCode * 31) + this.e) * 31) + 1) * 31) + this.g) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "FileAudioSinkConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", inputFlow=" + this.c + ", format=" + this.d + ", sampleRate=" + this.e + ", channelCount=1, bitRate=" + this.g + ", maxFileSize=" + this.h + ", onMaxFileSizeReached=" + this.i + ", onError=" + this.j + ")";
    }
}

package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowd {
    public final List a;
    public final Uri b;
    public final long c;
    public final long d;
    public final float e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public dowd(List list, Uri uri, long j, long j2, float f, boolean z, int i, boolean z2) {
        this.a = list;
        this.b = uri;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = z;
        this.g = i;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dowd)) {
            return false;
        }
        dowd dowdVar = (dowd) obj;
        return ffkj.e(this.a, dowdVar.a) && ffkj.e(this.b, dowdVar.b) && this.c == dowdVar.c && this.d == dowdVar.d && Float.compare(this.e, dowdVar.e) == 0 && this.f == dowdVar.f && this.g == dowdVar.g && this.h == dowdVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return ((((((((((((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + dowb.a(this.c)) * 31) + dowb.a(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + dowc.a(this.f)) * 31) + this.g) * 31) + dowc.a(this.h);
    }

    public final String toString() {
        return "VoiceMoodBoxUiData(animatedEmojis=" + this.a + ", backgroundUri=" + this.b + ", gradientStartColorHex=" + this.c + ", gradientEndColorHex=" + this.d + ", gradientAngle=" + this.e + ", onlyShowStaticPrimaryEmoji=" + this.f + ", contentDescriptionResId=" + this.g + ", animateEmoji=" + this.h + ")";
    }
}

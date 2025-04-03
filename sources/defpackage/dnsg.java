package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsg {
    public final boolean a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;

    public dnsg() {
        this(false, false, false, false, PrivateKeyType.INVALID);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnsg)) {
            return false;
        }
        dnsg dnsgVar = (dnsg) obj;
        return this.h == dnsgVar.h && this.a == dnsgVar.a && this.b == dnsgVar.b && this.c == dnsgVar.c && this.d == dnsgVar.d && this.e == dnsgVar.e && this.f == dnsgVar.f && this.g == dnsgVar.g;
    }

    public final int hashCode() {
        long j = this.b;
        int a = dnsf.a(this.h);
        boolean z = this.g;
        boolean z2 = this.f;
        boolean z3 = this.e;
        boolean z4 = this.d;
        return (((((((((((((a * 31) + dnsf.a(this.a)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + dnsf.a(this.c)) * 31) + dnsf.a(z4)) * 31) + dnsf.a(z3)) * 31) + dnsf.a(z2)) * 31) + dnsf.a(z);
    }

    public final String toString() {
        return "Flags(repositionProgressIndicatorForAccessibility=" + this.h + ", useWidthModifier=" + this.a + ", slopMultiplierForHorizontalSwipe=" + this.b + ", enableSwipeToShowTimestamps=" + this.c + ", simplifyBubbleShape=" + this.d + ", enableLazyMessageOnClick=" + this.e + ", callOnFinishedWhenEffectDisposed=" + this.f + ", disableNewTimestampsForTalkback=" + this.g + ")";
    }

    public dnsg(boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.h = z;
        this.a = z2;
        this.b = j;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public /* synthetic */ dnsg(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this(false, false, (i & 4) != 0 ? 1L : 0L, false, ((i & 16) == 0) & z, ((i & 32) == 0) & z2, ((i & 64) == 0) & z3, ((i & 128) == 0) & z4);
    }
}

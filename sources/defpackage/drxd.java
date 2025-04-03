package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxd implements dtab {
    public final Map a;
    public final Integer b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final boolean i;
    private final boolean j;
    private final boolean k;

    public drxd() {
        this(false, false, false, false, 0.0f, false, 2047);
    }

    public static /* synthetic */ drxd a(drxd drxdVar, Map map, Integer num, Integer num2) {
        boolean z = drxdVar.j;
        boolean z2 = drxdVar.k;
        return new drxd(map, num, num2, drxdVar.d, drxdVar.e, drxdVar.f, drxdVar.g, drxdVar.h, drxdVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drxd)) {
            return false;
        }
        drxd drxdVar = (drxd) obj;
        if (!ffkj.e(this.a, drxdVar.a)) {
            return false;
        }
        boolean z = drxdVar.j;
        if (!ffkj.e(this.b, drxdVar.b) || !ffkj.e(this.c, drxdVar.c)) {
            return false;
        }
        boolean z2 = drxdVar.k;
        return this.d == drxdVar.d && this.e == drxdVar.e && this.f == drxdVar.f && this.g == drxdVar.g && Float.compare(this.h, drxdVar.h) == 0 && this.i == drxdVar.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int a = (((hashCode + drxc.a(false)) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return ((((((((((((((a + (num2 == null ? 0 : num2.hashCode())) * 31) + drxc.a(false)) * 31) + drxc.a(this.d)) * 31) + drxc.a(this.e)) * 31) + drxc.a(this.f)) * 31) + drxc.a(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + drxc.a(this.i);
    }

    public final String toString() {
        return "ProxyScreenConfiguration(attachedScreenConfigurationOverrides=" + this.a + ", dismissIconWithSearchBar=false, searchBarTopInsetResId=" + this.b + ", searchBarBottomMarginResId=" + this.c + ", isEmotifyEntryPointEnabled=false, notifyOnStateChange=" + this.d + ", alwaysRespectSearchTerm=" + this.e + ", shouldDelayBindingSearchUntilRequired=" + this.f + ", shouldUnbindSearchBarWhenHidden=" + this.g + ", emotifySmallSegmentRatio=" + this.h + ", enableEmotifyActivityEdgeToEdgeDisplay=" + this.i + ")";
    }

    public drxd(Map map, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5) {
        map.getClass();
        this.a = map;
        this.j = false;
        this.b = num;
        this.c = num2;
        this.k = false;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = f;
        this.i = z5;
    }

    public /* synthetic */ drxd(boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, int i) {
        this((i & 1) != 0 ? ffem.a : null, null, null, ((i & 32) == 0) & z, ((i & 64) == 0) & z2, ((i & 128) == 0) & z3, ((i & 256) == 0) & z4, (i & 512) != 0 ? 0.0f : f, ((i & 1024) == 0) & z5);
    }
}

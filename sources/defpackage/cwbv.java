package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbv {
    public final List a;
    public final List b;
    public final List c;

    public cwbv() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwbv)) {
            return false;
        }
        cwbv cwbvVar = (cwbv) obj;
        return ffkj.e(this.a, cwbvVar.a) && ffkj.e(this.b, cwbvVar.b) && ffkj.e(this.c, cwbvVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CombinedChipData(visibleNonRcsChips=" + this.a + ", visibleNonE2eeChips=" + this.b + ", totalChips=" + this.c + ")";
    }

    public cwbv(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public /* synthetic */ cwbv(List list, int i) {
        this((i & 1) != 0 ? ffel.a : null, (i & 2) != 0 ? ffel.a : null, (i & 4) != 0 ? ffel.a : list);
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfs {
    public final List a;
    public final List b;

    public dpfs(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpfs)) {
            return false;
        }
        dpfs dpfsVar = (dpfs) obj;
        return ffkj.e(this.a, dpfsVar.a) && ffkj.e(this.b, dpfsVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LoadResult(media=" + this.a + ", errors=" + this.b + ")";
    }
}

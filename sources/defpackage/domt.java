package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domt {
    public final List a;
    public final long b;
    public final long c;
    public final List d;
    public final long e;
    public final long f;

    public domt(List list, long j, long j2, List list2, long j3, long j4) {
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = list2;
        this.e = j3;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof domt)) {
            return false;
        }
        domt domtVar = (domt) obj;
        if (!ffkj.e(this.a, domtVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = domtVar.b;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.c, domtVar.c) && ffkj.e(this.d, domtVar.d) && ffcp.a(this.e, domtVar.e) && ffcp.a(this.f, domtVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = ibw.a;
        List list = this.d;
        return ((((((((hashCode + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + list.hashCode()) * 31) + ffco.a(this.e)) * 31) + ffco.a(this.f);
    }

    public final String toString() {
        long j = this.f;
        long j2 = this.e;
        long j3 = this.c;
        return "TextualBubbleColorData(normalBackgroundColor=" + this.a + ", normalTextColor=" + ibw.g(this.b) + ", normalLinkColor=" + ibw.g(j3) + ", highlightedBackgroundColors=" + this.d + ", highlightedTextColor=" + ibw.g(j2) + ", highlightedLinkColor=" + ibw.g(j) + ")";
    }
}

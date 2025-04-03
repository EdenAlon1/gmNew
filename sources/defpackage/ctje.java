package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctje {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final fbqx f;

    public ctje() {
        this(null, null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctje)) {
            return false;
        }
        ctje ctjeVar = (ctje) obj;
        return ffkj.e(this.a, ctjeVar.a) && ffkj.e(this.b, ctjeVar.b) && ffkj.e(this.c, ctjeVar.c) && ffkj.e(this.d, ctjeVar.d) && ffkj.e(this.e, ctjeVar.e) && this.f == ctjeVar.f;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "SmartsResults(suggestionItems=" + this.a + ", classifications=" + this.b + ", messageClassifications=" + this.c + ", conversationClassifications=" + this.d + ", performanceMetrics=" + this.e + ", rejectionReason=" + this.f + ")";
    }

    public /* synthetic */ ctje(List list, List list2, List list3, List list4, List list5, fbqx fbqxVar, int i) {
        list = (i & 1) != 0 ? ffel.a : list;
        list2 = (i & 2) != 0 ? ffel.a : list2;
        list3 = (i & 4) != 0 ? ffel.a : list3;
        list4 = (i & 8) != 0 ? ffel.a : list4;
        list5 = (i & 16) != 0 ? ffel.a : list5;
        fbqxVar = (i & 32) != 0 ? fbqx.UNKNOWN_REJECTION_REASON : fbqxVar;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        fbqxVar.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = fbqxVar;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqep {
    public final ArrayList a;
    public final cno b;
    public final ArrayList c;
    public final ArrayList d;
    public final HashSet e;
    public final HashSet f;
    public final HashSet g;
    public final ArrayList h;

    public cqep() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqep)) {
            return false;
        }
        cqep cqepVar = (cqep) obj;
        return ffkj.e(this.a, cqepVar.a) && ffkj.e(this.b, cqepVar.b) && ffkj.e(this.c, cqepVar.c) && ffkj.e(this.d, cqepVar.d) && ffkj.e(this.e, cqepVar.e) && ffkj.e(this.f, cqepVar.f) && ffkj.e(this.g, cqepVar.g) && ffkj.e(this.h, cqepVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "ScanLists(smsToAdd=" + this.a + ", mmsToAdd=" + this.b + ", mmsToAddInOrder=" + this.c + ", messagesToDelete=" + this.d + ", messagesToMerge=" + this.e + ", splitMessagePairs=" + this.f + ", threadsToMerge=" + this.g + ", scanProblems=" + this.h + ")";
    }

    public /* synthetic */ cqep(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        cno cnoVar = new cno((byte[]) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        this.a = arrayList;
        this.b = cnoVar;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = hashSet;
        this.f = hashSet2;
        this.g = hashSet3;
        this.h = arrayList4;
    }
}

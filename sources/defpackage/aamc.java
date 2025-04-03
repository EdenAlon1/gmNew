package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aamc {
    public final String a;
    public final List b;

    public aamc(String str, List list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aamc)) {
            return false;
        }
        aamc aamcVar = (aamc) obj;
        return ffkj.e(this.a, aamcVar.a) && ffkj.e(this.b, aamcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CachableUiDataParts(processedText=" + this.a + ", combinedAnnotations=" + this.b + ")";
    }
}

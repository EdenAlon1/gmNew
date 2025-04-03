package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgsc {
    public final String a;
    public final List b;

    public cgsc(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgsc)) {
            return false;
        }
        cgsc cgscVar = (cgsc) obj;
        return ffkj.e(this.a, cgscVar.a) && ffkj.e(this.b, cgscVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MarkdownResult(displayableText=" + this.a + ", annotations=" + this.b + ")";
    }
}

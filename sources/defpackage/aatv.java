package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatv {
    public final List a;
    public final int b;
    public final int c;

    public aatv(List list, int i, int i2) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aatv)) {
            return false;
        }
        aatv aatvVar = (aatv) obj;
        return ffkj.e(this.a, aatvVar.a) && this.b == aatvVar.b && this.c == aatvVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "LoadResultInternal(list=" + this.a + ", itemsBefore=" + this.b + ", itemsAfter=" + this.c + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaud {
    public final boolean a;
    public final ojf b;

    public aaud(boolean z, ojf ojfVar) {
        ojfVar.getClass();
        this.a = z;
        this.b = ojfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaud)) {
            return false;
        }
        aaud aaudVar = (aaud) obj;
        return this.a == aaudVar.a && ffkj.e(this.b, aaudVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Pages(fromNewPagingSource=" + this.a + ", pagingData=" + this.b + ")";
    }
}

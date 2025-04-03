package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xli {
    public final boolean a;
    public final xlu b;

    public xli(boolean z, xlu xluVar) {
        this.a = z;
        this.b = xluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xli)) {
            return false;
        }
        xli xliVar = (xli) obj;
        return this.a == xliVar.a && ffkj.e(this.b, xliVar.b);
    }

    public final int hashCode() {
        xlu xluVar = this.b;
        return ((true != this.a ? 1237 : 1231) * 31) + (xluVar == null ? 0 : xluVar.hashCode());
    }

    public final String toString() {
        return "SimpleMessagePropertiesTextData(lengthRequiresMms=" + this.a + ", textCounterData=" + this.b + ")";
    }
}

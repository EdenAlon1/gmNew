package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhf {
    public final dotb a;
    public final boolean b;

    public cwhf(dotb dotbVar, boolean z) {
        this.a = dotbVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwhf)) {
            return false;
        }
        cwhf cwhfVar = (cwhf) obj;
        return ffkj.e(this.a, cwhfVar.a) && this.b == cwhfVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ExtendedTopAppBarUiData(topAppBarUiData=" + this.a + ", overrideSystemBack=" + this.b + ")";
    }
}

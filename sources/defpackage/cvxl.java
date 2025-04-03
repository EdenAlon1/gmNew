package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxl implements cvxm {
    public final String a;
    public final ffix b;

    public cvxl(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvxl)) {
            return false;
        }
        cvxl cvxlVar = (cvxl) obj;
        return ffkj.e(this.a, cvxlVar.a) && ffkj.e(this.b, cvxlVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ButtonEmergencyRowUiData(text=" + this.a + ", onClick=" + this.b + ")";
    }
}

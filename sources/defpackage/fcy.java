package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcy {
    public final fcx a;
    public final fcx b;
    public final boolean c;

    public fcy(fcx fcxVar, fcx fcxVar2, boolean z) {
        this.a = fcxVar;
        this.b = fcxVar2;
        this.c = z;
    }

    public static /* synthetic */ fcy a(fcy fcyVar, fcx fcxVar, fcx fcxVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            fcxVar = fcyVar.a;
        }
        if ((i & 2) != 0) {
            fcxVar2 = fcyVar.b;
        }
        return new fcy(fcxVar, fcxVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcy)) {
            return false;
        }
        fcy fcyVar = (fcy) obj;
        return ffkj.e(this.a, fcyVar.a) && ffkj.e(this.b, fcyVar.b) && this.c == fcyVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}

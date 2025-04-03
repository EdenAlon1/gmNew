package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aioq implements aihs {
    public final boolean a;
    public final ffji b;

    public aioq() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aioq)) {
            return false;
        }
        aioq aioqVar = (aioq) obj;
        return this.a == aioqVar.a && ffkj.e(this.b, aioqVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UpdateStoredLocation(requestPermission=" + this.a + ", onPermissionGranted=" + this.b + ")";
    }

    public /* synthetic */ aioq(ffji ffjiVar, int i) {
        ffjiVar = (i & 2) != 0 ? new aiop(null) : ffjiVar;
        boolean z = 1 == (i & 1);
        ffjiVar.getClass();
        this.a = z;
        this.b = ffjiVar;
    }
}

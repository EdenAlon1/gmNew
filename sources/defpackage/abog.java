package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abog {
    public final doba a;
    public final abmi b;

    public abog(doba dobaVar, abmi abmiVar) {
        abmiVar.getClass();
        this.a = dobaVar;
        this.b = abmiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abog)) {
            return false;
        }
        abog abogVar = (abog) obj;
        return ffkj.e(this.a, abogVar.a) && ffkj.e(this.b, abogVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RbmTopAppBarUiData(appBar=" + this.a + ", backBehavior=" + this.b + ")";
    }
}

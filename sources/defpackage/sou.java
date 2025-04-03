package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sou {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final sos d;
    private final eqom e;

    public /* synthetic */ sou(boolean z, eqom eqomVar, boolean z2, boolean z3, sos sosVar, int i) {
        this.a = z;
        this.e = (i & 2) != 0 ? null : eqomVar;
        this.b = (!((i & 4) == 0)) | z2;
        this.c = ((i & 8) == 0) & z3;
        this.d = sosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sou)) {
            return false;
        }
        sou souVar = (sou) obj;
        return this.a == souVar.a && this.e == souVar.e && this.b == souVar.b && this.c == souVar.c && ffkj.e(this.d, souVar.d);
    }

    public final int hashCode() {
        eqom eqomVar = this.e;
        return (((((((sot.a(this.a) * 31) + (eqomVar == null ? 0 : eqomVar.hashCode())) * 31) + sot.a(this.b)) * 31) + sot.a(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GetCustomD2DItemResult(isSuccess=" + this.a + ", failureReason=" + this.e + ", shouldLog=" + this.b + ", pfdSent=" + this.c + ", result=" + this.d + ")";
    }
}

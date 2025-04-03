package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyyi {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public cyyi(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyyi)) {
            return false;
        }
        cyyi cyyiVar = (cyyi) obj;
        return this.a == cyyiVar.a && this.b == cyyiVar.b && this.c == cyyiVar.c;
    }

    public final int hashCode() {
        return (((cyyh.a(this.a) * 31) + cyyh.a(this.b)) * 31) + cyyh.a(this.c);
    }

    public final String toString() {
        return "Flags(disableSharedElementTransitionsInTests=" + this.a + ", enableNewUiSpecs=" + this.b + ", ellipseTitle=" + this.c + ")";
    }

    public cyyi() {
        this(true, true, false);
    }
}

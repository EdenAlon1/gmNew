package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oeo {
    public final int a;
    public final olp b;

    public oeo(int i, olp olpVar) {
        olpVar.getClass();
        this.a = i;
        this.b = olpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeo)) {
            return false;
        }
        oeo oeoVar = (oeo) obj;
        return this.a == oeoVar.a && ffkj.e(this.b, oeoVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}

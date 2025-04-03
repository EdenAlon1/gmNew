package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aorf extends aoyn {
    private final boolean b;
    private final engw c;

    public aorf(boolean z, engw engwVar) {
        this.b = z;
        if (engwVar == null) {
            throw new NullPointerException("Null readByList");
        }
        this.c = engwVar;
    }

    @Override // defpackage.aoyn, defpackage.alyt
    public final engw a() {
        return this.c;
    }

    @Override // defpackage.aoyn, defpackage.alyt
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoyn) {
            aoyn aoynVar = (aoyn) obj;
            if (this.b == aoynVar.b() && enkr.h(this.c, aoynVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "DefaultReadReport{isReadByAll=" + this.b + ", readByList=" + this.c.toString() + "}";
    }
}

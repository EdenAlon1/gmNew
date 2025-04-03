package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvp {
    public final doui a;
    public final doue b;

    public dlvp(doui douiVar, doue doueVar) {
        this.a = douiVar;
        this.b = doueVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvp)) {
            return false;
        }
        dlvp dlvpVar = (dlvp) obj;
        return ffkj.e(this.a, dlvpVar.a) && ffkj.e(this.b, dlvpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Transcript(uiData=" + this.a + ", uiAction=" + this.b + ")";
    }
}

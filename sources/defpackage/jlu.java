package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlu extends jlw {
    public final String a;
    public final jph b;

    public jlu(String str, jph jphVar) {
        this.a = str;
        this.b = jphVar;
    }

    @Override // defpackage.jlw
    public final jph a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlu)) {
            return false;
        }
        jlu jluVar = (jlu) obj;
        return ffkj.e(this.a, jluVar.a) && ffkj.e(this.b, jluVar.b) && ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jph jphVar = this.b;
        return (hashCode + (jphVar != null ? jphVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.a + ')';
    }

    @Override // defpackage.jlw
    public final void b() {
    }
}

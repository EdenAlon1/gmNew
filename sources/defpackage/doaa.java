package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doaa implements doae {
    private final long a;
    private final cyz b;
    private final idl c;

    public doaa(long j, cyz cyzVar) {
        this.a = j;
        this.b = cyzVar;
        this.c = new idl(j);
    }

    @Override // defpackage.doae
    public final cyz b() {
        return this.b;
    }

    @Override // defpackage.doae
    public final ibq c(float f, long j) {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doaa)) {
            return false;
        }
        doaa doaaVar = (doaa) obj;
        long j = this.a;
        long j2 = doaaVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffkj.e(this.b, doaaVar.b);
    }

    public final int hashCode() {
        long j = ibw.a;
        return (ffco.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Fade(highlightColor=" + ibw.g(this.a) + ", animationSpec=" + this.b + ")";
    }

    @Override // defpackage.doae
    public final float a(float f) {
        return f;
    }
}

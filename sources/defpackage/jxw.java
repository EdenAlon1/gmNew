package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxw implements jyr {
    public final ide a;
    private final float b;

    public jxw(ide ideVar, float f) {
        this.a = ideVar;
        this.b = f;
    }

    @Override // defpackage.jyr
    public final float a() {
        return this.b;
    }

    @Override // defpackage.jyr
    public final long b() {
        return ibw.h;
    }

    @Override // defpackage.jyr
    public final ibq c() {
        return this.a;
    }

    @Override // defpackage.jyr
    public final /* synthetic */ jyr d(jyr jyrVar) {
        return jym.a(this, jyrVar);
    }

    @Override // defpackage.jyr
    public final /* synthetic */ jyr e(ffix ffixVar) {
        return jym.b(this, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxw)) {
            return false;
        }
        jxw jxwVar = (jxw) obj;
        return ffkj.e(this.a, jxwVar.a) && Float.compare(this.b, jxwVar.b) == 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ')';
    }
}

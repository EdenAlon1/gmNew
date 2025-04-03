package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgr {
    public final float a;
    public final float b;
    public final long c;
    public final cxj d;
    public final cxj e;
    public final int f;
    public final float g;

    public dmgr(float f, float f2, long j, cxj cxjVar, cxj cxjVar2, int i, float f3) {
        cxjVar.getClass();
        cxjVar2.getClass();
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = cxjVar;
        this.e = cxjVar2;
        this.f = i;
        this.g = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmgr)) {
            return false;
        }
        dmgr dmgrVar = (dmgr) obj;
        if (Float.compare(this.a, dmgrVar.a) != 0 || Float.compare(this.b, dmgrVar.b) != 0) {
            return false;
        }
        long j = this.c;
        long j2 = dmgrVar.c;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffkj.e(this.d, dmgrVar.d) && ffkj.e(this.e, dmgrVar.e) && this.f == dmgrVar.f && Float.compare(this.g, dmgrVar.g) == 0;
    }

    public final int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        long j = ibw.a;
        return (((((((((floatToIntBits * 31) + ffco.a(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "SparkleUiData(xPercent=" + this.a + ", yPercent=" + this.b + ", color=" + ibw.g(this.c) + ", scale=" + this.d + ", alpha=" + this.e + ", delayMillis=" + this.f + ", finalSizeScale=" + this.g + ")";
    }

    public /* synthetic */ dmgr(float f, float f2, long j, cxj cxjVar, cxj cxjVar2, int i) {
        this(f, f2, j, cxjVar, cxjVar2, i, 1.0f);
    }
}

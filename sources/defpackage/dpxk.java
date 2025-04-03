package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxk {
    public final float a;
    public final float b;
    public final ffji c;

    public dpxk(float f, float f2, ffji ffjiVar) {
        this.a = f;
        this.b = f2;
        this.c = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpxk)) {
            return false;
        }
        dpxk dpxkVar = (dpxk) obj;
        return Float.compare(this.a, dpxkVar.a) == 0 && Float.compare(this.b, dpxkVar.b) == 0 && ffkj.e(this.c, dpxkVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ZoomButtonUiData(zoomRatio=" + this.a + ", currentZoomRatio=" + this.b + ", onClick=" + this.c + ")";
    }

    public dpxk() {
        this(1.0f, 1.0f, new ffji() { // from class: dpxj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Float) obj).floatValue();
                return ffcu.a;
            }
        });
    }
}

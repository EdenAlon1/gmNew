package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkt extends blb {
    public final float a;
    private final float b;
    private final float c;
    private final float d;

    public bkt(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.blb, defpackage.axz
    public final float a() {
        return this.b;
    }

    @Override // defpackage.blb, defpackage.axz
    public final float b() {
        return this.c;
    }

    @Override // defpackage.blb, defpackage.axz
    public final float c() {
        return this.a;
    }

    @Override // defpackage.blb
    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blb) {
            blb blbVar = (blb) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(blbVar.c()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(blbVar.a()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(blbVar.b()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(blbVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anx implements axz {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public anx(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.axz
    public final float a() {
        return this.b;
    }

    @Override // defpackage.axz
    public final float b() {
        return this.c;
    }

    @Override // defpackage.axz
    public final float c() {
        return this.a;
    }

    final void d(float f) {
        float f2 = this.b;
        if (f <= f2) {
            float f3 = this.c;
            if (f >= f3) {
                this.a = f;
                this.d = bba.d(f, f3, f2);
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.c + " , " + this.b + "]");
    }
}

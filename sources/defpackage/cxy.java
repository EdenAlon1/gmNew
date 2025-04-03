package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxy extends cyb {
    public float a;
    public float b;

    public cxy(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cyb
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.cyb
    public final int b() {
        return 2;
    }

    @Override // defpackage.cyb
    public final /* synthetic */ cyb c() {
        return new cxy(0.0f, 0.0f);
    }

    @Override // defpackage.cyb
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.cyb
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cxy)) {
            return false;
        }
        cxy cxyVar = (cxy) obj;
        return cxyVar.a == this.a && cxyVar.b == this.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}

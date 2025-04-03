package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxx extends cyb {
    public float a;

    public cxx(float f) {
        this.a = f;
    }

    @Override // defpackage.cyb
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.cyb
    public final int b() {
        return 1;
    }

    @Override // defpackage.cyb
    public final /* synthetic */ cyb c() {
        return new cxx(0.0f);
    }

    @Override // defpackage.cyb
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.cyb
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cxx) && ((cxx) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}

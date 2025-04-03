package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khm extends khk {
    float a;

    public khm(float f) {
        super(null);
        this.a = f;
    }

    @Override // defpackage.khk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof khm) {
            float t = t();
            float t2 = ((khm) obj).t();
            if ((Float.isNaN(t) && Float.isNaN(t2)) || t == t2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.khk
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f = this.a;
        return hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    @Override // defpackage.khk
    public final float t() {
        if (Float.isNaN(this.a) && y()) {
            this.a = Float.parseFloat(v());
        }
        return this.a;
    }

    @Override // defpackage.khk
    public final int u() {
        if (Float.isNaN(this.a) && y()) {
            this.a = Integer.parseInt(v());
        }
        return (int) this.a;
    }
}

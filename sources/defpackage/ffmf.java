package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffmf implements ffmg {
    private final float a;
    private final float b;

    public ffmf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* bridge */ /* synthetic */ boolean e(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // defpackage.ffmg
    public final boolean a() {
        return this.a > this.b;
    }

    public final /* bridge */ /* synthetic */ Comparable b() {
        return Float.valueOf(this.b);
    }

    public final /* bridge */ /* synthetic */ Comparable c() {
        return Float.valueOf(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ boolean d(Comparable comparable) {
        float floatValue = ((Number) comparable).floatValue();
        return floatValue >= this.a && floatValue <= this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ffmf) {
            if (a() && ((ffmf) obj).a()) {
                return true;
            }
            ffmf ffmfVar = (ffmf) obj;
            return this.a == ffmfVar.a && this.b == ffmfVar.b;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzun extends dzvj {
    public final int a;
    public final float b;

    public dzun(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.dzvj
    public final float a() {
        return this.b;
    }

    @Override // defpackage.dzvj
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvj) {
            dzvj dzvjVar = (dzvj) obj;
            if (this.a == dzvjVar.b() && Float.floatToIntBits(this.b) == Float.floatToIntBits(dzvjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "HorizontalLine{lineColor=" + this.a + ", lineWidth=" + this.b + "}";
    }
}

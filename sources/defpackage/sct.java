package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sct extends sda {
    private final String a;
    private final int b;
    private final float c;

    public sct(String str, int i, float f) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.sda
    public final float a() {
        return this.c;
    }

    @Override // defpackage.sda
    public final int b() {
        return this.b;
    }

    @Override // defpackage.sda
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sda) {
            sda sdaVar = (sda) obj;
            if (this.a.equals(sdaVar.c()) && this.b == sdaVar.b() && Float.floatToIntBits(this.c) == Float.floatToIntBits(sdaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "Rewrite{text=" + this.a + ", tone=" + this.b + ", score=" + this.c + "}";
    }
}

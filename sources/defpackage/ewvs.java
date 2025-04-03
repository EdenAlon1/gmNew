package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvs extends ewyo {
    private final String a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;

    public ewvs(String str, int i, int i2, int i3, float f) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    @Override // defpackage.ewyo
    public final float a() {
        return this.e;
    }

    @Override // defpackage.ewyo
    public final int b() {
        return this.d;
    }

    @Override // defpackage.ewyo
    public final int c() {
        return this.b;
    }

    @Override // defpackage.ewyo
    public final int d() {
        return this.c;
    }

    @Override // defpackage.ewyo
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ewyo) {
            ewyo ewyoVar = (ewyo) obj;
            if (this.a.equals(ewyoVar.e()) && this.b == ewyoVar.c() && this.c == ewyoVar.d() && this.d == ewyoVar.b() && Float.floatToIntBits(this.e) == Float.floatToIntBits(ewyoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "Slot{type=" + this.a + ", messageIndex=" + this.b + ", startIndex=" + this.c + ", endIndex=" + this.d + ", confidenceScore=" + this.e + "}";
    }
}

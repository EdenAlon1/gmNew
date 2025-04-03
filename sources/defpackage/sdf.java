package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sdf extends sdm {
    private final String a;
    private final float b;
    private final int c;

    public sdf(String str, float f, int i) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
        this.b = f;
        this.c = i;
    }

    @Override // defpackage.sdm
    public final float a() {
        return this.b;
    }

    @Override // defpackage.sdm
    public final int b() {
        return this.c;
    }

    @Override // defpackage.sdm
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sdm) {
            sdm sdmVar = (sdm) obj;
            if (this.a.equals(sdmVar.c()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(sdmVar.a()) && this.c == sdmVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "SmartReplySuggestion{text=" + this.a + ", score=" + this.b + ", safetyClassificationResult=" + this.c + "}";
    }
}

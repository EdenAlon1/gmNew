package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emnf extends emnj {
    public final String a;
    private final engw b;
    private final float c;
    private final String d;
    private final fbrg e;

    public emnf(String str, engw engwVar, float f, String str2, fbrg fbrgVar) {
        this.a = str;
        this.b = engwVar;
        this.c = f;
        this.d = str2;
        this.e = fbrgVar;
    }

    @Override // defpackage.emnj
    public final float a() {
        return this.c;
    }

    @Override // defpackage.emnj
    public final engw b() {
        return this.b;
    }

    @Override // defpackage.emnj
    public final fbrg c() {
        return this.e;
    }

    @Override // defpackage.emnj
    public final String d() {
        return this.a;
    }

    @Override // defpackage.emnj
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emnj) {
            emnj emnjVar = (emnj) obj;
            if (this.a.equals(emnjVar.d()) && enkr.h(this.b, emnjVar.b()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(emnjVar.a()) && this.d.equals(emnjVar.e()) && this.e.equals(emnjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        fbrg fbrgVar = this.e;
        return "Interpretation{intent=" + this.a + ", entities=" + this.b.toString() + ", score=" + this.c + ", textPrediction=" + this.d + ", source=" + fbrgVar.toString() + "}";
    }
}

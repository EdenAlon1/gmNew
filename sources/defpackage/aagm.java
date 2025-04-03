package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagm {
    public final qgw a;
    public final int b;
    public final float c;

    public aagm(qgw qgwVar, int i, float f) {
        this.a = qgwVar;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aagm)) {
            return false;
        }
        aagm aagmVar = (aagm) obj;
        return ffkj.e(this.a, aagmVar.a) && this.b == aagmVar.b && Float.compare(this.c, aagmVar.c) == 0;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "ReactionAnimation(animation=" + this.a + ", label=" + this.b + ", scale=" + this.c + ")";
    }

    public /* synthetic */ aagm(qgw qgwVar, int i) {
        this(qgwVar, i, 1.0f);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apya {
    public final apyv a;
    public final int b;
    public final boolean c;
    public final engw d;

    public apya(apyv apyvVar, int i, boolean z, engw engwVar) {
        this.a = apyvVar;
        this.b = i;
        this.c = z;
        this.d = engwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apya)) {
            return false;
        }
        apya apyaVar = (apya) obj;
        return ffkj.e(this.a, apyaVar.a) && this.b == apyaVar.b && this.c == apyaVar.c && ffkj.e(this.d, apyaVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DefaultReactionState(reaction=" + this.a + ", count=" + this.b + ", hasAnimationEffect=" + this.c + ", reactionsMetadata=" + this.d + ")";
    }
}

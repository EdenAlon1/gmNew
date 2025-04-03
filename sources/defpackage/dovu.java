package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovu {
    public final dnaw a;
    public final dovv b;

    public dovu(dnaw dnawVar, dovv dovvVar) {
        dovvVar.getClass();
        this.a = dnawVar;
        this.b = dovvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dovu)) {
            return false;
        }
        dovu dovuVar = (dovu) obj;
        return ffkj.e(this.a, dovuVar.a) && this.b == dovuVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AnimatedEmojiUiData(mddFile=" + this.a + ", position=" + this.b + ")";
    }
}

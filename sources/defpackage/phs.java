package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phs {
    private final php a;
    private final phq b;
    private final phq c;
    private final phq d;

    public phs(php phpVar, phq phqVar, phq phqVar2, phq phqVar3) {
        this.a = phpVar;
        this.b = phqVar;
        this.c = phqVar2;
        this.d = phqVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phs)) {
            return false;
        }
        phs phsVar = (phs) obj;
        return ffkj.e(this.a, phsVar.a) && ffkj.e(this.b, phsVar.b) && ffkj.e(this.c, phsVar.c) && ffkj.e(this.d, phsVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "phs:{animationBackground=" + this.a + ", openAnimation=" + this.b + ", closeAnimation=" + this.c + ", changeAnimation=" + this.d + " }";
    }
}

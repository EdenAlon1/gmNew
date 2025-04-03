package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiba {
    public final String a;
    public final ffix b;

    public aiba(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiba)) {
            return false;
        }
        aiba aibaVar = (aiba) obj;
        return ffkj.e(this.a, aibaVar.a) && ffkj.e(this.b, aibaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ClickableText(text=" + this.a + ", onToggle=" + this.b + ")";
    }
}

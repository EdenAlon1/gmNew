package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjr {
    public final String a;
    public final dnwq b;
    public final boolean c;
    public final ffix d;
    private final boolean e = false;
    private final dmjs f;

    public dmjr(String str, dnwq dnwqVar, boolean z, ffix ffixVar, dmjs dmjsVar) {
        this.a = str;
        this.b = dnwqVar;
        this.c = z;
        this.d = ffixVar;
        this.f = dmjsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmjr)) {
            return false;
        }
        dmjr dmjrVar = (dmjr) obj;
        if (!ffkj.e(this.a, dmjrVar.a) || !ffkj.e(this.b, dmjrVar.b) || this.c != dmjrVar.c) {
            return false;
        }
        boolean z = dmjrVar.e;
        return ffkj.e(this.d, dmjrVar.d) && ffkj.e(this.f, dmjrVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + dmjq.a(this.c)) * 31) + dmjq.a(false)) * 31) + this.d.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "ChipUiData(text=" + this.a + ", monogram=" + this.b + ", enabled=" + this.c + ", selected=false, onCloseClick=" + this.d + ", flags=" + this.f + ")";
    }
}

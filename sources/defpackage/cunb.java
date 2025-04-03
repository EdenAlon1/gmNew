package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cunb implements cund {
    public final String a;
    public final engw b;
    public final engw c;

    public cunb(String str, engw engwVar, engw engwVar2) {
        this.a = str;
        this.b = engwVar;
        this.c = engwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cunb)) {
            return false;
        }
        cunb cunbVar = (cunb) obj;
        return ffkj.e(this.a, cunbVar.a) && ffkj.e(this.b, cunbVar.b) && ffkj.e(this.c, cunbVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LoadedTemplates(version=" + this.a + ", rcsTemplates=" + this.b + ", xmsTemplates=" + this.c + ")";
    }
}

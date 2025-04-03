package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznc extends dzpw {
    public final dzqo a;
    public final String b;

    public dznc(dzqo dzqoVar, String str) {
        this.a = dzqoVar;
        this.b = str;
    }

    @Override // defpackage.dzpw
    public final dzqo a() {
        return this.a;
    }

    @Override // defpackage.dzpw
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzpw) {
            dzpw dzpwVar = (dzpw) obj;
            if (this.a.equals(dzpwVar.a()) && this.b.equals(dzpwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CustomizedWebView{webViewHeader=" + this.a.toString() + ", url=" + this.b + "}";
    }
}

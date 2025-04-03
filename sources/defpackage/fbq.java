package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbq {
    public String a;
    public boolean b = false;
    public faz c = null;
    private final String d;

    public fbq(String str, String str2) {
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbq)) {
            return false;
        }
        fbq fbqVar = (fbq) obj;
        return ffkj.e(this.d, fbqVar.d) && ffkj.e(this.a, fbqVar.a) && this.b == fbqVar.b && ffkj.e(this.c, fbqVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        int i = true != this.b ? 1237 : 1231;
        faz fazVar = this.c;
        return (((hashCode * 31) + i) * 31) + (fazVar == null ? 0 : fazVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ')';
    }
}

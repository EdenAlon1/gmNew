package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzol extends dzsg {
    private final String a;
    private final engw b;

    public dzol(String str, engw engwVar) {
        this.a = str;
        this.b = engwVar;
    }

    @Override // defpackage.dzsg
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.dzsg
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsg) {
            dzsg dzsgVar = (dzsg) obj;
            if (this.a.equals(dzsgVar.b()) && enkr.h(this.b, dzsgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "UrlAction{url=" + this.a + ", replacements=" + this.b.toString() + "}";
    }
}

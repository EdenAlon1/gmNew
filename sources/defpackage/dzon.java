package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzon extends dzsf {
    private final String a;
    private final int b;

    public dzon(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.dzsf
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dzsf
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsf) {
            dzsf dzsfVar = (dzsf) obj;
            if (this.a.equals(dzsfVar.b()) && this.b == dzsfVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "UrlContentReplacement{pattern=" + this.a + ", substitute=" + this.b + "}";
    }
}

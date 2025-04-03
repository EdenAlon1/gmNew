package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class espm extends espr {
    private final String a;
    private final String b;
    private final enhk c;

    public espm(String str, String str2, enhk enhkVar) {
        this.a = str;
        this.b = str2;
        this.c = enhkVar;
    }

    @Override // defpackage.espr
    public final enhk a() {
        return this.c;
    }

    @Override // defpackage.espr
    public final String b() {
        return this.b;
    }

    @Override // defpackage.espr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof espr) {
            espr esprVar = (espr) obj;
            if (this.a.equals(esprVar.c()) && this.b.equals(esprVar.b()) && ennc.m(this.c, esprVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}

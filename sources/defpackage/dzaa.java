package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzaa extends dzaz {
    public final String a;
    public final dzay b;

    public dzaa(String str, dzay dzayVar) {
        this.a = str;
        this.b = dzayVar;
    }

    @Override // defpackage.dzaz
    public final dzay a() {
        return this.b;
    }

    @Override // defpackage.dzaz
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzaz) {
            dzaz dzazVar = (dzaz) obj;
            if (this.a.equals(dzazVar.b()) && this.b.equals(dzazVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Push{pushId=" + this.a + ", oneOfType=" + this.b.toString() + "}";
    }
}

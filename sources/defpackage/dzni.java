package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzni extends dzqd {
    private final String a;
    private final dzjn b;
    private final emxc c;

    public dzni(String str, dzjn dzjnVar, emxc emxcVar) {
        this.a = str;
        this.b = dzjnVar;
        this.c = emxcVar;
    }

    @Override // defpackage.dzqd
    public final dzjn a() {
        return this.b;
    }

    @Override // defpackage.dzqd
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dzqd
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqd) {
            dzqd dzqdVar = (dzqd) obj;
            if (this.a.equals(dzqdVar.c()) && this.b.equals(dzqdVar.a()) && this.c.equals(dzqdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        return "LighterMenuItem{menuName=" + this.a + ", action=" + this.b.toString() + ", icon=" + String.valueOf(emxcVar) + "}";
    }
}

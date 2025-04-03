package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzoh extends dzsa {
    private final int a;
    private final String b;
    private final emxc c;
    private final dzjn d;
    private final String e;

    public dzoh(int i, String str, emxc emxcVar, dzjn dzjnVar, String str2) {
        this.a = i;
        this.b = str;
        this.c = emxcVar;
        this.d = dzjnVar;
        this.e = str2;
    }

    @Override // defpackage.dzsa
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzsa
    public final dzjn b() {
        return this.d;
    }

    @Override // defpackage.dzsa
    public final emxc c() {
        return this.c;
    }

    @Override // defpackage.dzsa
    public final String d() {
        return this.e;
    }

    @Override // defpackage.dzsa
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsa) {
            dzsa dzsaVar = (dzsa) obj;
            if (this.a == dzsaVar.a() && this.b.equals(dzsaVar.e()) && this.c.equals(dzsaVar.c()) && this.d.equals(dzsaVar.b()) && this.e.equals(dzsaVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        dzjn dzjnVar = this.d;
        return "Suggestion{id=" + this.a + ", text=" + this.b + ", lighterIcon=" + String.valueOf(this.c) + ", action=" + String.valueOf(dzjnVar) + ", secondaryText=" + this.e + "}";
    }
}

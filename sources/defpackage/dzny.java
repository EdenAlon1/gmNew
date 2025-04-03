package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzny extends dzrd {
    private final String a;
    private final emxc b;
    private final emxc c;
    private final dzjn d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;

    public dzny(String str, emxc emxcVar, emxc emxcVar2, dzjn dzjnVar, int i, int i2, int i3, boolean z) {
        this.a = str;
        this.b = emxcVar;
        this.c = emxcVar2;
        this.d = dzjnVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = z;
    }

    @Override // defpackage.dzrd
    public final int a() {
        return this.f;
    }

    @Override // defpackage.dzrd
    public final int b() {
        return this.g;
    }

    @Override // defpackage.dzrd
    public final int c() {
        return this.e;
    }

    @Override // defpackage.dzrd
    public final dzjn d() {
        return this.d;
    }

    @Override // defpackage.dzrd
    public final emxc e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzrd) {
            dzrd dzrdVar = (dzrd) obj;
            if (this.a.equals(dzrdVar.g()) && this.b.equals(dzrdVar.e()) && this.c.equals(dzrdVar.f()) && this.d.equals(dzrdVar.d()) && this.e == dzrdVar.c() && this.f == dzrdVar.a() && this.g == dzrdVar.b() && this.h == dzrdVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzrd
    public final emxc f() {
        return this.c;
    }

    @Override // defpackage.dzrd
    public final String g() {
        return this.a;
    }

    @Override // defpackage.dzrd
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return (((((((hashCode * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        dzjn dzjnVar = this.d;
        emxc emxcVar = this.c;
        return "RichCardButton{text=" + this.a + ", a11yText=" + String.valueOf(this.b) + ", lighterIcon=" + String.valueOf(emxcVar) + ", action=" + dzjnVar.toString() + ", textColor=" + this.e + ", backgroundColor=" + this.f + ", borderColor=" + this.g + ", enabled=" + this.h + "}";
    }
}

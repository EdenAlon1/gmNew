package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdim extends bdio {
    public final bcyq a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    public bdim(bcyq bcyqVar, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = bcyqVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.bdio
    public final int a() {
        return this.f;
    }

    @Override // defpackage.bdio
    public final int b() {
        return this.e;
    }

    @Override // defpackage.bdio
    public final int c() {
        return this.d;
    }

    @Override // defpackage.bdio
    public final bcyq d() {
        return this.a;
    }

    @Override // defpackage.bdio
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdio) {
            bdio bdioVar = (bdio) obj;
            if (this.a.equals(bdioVar.d()) && this.b == bdioVar.f() && this.c == bdioVar.e() && this.d == bdioVar.c() && this.e == bdioVar.b() && this.f == bdioVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdio
    public final boolean f() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "DraftConversionKey{draft=" + this.a.toString() + ", switchToRcs=" + this.b + ", forceChange=" + this.c + ", selfSubId=" + this.d + ", rcsAttachmentLimit=" + this.e + ", mmsAttachmentLimit=" + this.f + "}";
    }
}

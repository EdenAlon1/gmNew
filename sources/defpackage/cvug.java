package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvug implements cvud {
    public final String a;
    public final dngx b;
    public final String c;
    private final cvug d;

    public cvug(String str, dngx dngxVar, String str2) {
        str.getClass();
        this.a = str;
        this.b = dngxVar;
        this.c = str2;
        this.d = this;
    }

    @Override // defpackage.cvud
    public final cvug a() {
        return this.d;
    }

    @Override // defpackage.cvud
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvug)) {
            return false;
        }
        cvug cvugVar = (cvug) obj;
        return ffkj.e(this.a, cvugVar.a) && ffkj.e(this.b, cvugVar.b) && ffkj.e(this.c, cvugVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactUiData(id=" + this.a + ", itemUiData=" + this.b + ", header=" + this.c + ")";
    }
}

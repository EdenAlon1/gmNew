package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvul implements cvud {
    private final String a;
    private final ffix b;
    private final ffbz c;

    public cvul(String str, ffix ffixVar) {
        str.getClass();
        this.a = str;
        this.b = ffixVar;
        this.c = ffca.b(3, ffixVar);
    }

    @Override // defpackage.cvud
    public final cvug a() {
        return (cvug) this.c.a();
    }

    @Override // defpackage.cvud
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvul)) {
            return false;
        }
        cvul cvulVar = (cvul) obj;
        return ffkj.e(this.a, cvulVar.a) && ffkj.e(this.b, cvulVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazyContactUiData(id=" + this.a + ", initializer=" + this.b + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzvb extends dzwi {
    private final dzwf a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;

    public dzvb(dzwf dzwfVar, int i, int i2, int i3, int i4, boolean z) {
        this.a = dzwfVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z;
    }

    @Override // defpackage.dzwi
    public final int a() {
        return this.e;
    }

    @Override // defpackage.dzwi
    public final int b() {
        return this.d;
    }

    @Override // defpackage.dzwi
    public final int c() {
        return this.b;
    }

    @Override // defpackage.dzwi
    public final int d() {
        return this.c;
    }

    @Override // defpackage.dzwi
    public final dzwf e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzwi) {
            dzwi dzwiVar = (dzwi) obj;
            if (this.a.equals(dzwiVar.e()) && this.b == dzwiVar.c() && this.c == dzwiVar.d() && this.d == dzwiVar.b() && this.e == dzwiVar.a() && this.f == dzwiVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzwi
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.f ? 1237 : 1231;
        int i2 = this.b;
        int i3 = ((hashCode * 1000003) ^ i2) * 1000003;
        return ((((((i3 ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ i;
    }

    public final String toString() {
        return "UiElement{element=" + String.valueOf(this.a) + ", paddingStart=" + this.b + ", paddingTop=" + this.c + ", paddingEnd=" + this.d + ", paddingBottom=" + this.e + ", useIncomingOutgoingColors=" + this.f + "}";
    }
}

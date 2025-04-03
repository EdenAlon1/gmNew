package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuh extends dzvd {
    public final int a;
    public final String b;
    public final engw c;

    public dzuh(int i, String str, engw engwVar) {
        this.a = i;
        this.b = str;
        this.c = engwVar;
    }

    @Override // defpackage.dzvd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzvd
    public final engw b() {
        return this.c;
    }

    @Override // defpackage.dzvd
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvd) {
            dzvd dzvdVar = (dzvd) obj;
            if (this.a == dzvdVar.a() && this.b.equals(dzvdVar.c()) && enkr.h(this.c, dzvdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CardCarousel{cardWidth=" + this.a + ", jsonSource=" + this.b + ", cards=" + String.valueOf(this.c) + "}";
    }
}

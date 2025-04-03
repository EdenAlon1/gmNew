package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dglz extends dgmb {
    public final String a;
    public final int b;
    public final String c;

    public dglz(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // defpackage.dgmb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dgmb
    public final String b() {
        return this.c;
    }

    @Override // defpackage.dgmb
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgmb) {
            dgmb dgmbVar = (dgmb) obj;
            if (this.a.equals(dgmbVar.c()) && this.b == dgmbVar.a() && this.c.equals(dgmbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "UdevsSpec{hostName=" + this.a + ", hostPort=" + this.b + ", apiKey=" + this.c + "}";
    }
}

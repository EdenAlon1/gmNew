package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzux extends dzvz {
    public final String a;
    public final int b;
    public final int c;

    public dzux(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.dzvz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dzvz
    public final int b() {
        return this.c;
    }

    @Override // defpackage.dzvz
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvz) {
            dzvz dzvzVar = (dzvz) obj;
            if (this.a.equals(dzvzVar.c()) && this.b == dzvzVar.a() && this.c == dzvzVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "StatusBadge{text=" + this.a + ", backgroundColor=" + this.b + ", textColor=" + this.c + "}";
    }
}

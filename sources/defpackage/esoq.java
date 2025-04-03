package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esoq extends esor {
    private final eyee a;
    private final eyee b;

    public esoq(eyee eyeeVar, eyee eyeeVar2) {
        this.a = eyeeVar;
        this.b = eyeeVar2;
    }

    @Override // defpackage.esor
    public final eyee a() {
        return this.b;
    }

    @Override // defpackage.esor
    public final eyee b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esor) {
            esor esorVar = (esor) obj;
            if (this.a.equals(esorVar.b()) && this.b.equals(esorVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eyee eyeeVar = this.b;
        return "Curve25519KeyPair{publicKey=" + this.a.toString() + ", privateKey=" + eyeeVar.toString() + "}";
    }
}

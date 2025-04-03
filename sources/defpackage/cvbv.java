package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvbv extends cvdb {
    private final cvas a;
    private final enhk b;
    private final enhk c;

    public cvbv(cvas cvasVar, enhk enhkVar, enhk enhkVar2) {
        if (cvasVar == null) {
            throw new NullPointerException("Null storedData");
        }
        this.a = cvasVar;
        this.b = enhkVar;
        this.c = enhkVar2;
    }

    @Override // defpackage.cvdb
    public final cvas a() {
        return this.a;
    }

    @Override // defpackage.cvdb
    public final enhk b() {
        return this.b;
    }

    @Override // defpackage.cvdb
    public final enhk c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvdb) {
            cvdb cvdbVar = (cvdb) obj;
            if (this.a.equals(cvdbVar.a()) && ennc.m(this.b, cvdbVar.b()) && ennc.m(this.c, cvdbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "VerifiedSmsDataWithDecryptedKeyPairs{storedData=" + this.a.toString() + ", activeKeyPairs=" + ennc.g(this.b) + ", evictedKeyPairs=" + ennc.g(this.c) + "}";
    }
}

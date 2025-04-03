package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvbu extends cvda {
    private final eyee a;
    private final eyja b;

    public cvbu(eyee eyeeVar, eyja eyjaVar) {
        this.a = eyeeVar;
        if (eyjaVar == null) {
            throw new NullPointerException("Null creationTime");
        }
        this.b = eyjaVar;
    }

    @Override // defpackage.cvda
    public final eyee a() {
        return this.a;
    }

    @Override // defpackage.cvda
    public final eyja b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvda) {
            cvda cvdaVar = (cvda) obj;
            if (this.a.equals(cvdaVar.a()) && this.b.equals(cvdaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eyja eyjaVar = this.b;
        return "DecryptedKeyPair{publicKey=" + this.a.toString() + ", creationTime=" + eyjaVar.toString() + "}";
    }
}

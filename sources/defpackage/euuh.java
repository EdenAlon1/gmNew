package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euuh extends euut {
    private final String a;
    private final long b;
    private final long c;

    public euuh(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.euut
    public final long a() {
        return this.c;
    }

    @Override // defpackage.euut
    public final long b() {
        return this.b;
    }

    @Override // defpackage.euut
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euut) {
            euut euutVar = (euut) obj;
            if (this.a.equals(euutVar.c()) && this.b == euutVar.b() && this.c == euutVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        long j2 = j ^ (j >>> 32);
        long j3 = this.b;
        return (((hashCode * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }
}

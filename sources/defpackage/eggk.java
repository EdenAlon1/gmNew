package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggk extends egee {
    private final String a;
    private final String b;
    private final long c;
    private final long d;

    public eggk(String str, String str2, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.egee
    public final long a() {
        return this.c;
    }

    @Override // defpackage.egee
    public final long b() {
        return this.d;
    }

    @Override // defpackage.egee
    public final String c() {
        return this.a;
    }

    @Override // defpackage.egee
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egee) {
            egee egeeVar = (egee) obj;
            if (this.a.equals(egeeVar.c()) && this.b.equals(egeeVar.d()) && this.c == egeeVar.a() && this.d == egeeVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.d;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        return (((hashCode * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "ArtCollection{name=" + this.a + ", url=" + this.b + ", id=" + this.c + ", numImages=" + this.d + "}";
    }
}

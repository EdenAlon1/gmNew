package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elkh extends elkv {
    public final ecda a;
    public final fgmh b;
    public final long c;
    public final long d;
    public final boolean e;
    public final fgom f;
    public final fgrg g;

    public elkh(ecda ecdaVar, fgmh fgmhVar, long j, long j2, boolean z, fgom fgomVar, fgrg fgrgVar) {
        this.a = ecdaVar;
        this.b = fgmhVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        if (fgomVar == null) {
            throw new NullPointerException("Null trace");
        }
        this.f = fgomVar;
        if (fgrgVar == null) {
            throw new NullPointerException("Null traceMetadata");
        }
        this.g = fgrgVar;
    }

    @Override // defpackage.elkv
    public final long a() {
        return this.d;
    }

    @Override // defpackage.elkv
    public final long b() {
        return this.c;
    }

    @Override // defpackage.elkv
    public final ecda c() {
        return this.a;
    }

    @Override // defpackage.elkv
    public final fgmh d() {
        return this.b;
    }

    @Override // defpackage.elkv
    public final fgom e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        fgmh fgmhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof elkv) {
            elkv elkvVar = (elkv) obj;
            if (this.a.equals(elkvVar.c()) && ((fgmhVar = this.b) != null ? fgmhVar.equals(elkvVar.d()) : elkvVar.d() == null) && this.c == elkvVar.b() && this.d == elkvVar.a() && this.e == elkvVar.g() && this.f.equals(elkvVar.e()) && this.g.equals(elkvVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.elkv
    public final fgrg f() {
        return this.g;
    }

    @Override // defpackage.elkv
    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        fgmh fgmhVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (fgmhVar == null ? 0 : fgmhVar.hashCode())) * 1000003;
        long j = this.c;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        return ((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "TraceData{eventName=" + this.a.a + ", metricExtension=" + String.valueOf(this.b) + ", startTime=" + this.c + ", endTime=" + this.d + ", empty=" + this.e + ", trace=" + this.f.toString() + ", traceMetadata=" + this.g.toString() + "}";
    }
}

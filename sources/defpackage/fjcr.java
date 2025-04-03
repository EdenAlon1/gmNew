package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcr extends fhhe {
    private final fhgn a;
    private final long b;

    public fjcr(fhgn fhgnVar, long j) {
        this.a = fhgnVar;
        this.b = j;
    }

    @Override // defpackage.fhhe
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fhhe
    public final fhgn b() {
        return this.a;
    }

    @Override // defpackage.fhhe
    public final fhmv c() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}

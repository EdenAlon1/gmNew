package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkc implements kev {
    private final long a;

    public dkc(long j) {
        this.a = j;
    }

    @Override // defpackage.kev
    public final long a(kac kacVar, long j, kah kahVar, long j2) {
        boolean z = kahVar == kah.a;
        long j3 = this.a;
        return (dkd.a(kacVar.b + kaa.a(j3), (int) (j2 >> 32), (int) (j >> 32), z) << 32) | (dkd.a(kacVar.c + kaa.b(j3), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L);
    }
}

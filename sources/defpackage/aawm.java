package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawm implements ijf {
    private final ffix a;
    private final zpd b;

    public aawm(zpd zpdVar, ffix ffixVar) {
        this.b = zpdVar;
        this.a = ffixVar;
    }

    @Override // defpackage.ijf
    public final long a(long j, long j2, int i) {
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f && Float.intBitsToFloat((int) (j2 & 4294967295L)) < 0.0f) {
            this.b.b(0.0f);
            return 0L;
        }
        zpd zpdVar = this.b;
        zpdVar.b(((zpc) zpdVar.a.c()).b + Float.intBitsToFloat(i2));
        return 0L;
    }

    @Override // defpackage.ijf
    public final long b(long j, int i) {
        if (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f || !ijq.a(i, 1)) {
            return 0L;
        }
        this.a.invoke();
        return 0L;
    }

    @Override // defpackage.ijf
    public final /* synthetic */ Object c(long j, long j2, ffgu ffguVar) {
        return new kan(0L);
    }

    @Override // defpackage.ijf
    public final /* synthetic */ Object d(long j, ffgu ffguVar) {
        return new kan(0L);
    }
}

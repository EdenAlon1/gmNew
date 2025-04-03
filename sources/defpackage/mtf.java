package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtf extends lru {
    private final lqw b;

    public mtf(lqw lqwVar) {
        this.b = lqwVar;
    }

    @Override // defpackage.lru
    public final int a(Object obj) {
        return obj == mte.c ? 0 : -1;
    }

    @Override // defpackage.lru
    public final int b() {
        return 1;
    }

    @Override // defpackage.lru
    public final int c() {
        return 1;
    }

    @Override // defpackage.lru
    public final lrs d(int i, lrs lrsVar, boolean z) {
        lrsVar.l(z ? 0 : null, z ? mte.c : null, 0, -9223372036854775807L, 0L, lph.a, true);
        return lrsVar;
    }

    @Override // defpackage.lru
    public final lrt e(int i, lrt lrtVar, long j) {
        lrtVar.d(lrt.a, this.b, false, true, null, -9223372036854775807L);
        lrtVar.k = true;
        return lrtVar;
    }

    @Override // defpackage.lru
    public final Object f(int i) {
        return mte.c;
    }
}

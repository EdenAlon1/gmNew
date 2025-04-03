package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvg extends lru {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final boolean e;
    private final lqw f;
    private final lqs g;

    static {
        lql lqlVar = new lql();
        lqlVar.b("SinglePeriodTimeline");
        lqlVar.a = Uri.EMPTY;
        lqlVar.a();
    }

    public mvg(long j, boolean z, boolean z2, lqw lqwVar) {
        lqs lqsVar = z2 ? lqwVar.c : null;
        this.c = j;
        this.d = j;
        this.e = z;
        lti.f(lqwVar);
        this.f = lqwVar;
        this.g = lqsVar;
    }

    @Override // defpackage.lru
    public final int a(Object obj) {
        return b.equals(obj) ? 0 : -1;
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
        lti.e(i, 1);
        lrsVar.n(null, z ? b : null, this.c, 0L);
        return lrsVar;
    }

    @Override // defpackage.lru
    public final lrt e(int i, lrt lrtVar, long j) {
        lti.e(i, 1);
        lrtVar.d(lrt.a, this.f, this.e, false, this.g, this.d);
        return lrtVar;
    }

    @Override // defpackage.lru
    public final Object f(int i) {
        lti.e(i, 1);
        return b;
    }
}

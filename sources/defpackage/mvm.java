package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvm extends mta {
    private final lqw c;

    public mvm(lru lruVar, lqw lqwVar) {
        super(lruVar);
        this.c = lqwVar;
    }

    @Override // defpackage.mta, defpackage.lru
    public final lrt e(int i, lrt lrtVar, long j) {
        super.e(i, lrtVar, j);
        lqw lqwVar = this.c;
        lrtVar.d = lqwVar;
        lqt lqtVar = lqwVar.b;
        lrtVar.c = null;
        return lrtVar;
    }
}

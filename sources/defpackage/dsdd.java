package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsdd extends tx {
    private final ffix c;

    public dsdd(dsek dsekVar, ffix ffixVar) {
        dsekVar.getClass();
        this.c = ffixVar;
    }

    @Override // defpackage.tx
    public final int b(int i) {
        if (dsek.m(i) - 1 != 0) {
            return 1;
        }
        return ((Number) this.c.invoke()).intValue();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjc implements rji {
    private final int a;
    private final boolean b;
    private rjd c;

    protected rjc(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.rji
    public final rjh a(qsy qsyVar) {
        if (qsyVar == qsy.MEMORY_CACHE) {
            return rjf.a;
        }
        if (this.c == null) {
            this.c = new rjd(this.a, this.b);
        }
        return this.c;
    }
}

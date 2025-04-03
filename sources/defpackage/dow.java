package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dow extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dpb c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dow(dpb dpbVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dpbVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.s(this);
    }
}

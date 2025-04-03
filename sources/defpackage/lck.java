package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lck extends ffhr {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ lcm d;
    int e;
    lcm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lck(lcm lcmVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = lcmVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lca extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ lcc b;
    int c;
    ffkz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lca(lcc lccVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = lccVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, false, this);
    }
}

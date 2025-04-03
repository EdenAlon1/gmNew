package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbm extends ffhr {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ lcc d;
    int e;
    lcc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbm(lcc lccVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = lccVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i(false, this);
    }
}

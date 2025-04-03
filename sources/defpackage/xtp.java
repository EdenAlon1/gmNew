package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xtp extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ xuk c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtp(xuk xukVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = xukVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object e = this.c.e(null, this);
        return e == ffhh.a ? e : new xti((xhp) e);
    }
}

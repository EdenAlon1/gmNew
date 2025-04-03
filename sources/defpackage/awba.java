package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awba extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ awbc d;
    int e;
    awbc f;
    awai g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awba(awbc awbcVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = awbcVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, this);
    }
}

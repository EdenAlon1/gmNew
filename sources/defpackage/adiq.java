package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adiq extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ adir c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adiq(adir adirVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = adirVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

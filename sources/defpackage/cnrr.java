package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnrr extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cnru d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnrr(cnru cnruVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = cnruVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}

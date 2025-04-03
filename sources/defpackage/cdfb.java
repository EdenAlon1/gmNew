package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdfb extends ffhr {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ cdfd d;
    int e;
    cdfd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdfb(cdfd cdfdVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = cdfdVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(0, null, this);
    }
}

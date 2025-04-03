package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aarz extends ffhr {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ aasc d;
    int e;
    aasc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aarz(aasc aascVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = aascVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(0, this);
    }
}

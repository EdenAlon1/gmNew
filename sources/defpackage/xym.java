package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xym extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ xyn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xym(xyn xynVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = xynVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, null, this);
    }
}

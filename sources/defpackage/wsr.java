package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wsr extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ wsv d;
    int e;
    wsv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsr(wsv wsvVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = wsvVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}

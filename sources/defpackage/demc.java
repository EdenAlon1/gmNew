package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class demc extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ deme b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public demc(deme demeVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = demeVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}

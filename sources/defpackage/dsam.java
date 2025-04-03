package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsam extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ dsao b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsam(dsao dsaoVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = dsaoVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, null, 0, this);
    }
}

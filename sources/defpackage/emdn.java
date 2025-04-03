package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emdn extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ emdw b;
    int c;
    emdw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emdn(emdw emdwVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = emdwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(0, null, this);
    }
}

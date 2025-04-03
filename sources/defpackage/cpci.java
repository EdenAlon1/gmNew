package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpci extends ffhr {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cpck c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpci(cpck cpckVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = cpckVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(0, this);
    }
}

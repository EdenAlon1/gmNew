package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpfd extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ cpff b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpfd(cpff cpffVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cpffVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return cpfa.b(this.b, this);
    }
}

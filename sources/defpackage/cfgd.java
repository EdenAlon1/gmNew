package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfgd extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ cfgt b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgd(cfgt cfgtVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cfgtVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}

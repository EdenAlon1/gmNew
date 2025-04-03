package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpfd extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ dpfe b;
    int c;
    dpfe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfd(dpfe dpfeVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = dpfeVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}

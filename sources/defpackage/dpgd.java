package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpgd extends ffhr {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dpge c;
    int d;
    dpge e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpgd(dpge dpgeVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dpgeVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}

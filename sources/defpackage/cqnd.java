package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqnd extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ cqnv b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqnd(cqnv cqnvVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cqnvVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0L, null, 0, this);
    }
}

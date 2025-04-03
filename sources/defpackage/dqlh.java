package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqlh extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ dqlp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqlh(dqli dqliVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = (dqlp) dqliVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return dqlg.a(this.c, null, false, this);
    }
}

package defpackage;

/* loaded from: classes4.dex */
public final class dsle extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ dslf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsle(dslf dslfVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dslfVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

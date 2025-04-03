package defpackage;

/* loaded from: classes2.dex */
public final class xro extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ xrp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xro(xrp xrpVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = xrpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

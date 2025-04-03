package defpackage;

/* loaded from: classes4.dex */
public final class dslb extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ dslc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dslb(dslc dslcVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dslcVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

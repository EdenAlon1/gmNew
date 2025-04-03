package defpackage;

/* loaded from: classes8.dex */
public final class cjfb extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cjfc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfb(cjfc cjfcVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = cjfcVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

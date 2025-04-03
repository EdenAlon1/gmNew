package defpackage;

/* loaded from: classes2.dex */
public final class xnt extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ xnu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnt(xnu xnuVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = xnuVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

package defpackage;

/* loaded from: classes6.dex */
public final class fgbo extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ fgbp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgbo(fgbp fgbpVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = fgbpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

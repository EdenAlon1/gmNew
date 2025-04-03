package defpackage;

/* loaded from: classes2.dex */
public final class abps extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ abpt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abps(abpt abptVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = abptVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

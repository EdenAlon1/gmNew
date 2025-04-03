package defpackage;

/* loaded from: classes2.dex */
public final class aboc extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ abod c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aboc(abod abodVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = abodVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

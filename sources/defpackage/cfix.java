package defpackage;

/* loaded from: classes7.dex */
public final class cfix extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cfiy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfix(cfiy cfiyVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = cfiyVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

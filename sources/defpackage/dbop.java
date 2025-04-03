package defpackage;

/* loaded from: classes3.dex */
public final class dbop extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ dboq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbop(dboq dboqVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dboqVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

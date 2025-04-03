package defpackage;

/* loaded from: classes3.dex */
public final class dbos extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ dbot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbos(dbot dbotVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dbotVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class dbov extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ dbow c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbov(dbow dbowVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dbowVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

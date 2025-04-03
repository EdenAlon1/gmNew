package defpackage;

/* loaded from: classes4.dex */
public final class drtf extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ drtg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drtf(drtg drtgVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = drtgVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

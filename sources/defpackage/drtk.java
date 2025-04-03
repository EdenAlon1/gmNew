package defpackage;

/* loaded from: classes4.dex */
public final class drtk extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ drtl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drtk(drtl drtlVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = drtlVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}

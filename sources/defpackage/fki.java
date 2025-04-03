package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fki extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ fkk c;
    int d;
    fkk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fki(fkk fkkVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = fkkVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}

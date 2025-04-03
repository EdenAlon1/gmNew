package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dser extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ dsey b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dser(dsey dseyVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = dseyVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, 0, this);
    }
}

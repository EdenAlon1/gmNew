package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpcs extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dpcz c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpcs(dpcz dpczVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dpczVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}

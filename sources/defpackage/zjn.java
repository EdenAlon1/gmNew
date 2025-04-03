package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjn extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ int b;
    /* synthetic */ boolean c;
    final /* synthetic */ zjt d;
    final /* synthetic */ fgdj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjn(zjt zjtVar, fgdj fgdjVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = zjtVar;
        this.e = fgdjVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        zjn zjnVar = new zjn(this.d, this.e, (ffgu) obj4);
        zjnVar.a = (engw) obj;
        zjnVar.b = intValue;
        zjnVar.c = booleanValue;
        return zjnVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        int i = this.b;
        boolean z = this.c;
        int a = this.d.a();
        final fgdj fgdjVar = this.e;
        return new zjv((engw) obj2, i > a, z, new ffix() { // from class: zjm
            /* JADX WARN: Type inference failed for: r0v0, types: [fgcm, fgdj] */
            @Override // defpackage.ffix
            public final Object invoke() {
                fgdj.this.f(false);
                return ffcu.a;
            }
        });
    }
}

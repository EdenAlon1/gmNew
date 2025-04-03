package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ hho c;
    final /* synthetic */ kei d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cywb(boolean z, hho hhoVar, kei keiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = hhoVar;
        this.d = keiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cywb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            float floatValue = ((Number) this.c.a()).floatValue();
            float f = true != this.b ? 0.43f : 1.0f;
            final kei keiVar = this.d;
            final hho hhoVar = this.c;
            dbu c = cxu.c(300, 0, null, 6);
            ffjm ffjmVar = new ffjm() { // from class: cywa
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    Float f2 = (Float) obj2;
                    float floatValue2 = f2.floatValue();
                    ((Float) obj3).floatValue();
                    hhoVar.b(f2);
                    kei.this.a().setDimAmount(floatValue2);
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (dap.h(floatValue, f, c, ffjmVar, this, 4) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cywb(this.b, this.c, this.d, ffguVar);
    }
}

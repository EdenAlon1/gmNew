package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eeq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeq(eey eeyVar, int i, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eeq) c((drd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drd drdVar = (drd) this.e;
            eey eeyVar = this.b;
            een eenVar = new een(drdVar, eeyVar);
            int i2 = this.c;
            int i3 = this.d;
            jzn f = eeyVar.f();
            this.a = 1;
            if (ekr.a(eenVar, i2, i3, 100, f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        eeq eeqVar = new eeq(this.b, this.c, this.d, ffguVar);
        eeqVar.e = obj;
        return eeqVar;
    }
}

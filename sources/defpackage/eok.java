package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eok extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eot b;
    final /* synthetic */ int c;
    final /* synthetic */ float d;
    final /* synthetic */ cxt e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eok(eot eotVar, int i, float f, cxt cxtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eotVar;
        this.c = i;
        this.d = f;
        this.e = cxtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eok) c((drd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int f;
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drd drdVar = (drd) this.f;
            eot eotVar = this.b;
            eof eofVar = new eof(drdVar, eotVar);
            int i2 = this.c;
            float f2 = this.d;
            cxt cxtVar = this.e;
            eoj eojVar = new eoj(eotVar);
            this.a = 1;
            eob eobVar = eoy.a;
            eojVar.a(eofVar, new Integer(i2));
            int b = eofVar.b();
            int d = eofVar.d() - eofVar.b();
            boolean z = i2 > b;
            if (((z && i2 > eofVar.d()) || (!z && i2 < eofVar.b())) && Math.abs(i2 - eofVar.b()) >= 3) {
                int i3 = d + 1;
                eofVar.a.u(z ? ffmk.f(i2 - i3, eofVar.b()) : ffmk.g(i3 + i2, eofVar.b()), 0.0f / eofVar.a.l(), true);
            }
            f = eofVar.f(i2);
            Object h = dap.h(0.0f, f + f2, cxtVar, new eow(new ffky(), eofVar), this, 4);
            if (h != ffhh.a) {
                h = ffcu.a;
            }
            if (h == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        eok eokVar = new eok(this.b, this.c, this.d, this.e, ffguVar);
        eokVar.f = obj;
        return eokVar;
    }
}

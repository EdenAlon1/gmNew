package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xjm extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ xle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjm(xle xleVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = xleVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xjm xjmVar = new xjm(this.d, (ffgu) obj3);
        xjmVar.b = (alxi) obj;
        xjmVar.c = (xis) obj2;
        return xjmVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        int i;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = (xis) this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            alxi alxiVar = (alxi) this.b;
            Object obj3 = this.c;
            ffxx b = xle.b(xle.a(alxiVar, (xis) obj3, new xlz(false, false, false)), new ffyg(new xli(false, null)));
            this.b = obj3;
            this.a = 1;
            obj = fgbj.a(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            obj2 = obj3;
        }
        xlp xlpVar = (xlp) obj;
        if (ffkj.e(xlpVar, xlj.a)) {
            i = 20;
        } else if (ffkj.e(xlpVar, xlk.a)) {
            i = ((xis) obj2).c.h ? 40 : 30;
        } else if (xlpVar instanceof xlm) {
            i = 11;
        } else {
            if (!(xlpVar instanceof xln) && !(xlpVar instanceof xll)) {
                throw new ffcd();
            }
            i = 10;
        }
        return new xlr(i);
    }
}
